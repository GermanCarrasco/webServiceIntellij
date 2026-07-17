package com.german.carros.creacionCarros.endPoint;

import com.german.carros.creacionCarros.repository.marcaRepository;
import io.spring.guia.agencia_carros_ws.GetModelosMarcaRequest;
import io.spring.guia.agencia_carros_ws.GetModelosMarcaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ModelosEndPoint {
    private static final String NAMESPACE_URI = "http://spring.io/guia/agencia-carros-ws";
    private marcaRepository repository;
    @Autowired
    public ModelosEndPoint(marcaRepository repository){
        this.repository = repository;
    }
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getModelosMarcaRequest")
    @ResponsePayload
    public GetModelosMarcaResponse getmodelos(@RequestPayload GetModelosMarcaRequest request){
       GetModelosMarcaResponse respuesta = new GetModelosMarcaResponse();
       respuesta.setModelosByMarca(repository.findModelos(request.getMarca()));
       return respuesta;
    }
}
