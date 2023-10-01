package com.example.subastasquindio.model.services;

import com.example.subastasquindio.exceptions.ProductoException;
import com.example.subastasquindio.exceptions.UsuarioException;
import com.example.subastasquindio.model.Producto;
import com.example.subastasquindio.model.TipoArticulo;
import com.example.subastasquindio.model.Usuario;

public interface ISubastaService {
    public boolean registrarUsuario(String usuario) throws UsuarioException;
    public boolean eliminarUsuario(String usuario);
    public Usuario obtenerUsuario(String usuario);



    public boolean registrarProducto(String id, String nombre, TipoArticulo t) throws ProductoException;
    public boolean actualizarProducto(String id, Producto producto) throws ProductoException;
    public Producto obtenerProducto(String id) throws ProductoException;

    public boolean eliminarProducto(String id) throws ProductoException;
}
