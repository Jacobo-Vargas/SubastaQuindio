package com.example.subastasquindio.model.services;

import com.example.subastasquindio.exceptions.ProductoException;
import com.example.subastasquindio.model.Producto;
import com.example.subastasquindio.model.TipoArticulo;

public interface IProductoService {
    public boolean registrarProducto(Producto producto) throws ProductoException;
    public boolean actualizarProducto(int id,Producto producto) throws ProductoException;
    public Producto obtenerProducto(int id) throws ProductoException;

    public boolean eliminarProducto(int id) throws ProductoException;

    public boolean productoExiste(int id);

}
