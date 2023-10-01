package com.example.subastasquindio.model;

public class Producto {

    public static int contador = 0;

    private int id;
    private TipoArticulo tipoArticulo;
    private String nombre;

    public Producto() {
        this.id = ++contador;
    }

    public TipoArticulo getTipoArticulo() {
        return tipoArticulo;
    }

    public void setTipoArticulo(TipoArticulo tipoArticulo) {
        this.tipoArticulo = tipoArticulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public static void setContador(int contador) {
        Producto.contador = contador;
    }

    public static int getContador() {
        return contador;
    }

    public void setId(int id) {
        this.id = id;
    }
}
