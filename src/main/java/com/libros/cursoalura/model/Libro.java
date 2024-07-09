package com.libros.cursoalura.model;

import jakarta.persistence.*;

import java.util.List;


public class Libro {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
//    @Column(unique = true)
    private String nombreLibro;
    private String autor;
    private String idioma;
    private Double cantidadDescargas;

    public Libro(DatosLibros datosLibros) {
        this.nombreLibro =  nombreLibro;
        this.autor = autor;
        this.idioma = idioma;
        this.cantidadDescargas = cantidadDescargas;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Double getCantidadDescargas() {
        return cantidadDescargas;
    }

    public void setCantidadDescargas(Double cantidadDescargas) {
        this.cantidadDescargas = cantidadDescargas;
    }
}
