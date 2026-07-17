package carro.lexus.is.gr.mantenimiento.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;

//@Data
@Table(name = "[Lexus IS350 2006]")
@Entity
public class LexusIs3502006 {

    public LexusIs3502006 () {}

    public LexusIs3502006(Integer codigo, LocalDateTime fecha, String piezaOGastos, Double monto) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.piezaOGastos = piezaOGastos;
        this.monto = monto;
    }

    @Id
    @Column(name = "Codigo")
    private Integer codigo;

    @Column(name = "Fecha")
    private LocalDateTime fecha;

    @Column(name = "Pieza o Gastos")
    private String piezaOGastos;

    @Column(name = "Monto")
    private Double monto;

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public void setPiezaOGastos(String piezaOGastos) {
        this.piezaOGastos = piezaOGastos;
    }

    public Integer getCodigo(){
        return codigo;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public String getPiezaOGastos() {
        return piezaOGastos;
    }

    public Double getMonto() {
        return monto;
    }
}
