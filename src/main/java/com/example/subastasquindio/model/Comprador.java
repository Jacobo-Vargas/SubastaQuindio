package com.example.subastasquindio.model;

import java.util.ArrayList;

public class Comprador extends Persona{
    private String direccion;
    private final ArrayList<Puja> listaPujas = new ArrayList<>();

    public Comprador() {
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Puja> getListaPujas() {
        return listaPujas;
    }

}
