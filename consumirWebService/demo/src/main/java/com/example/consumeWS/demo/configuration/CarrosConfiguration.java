package com.example.consumeWS.demo.configuration;

import com.example.consumeWS.demo.cliente.CarrosCliente;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class CarrosConfiguration {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.example.consumeWS.demo.wsdl");
        return marshaller;
    }

    @Bean
    public CarrosCliente carrosCliente(Jaxb2Marshaller marshaller){
        CarrosCliente carro = new CarrosCliente();
        carro.setDefaultUri("http://localhost:8080/ws");
        carro.setMarshaller(marshaller);
        carro.setUnmarshaller(marshaller);
        return carro;
    }
}
