package com.example.subastasquindio.model;

import com.example.subastasquindio.exceptions.ProductoException;
import com.example.subastasquindio.model.services.IProductoService;

import java.util.ArrayList;

public class Anunciante extends Persona implements IProductoService {

    private ArrayList<Anuncio> listaAnuncios = new ArrayList<>();
    private ArrayList<Producto> listaProductos = new ArrayList<>();

    public Anunciante() {
    }

    public ArrayList<Anuncio> getListaAnuncios() {
        return listaAnuncios;
    }

    public void setListaAnuncios(ArrayList<Anuncio> listaAnuncios) {
        this.listaAnuncios = listaAnuncios;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    @Override
    public boolean registrarProducto(String nombre, TipoArticulo t) throws ProductoException {
        Producto p = new Producto();
        p.setNombre(nombre);
        p.setTipoArticulo(t);
        if (obtenerProducto(nombre) != null) {
            listaProductos.add(p);
            return true;
        } else {
            throw new ProductoException("El producto " + nombre + " ya existe.");
        }
    }

    @Override
    public boolean actualizarProducto(String nombre,Producto producto) throws ProductoException {
        Producto pEncontrado = obtenerProducto(nombre);
        if(pEncontrado == null){
            throw new ProductoException("El producto "+ nombre +" no existe.");
        }else{
            pEncontrado.setNombre(producto.getNombre());
            pEncontrado.setTipoArticulo(producto.getTipoArticulo());
            return true;
        }
    }

    @Override
    public Producto obtenerProducto(String nombre) throws ProductoException {
        Producto productoEncontrado = null;
        for (Producto p : listaProductos) {
            if (p.getNombre().equals(nombre)) {
                productoEncontrado = p;
                break;
            }
        }
        return productoEncontrado;

    }

    @Override
    public boolean eliminarProducto(String nombre) throws ProductoException {
        Producto p = obtenerProducto(nombre);
        if (p != null) {
            listaProductos.remove(p);
            return true;
        } else {
            throw new ProductoException("El producto " + nombre + " no existe.");

        }
    }
}
