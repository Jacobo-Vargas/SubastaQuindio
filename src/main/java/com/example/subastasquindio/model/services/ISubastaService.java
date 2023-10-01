package com.example.subastasquindio.model.services;

import com.example.subastasquindio.exceptions.ProductoException;
import com.example.subastasquindio.exceptions.UsuarioException;
import com.example.subastasquindio.model.*;

public interface ISubastaService {


    public boolean registrarProducto(int id, String nombre, TipoArticulo t) throws ProductoException;
    public boolean actualizarProducto(int id, Producto producto) throws ProductoException;
    public Producto obtenerProducto(int id) throws ProductoException;

    public boolean eliminarProducto(int id) throws ProductoException;
    public boolean productoExiste(int id) throws ProductoException;


    public boolean registrarAnunciante(Anunciante anunciante);
    public boolean actualizarAnunciante(String nombre,String apellido, String cedula, int edad, String telefono);
    public Anunciante obtenerAnunciante(String cedula);
    public boolean eliminarAnunciante(String cedula);

    public boolean registrarComprador(Anunciante anunciante);
    public boolean actualizarComprador(String nombre,String apellido, String cedula, int edad, String telefono);
    public Comprador obtenerComprador(String cedula);
    public boolean eliminarComprador(String cedula);
}
