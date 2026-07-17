package com.example.consumeWS.demo.cliente;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import com.example.consumeWS.demo.wsdl.*;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class CarrosCliente extends WebServiceGatewaySupport {

    private static final String TNSURI = "http://localhost:8080/ws/carros";
    private static final Logger log = LoggerFactory.getLogger(CarrosCliente.class);

    public GetMarcaResponse getMarcaC(String marca) {
        GetMarcaResponse response = new GetMarcaResponse();
        GetMarcaRequest request = new GetMarcaRequest();
        request.setMarca(marca);

        log.info("Requesting location for " + marca);

        GetMarcaResponse rep = (GetMarcaResponse) getWebServiceTemplate()
                .marshalSendAndReceive(TNSURI,request,new SoapActionCallback("http://spring.io.carros2-jar-maven-ws/getMarcaRequest"));
        return rep;
    }
}
