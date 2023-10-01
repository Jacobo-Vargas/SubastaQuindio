package com.example.subastasquindio.model;

import com.example.subastasquindio.exceptions.ProductoException;
import com.example.subastasquindio.model.services.IAnuncioService;
import com.example.subastasquindio.model.services.IProductoService;

import java.util.ArrayList;

public class Anunciante extends Persona implements IProductoService, IAnuncioService {

    private ArrayList<Anuncio> listaAnuncios = new ArrayList<>();
    private ArrayList<Producto> listaProductos = new ArrayList<>();

    private Usuario usuario;

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
    public boolean registrarProducto(Producto producto)  {
        if (obtenerProducto(producto.getId()) == null) {
            listaProductos.add(producto);
            return true;
        } else {
            return false;
           // throw new ProductoException("El producto " + producto.getId() + " ya existe.");
        }
    }

    @Override
    public boolean actualizarProducto(int id,Producto producto) throws ProductoException {
        Producto pEncontrado = obtenerProducto(id);
        if(pEncontrado == null){
            throw new ProductoException("El producto "+ id +" no existe.");
        }else{
            pEncontrado.setNombre(producto.getNombre());
            pEncontrado.setTipoArticulo(producto.getTipoArticulo());
            return true;
        }
    }

    @Override
    public Producto obtenerProducto(int id) {//throws ProductoException {
        Producto productoEncontrado = null;
        for (Producto p : listaProductos) {
            if (p.getId() == id) {
                productoEncontrado = p;
                break;
            }
        }
        return productoEncontrado;

    }

    @Override
    public boolean eliminarProducto(int id) throws ProductoException {
        Producto p = obtenerProducto(id);
        if (p != null) {
            listaProductos.remove(p);
            return true;
        } else {
            throw new ProductoException("El producto " + id + " no existe.");

        }
    }

    @Override
    public boolean productoExiste(int id) {
        for (Producto p : listaProductos) {
            if (p.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
