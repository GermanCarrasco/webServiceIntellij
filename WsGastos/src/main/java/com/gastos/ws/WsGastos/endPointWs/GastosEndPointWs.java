package com.gastos.ws.WsGastos.endPointWs;

import com.gastos.ws.WsGastos.config.WSSecurityInterceptor;
import com.gastos.ws.WsGastos.model.Gastos;
import com.gastos.ws.WsGastos.repositoryWs.GastosRepository;
import gastos_web_service.ws.spring.Gasto;
import gastos_web_service.ws.spring.GetGastosRequest;
import gastos_web_service.ws.spring.GetGastosResponse;
import org.apache.cxf.annotations.SchemaValidation;
import org.apache.cxf.interceptor.InInterceptors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.math.BigInteger;
import java.util.Optional;

@Endpoint
@InInterceptors(classes = WSSecurityInterceptor.class)
@SchemaValidation(type = SchemaValidation.SchemaValidationType.REQUEST)
public class GastosEndPointWs {
    //Aqui mi uri
    private static final String NAMESPACE_URI = "http://spring.ws.gastos-web-service";

    //Aqui el repositorio para consumir
    @Autowired
    private GastosRepository gastosRepository;

    @Autowired
    public GastosEndPointWs(GastosRepository gastosRepository){
        this.gastosRepository = gastosRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI,localPart = "getGastosRequest")
    @ResponsePayload
    public GetGastosResponse getGasto(@RequestPayload GetGastosRequest getGastosRequest) {
        GetGastosResponse response = new GetGastosResponse();
        Gasto gastoWs = new Gasto();
        Optional<Gastos> modelo = Optional.of(new Gastos());
        modelo = gastosRepository.getGastoById(getGastosRequest.getCodigo());
        //llenar gastoWs
        gastoWs.setCodigo(BigInteger.valueOf(getGastosRequest.getCodigo()));
        gastoWs.setFecha(String.valueOf(modelo.get().getFecha()));
        gastoWs.setNombreGasto(modelo.get().getNombreGasto());
        gastoWs.setDineroConsumido(Double.valueOf(String.valueOf(modelo.get().getDineroConsumido())));
        response.setGasto(gastoWs);
        return response;
    }



}
