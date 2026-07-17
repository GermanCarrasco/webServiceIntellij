package com.ws.manga.Mangas.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "WatchManga")
public class Manga {

    public Manga () {}

    public Manga (Integer codigo,String nombreAnime,Integer capitulo,LocalDateTime dia) {
        this.codigo = codigo;
        this.nombreAnime = nombreAnime;
        this.capitulo = capitulo;
        this.dia = dia;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer codigo;
    @Column(name = "TITULO")
    private String nombreAnime;
    @Column(name = "CAPITULO")
    private Integer capitulo;
    @Column(name = "FECHA")
    private LocalDateTime dia;

    public void setCodigo (Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo () {
        return this.codigo;
    }

    public String getNombreAnime() {
        return nombreAnime;
    }

    public void setNombreAnime(String nombreAnime) {
        this.nombreAnime = nombreAnime;
    }

    public Integer getCapitulo() {
        return capitulo;
    }

    public void setCapitulo(Integer capitulo) {
        this.capitulo = capitulo;
    }

    public LocalDateTime getDia() {
        return dia;
    }

    public void setDia(LocalDateTime dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "codigo=" + codigo +
                ", nombreAnime='" + nombreAnime + '\'' +
                ", capitulo=" + capitulo +
                ", dia=" + dia +
                '}';
    }
}
