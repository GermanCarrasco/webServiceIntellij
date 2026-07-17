package com.german.carros.creacionCarros.repository;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import io.spring.guia.agencia_carros_ws.ModelosByMarca;
import org.springframework.util.Assert;

import java.util.*;

@Component
public class marcaRepository {

//    private static final ModelosByMarca modelosByMarca = new ModelosByMarca();
    List<ModelosByMarca> lexus = new ArrayList<>();
    List<ModelosByMarca> bmw = new ArrayList<>();
    @PostConstruct
    public void initialData(){

       ModelosByMarca l = new ModelosByMarca();
        l.setModelo("Is350");
        l.setCilindrada("V6 3.5");
        l.setPotencia("308hp");
        l.setYear(2016);
        l.setColor("Blanco");
        l.setVersion("Sedan");
        lexus.add(l);



        ModelosByMarca b = new ModelosByMarca();
        b.setModelo("328i");
        b.setColor("Azul");
        b.setVersion("Sedan");
        b.setYear(2015);
        b.setCilindrada("v4 2.0T");
        b.setPotencia("250hp");
        bmw.add(b);

        ModelosByMarca b2 = new ModelosByMarca();
        b2.setModelo("335i");
        b2.setColor("Blanco");
        b2.setVersion("Sedan");
        b2.setYear(2013);
        b2.setCilindrada("v6 3.0T");
        b2.setPotencia("320hp");
        bmw.add(b2);
//        modelosByMarca.put("bmw",bmw);

        ModelosByMarca l2 = new ModelosByMarca();
        l2.setModelo("Is250");
        l2.setCilindrada("V6 2.5");
        l2.setPotencia("208hp");
        l2.setYear(2020);
        l2.setColor("Rojo");
        l2.setVersion("Sedan");
        lexus.add(l2);
//        modelosByMarca.put("lexus",lexus);

    }

    //Obtener lista de modelos
    public List<ModelosByMarca> findModelos(String marca){
        Assert.notNull(marca,"La marca no puede ser nula");
        if(marca.equals("lexus")){
            return  lexus;
        } else {
            return  bmw;
        }
    }

}
