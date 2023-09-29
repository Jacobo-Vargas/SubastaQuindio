package com.example.subastasquindio.model.services;

import com.example.subastasquindio.exceptions.ProductoException;
import com.example.subastasquindio.model.Producto;
import com.example.subastasquindio.model.TipoArticulo;

public interface IProductoService {
    public boolean registrarProducto(String id, String nombre, TipoArticulo t) throws ProductoException;
    public boolean actualizarProducto(String id,Producto producto) throws ProductoException;
    public Producto obtenerProducto(String id) throws ProductoException;

    public boolean eliminarProducto(String id) throws ProductoException;

}
