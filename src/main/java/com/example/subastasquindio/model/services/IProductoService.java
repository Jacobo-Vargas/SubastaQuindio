package com.example.subastasquindio.model.services;

import com.example.subastasquindio.exceptions.ProductoException;
import com.example.subastasquindio.exceptions.UsuarioException;
import com.example.subastasquindio.model.Producto;
import com.example.subastasquindio.model.TipoArticulo;

public interface IProductoService {
    public boolean registrarProducto(String nombre, TipoArticulo t) throws ProductoException;
    public boolean actualizarProducto(String nombre,Producto producto) throws ProductoException;
    public Producto obtenerProducto(String nombre) throws ProductoException;

    public boolean eliminarProducto(String nombre) throws ProductoException;
}
