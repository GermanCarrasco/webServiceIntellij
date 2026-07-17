package com.example.carros2.demo.web.services.carros2.endpoint;

import com.example.carros2.demo.web.services.carros2.model.CarrosModel;
import com.example.carros2.demo.web.services.carros2.repository.IMarcaRepository;
import com.example.carros2.demo.web.services.carros2.service.CarrosServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import carros2_jar_maven_ws.io.spring.GetCarroResponse;
import carros2_jar_maven_ws.io.spring.SetCarroRequest;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import carros2_jar_maven_ws.io.spring.GetMarcaRequest;
import carros2_jar_maven_ws.io.spring.GetMarcaResponse;
import carros2_jar_maven_ws.io.spring.Marca;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


@Endpoint
public class CarrosEndPoint {

    private static final String NAMESPACE_URI = "http://spring.io.carros2-jar-maven-ws";

    @Autowired
    private CarrosServiceImpl service;

    @Autowired
    private IMarcaRepository repository;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "setCarroRequest")
    @ResponsePayload
    public GetCarroResponse setCarro(@RequestPayload SetCarroRequest setCarroRequest) {
        GetCarroResponse response = new GetCarroResponse();

        CarrosModel carroImprimir,carroCrear = new CarrosModel();

        carroCrear.setMarca(setCarroRequest.getMarca());
        carroCrear.setModelo(setCarroRequest.getModelo());
        carroCrear.setVersion(setCarroRequest.getVersion());
        carroCrear.setAño(setCarroRequest.getAño());
        carroCrear.setCilindrada(setCarroRequest.getCilindrada());
        carroCrear.setPotencia(setCarroRequest.getPotencia());
        carroCrear.setId(setCarroRequest.getId());

        carroImprimir = service.create(carroCrear);
        System.out.println("Carro creado: " + carroImprimir);
        if (carroImprimir!=null) {
            Integer id = carroImprimir.getId();
            response.setIdRespuesta(id);
            return response;
        } else {
            response.setIdRespuesta(0);
            return response;
        }

    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getMarcaRequest")
    @ResponsePayload
    public GetMarcaResponse getMarcar(@RequestPayload GetMarcaRequest getMarcaRequest) {
        GetMarcaResponse response = new GetMarcaResponse();
        List<Marca> marcas = new ArrayList<>();
        String marca = getMarcaRequest.getMarca();
        System.out.println("La marca: " + marca);
        List<CarrosModel> carrosModels = repository.findByMarca(marca);
        carrosModels.forEach(m2 -> {
            Marca m = new Marca();
            m.setAño(m2.getAño());
            m.setCilindrada(m2.getCilindrada());
            m.setMarca(m2.getMarca());
            m.setModelo(m2.getModelo());
            m.setVersion(m2.getVersion());
            m.setCilindrada(m2.getCilindrada());
            m.setPotencia(m2.getPotencia());
            marcas.add(m);
        });
        response.setMarca(marcas);
        return response;
    }

}
