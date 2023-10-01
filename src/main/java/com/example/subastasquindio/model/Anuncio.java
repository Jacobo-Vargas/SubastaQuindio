package com.example.subastasquindio.model;

import javafx.scene.image.Image;

import java.time.LocalDate;

public class Anuncio {

    private String codigoAnuncio;
    private Producto producto;
    private String descripcion;

    private float valorInicial;
    private Image foto;
    private String nombreAnunciante;
    private LocalDate fechaPublicacion;
    private LocalDate fechaFinPublicacion;

    public Anuncio() {
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(float valorInicial) {
        this.valorInicial = valorInicial;
    }

    public Image getFoto() {
        return foto;
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }

    public String getNombreAnunciante() {
        return nombreAnunciante;
    }

    public void setNombreAnunciante(String nombreAnunciante) {
        this.nombreAnunciante = nombreAnunciante;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public LocalDate getFechaFinPublicacion() {
        return fechaFinPublicacion;
    }

    public void setFechaFinPublicacion(LocalDate fechaFinPublicacion) {
        this.fechaFinPublicacion = fechaFinPublicacion;
    }

    public String getCodigoAnuncio() {
        return codigoAnuncio;
    }

    public void setCodigoAnuncio(String codigoAnuncio) {
        this.codigoAnuncio = codigoAnuncio;
    }
}
