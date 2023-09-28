package com.example.subastasquindio.model;

public class Puja {

    private String direccion ;
    private String codigo;
    private Double ofertaInicial;
    private String fechaPuja;

    public Puja() {
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getOfertaInicial() {
        return ofertaInicial;
    }

    public void setOfertaInicial(Double ofertaInicial) {
        this.ofertaInicial = ofertaInicial;
    }

    public String getFechaPuja() {
        return fechaPuja;
    }

}
