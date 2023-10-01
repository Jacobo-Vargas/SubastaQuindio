package com.example.subastasquindio.model;

import com.example.subastasquindio.exceptions.LogException;
import com.example.subastasquindio.exceptions.ProductoException;
import com.example.subastasquindio.exceptions.UsuarioException;
import com.example.subastasquindio.model.services.ISubastaService;

import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;

public class Subasta implements ISubastaService {


    private ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    private ArrayList<Anuncio> listaAnuncios = new ArrayList<>();
    private ArrayList<Comprador> listaCompradores = new ArrayList<>();
    private ArrayList<Anunciante> listaAnunciantes = new ArrayList<>();

    public Subasta() {
    }



    //----------------------------------producto--------------------------------------------
    @Override
    public boolean registrarProducto(int id, String nombre, TipoArticulo t) throws ProductoException {
        return false;
    }

    @Override
    public boolean actualizarProducto(int id, Producto producto) throws ProductoException {
        return false;
    }

    @Override
    public Producto obtenerProducto(int id) throws ProductoException {
        Producto productoEcontrado = null;
        for (Anunciante anunciante : listaAnunciantes) {
            for (Producto p : anunciante.getListaProductos()) {
                if (p.getId() == id) {
                    productoEcontrado = p;
                    break;
                }
            }
        }
        return productoEcontrado;


    }

    @Override
    public boolean eliminarProducto(int id) throws ProductoException {
        return false;
    }

    @Override
    public boolean productoExiste(int id) throws ProductoException {
        if (obtenerProducto(id) == null) {
            return false;
        } else {
            return true;
        }
    }
//------------------------------anunciante-----------------------------------------
    @Override
    public boolean registrarAnunciante(Anunciante anunciante) {
        return false;
    }

    @Override
    public boolean actualizarAnunciante(String nombre, String apellido, String cedula, int edad, String telefono) {
        return false;
    }

    @Override
    public Anunciante obtenerAnunciante(String cedula) {
        Anunciante aEncontrado = null;
        for (Anunciante a:listaAnunciantes) {
            if(a.getCedula().equals(cedula)){
                aEncontrado = a;
                break;
            }
        }
        return aEncontrado;
    }

    @Override
    public boolean eliminarAnunciante(String cedula) {
        return false;
    }

    //----------------------------------comprador-----------------------------

    @Override
    public boolean registrarComprador(Anunciante anunciante) {
        return false;
    }

    @Override
    public boolean actualizarComprador(String nombre, String apellido, String cedula, int edad, String telefono) {
        return false;
    }

    @Override
    public Comprador obtenerComprador(String cedula) {
        return null;
    }

    @Override
    public boolean eliminarComprador(String cedula) {
        return false;
    }


    //---------------------login-----------------------//

    public boolean verificarAccesoAnunciante(String cedula, String contrasenia) throws LogException {
        boolean loginSuccesfully = false;

        for (Anunciante anunciante : listaAnunciantes) {
            if (anunciante.getUsuario().getUser().equals(cedula) && anunciante.getUsuario().getContrasenia().equals(contrasenia)) {
                loginSuccesfully = true;

                break;
            }
        }
        return loginSuccesfully;
    }

    public boolean verificarAccesoComprador(String usuario, String contrasenia) throws LogException {
        boolean loginSuccesfully = false;

        for (Comprador comprador : listaCompradores) {
            if (comprador.getUsuario().getUser().equals(usuario) && comprador.getUsuario().getContrasenia().equals(contrasenia)) {
                loginSuccesfully = true;
                break;
            }
        }
        return loginSuccesfully;
    }


    //---------------------------fin login------------------------
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
