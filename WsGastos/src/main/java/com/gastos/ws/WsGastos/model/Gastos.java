package com.gastos.ws.WsGastos.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "Gastos")
public class Gastos {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Codigo")
    private Integer codigo;

    @Column(name = "DineroConsumido")
    private BigDecimal dineroConsumido;

    @Column(name = "NombreGasto")
    private String nombreGasto;

    @Column(name = "Fecha")
    private LocalDateTime fecha;

    @Column(name = "FuenteDeGasto")
    private String fuenteDeGasto;

}
