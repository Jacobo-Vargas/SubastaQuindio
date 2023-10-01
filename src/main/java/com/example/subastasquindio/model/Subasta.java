package com.example.subastasquindio.model;

import com.example.subastasquindio.exceptions.ProductoException;
import com.example.subastasquindio.exceptions.UsuarioException;
import com.example.subastasquindio.model.services.ISubastaService;

import java.util.ArrayList;

public class Subasta implements ISubastaService {

    private  ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    private  ArrayList<Comprador> listaCompradores = new ArrayList<>();
    private ArrayList<Anunciante> listaAnunciantes = new ArrayList<>();

    protected Subasta() {
    }


    /*
    Registrar un usuario
     */
    @Override
    public boolean registrarUsuario(String cedula) {
        Usuario u = obtenerUsuario(cedula);
        if (u != null) {
            listaUsuarios.add(u);
            return true;
        } else {
            return false;
        }
    }

    /*
    Eliminar usuario
     */
    @Override
    public boolean eliminarUsuario(String cedula) {
        Usuario u = obtenerUsuario(cedula);
        if (u != null) {
            listaUsuarios.remove(u);
            return true;
        } else {
            return false;
        }
    }

    /*
    funcion para obtener un usuario a partir de su cedula
     */
    @Override
    public Usuario obtenerUsuario(String cedula) {
        Usuario usuarioEncontrado = null;
        for (Usuario u : listaUsuarios) {
            if (u.getCedula().equals(cedula)) {
                usuarioEncontrado = u;
            }
        }
        return usuarioEncontrado;
    }

    @Override
    public boolean registrarProducto(String id, String nombre, TipoArticulo t) throws ProductoException {
        return false;
    }

    @Override
    public boolean actualizarProducto(String id, Producto producto) throws ProductoException {
        return false;
    }

    @Override
    public Producto obtenerProducto(String id) throws ProductoException {
        Producto productoEcontrado=null;
        for(int i=0;i<listaAnunciantes.size();i++){
            for(int h=0;h<listaAnunciantes.get(i).getListaProductos().size();h++){
                if(listaAnunciantes.get(h).getListaProductos().equals(id)){
                    return productoEcontrado=listaAnunciantes.get(i).getListaProductos().get(h);
                }
            }
        }
        return productoEcontrado;


    }

    @Override
    public boolean eliminarProducto(String id) throws ProductoException {
        return false;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public ArrayList<Comprador> getListaCompradores() {
        return listaCompradores;
    }

    public ArrayList<Anunciante> getListaAnunciantes() {
        return listaAnunciantes;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public void setListaCompradores(ArrayList<Comprador> listaCompradores) {
        this.listaCompradores = listaCompradores;
    }

    public void setListaAnunciantes(ArrayList<Anunciante> listaAnunciantes) {
        this.listaAnunciantes = listaAnunciantes;
    }
}
