package com.example.carros2.demo.web.services.carros2.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "carros", schema = "WebServices")
@Data
public class CarrosModel {

    @Column(name = "id")
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "marca")
    private String marca;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "version")
    private String version;

    @Column(name = "year")
    private Integer año;

    @Column(name = "cilindrada")
    private String cilindrada;

    @Column(name = "potencia")
    private String potencia;

}
