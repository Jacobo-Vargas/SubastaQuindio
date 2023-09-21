package com.example.subastasquindio.model;

import java.util.ArrayList;

public class Subasta {

    private final ArrayList<Usuario> listaUsuarios;
    private final ArrayList<Articulos> listaArticulos;
    protected Subasta() {
        listaArticulos = new ArrayList<>();
        listaUsuarios = new ArrayList<>();
    }


    /*
    Registrar un usuario
     */

    public boolean registrarUsuario(String cedula){
        Usuario u = obtenerUsuario(cedula);
        if(u != null){
            listaUsuarios.add(u);
            return true;
        }else{
            return false;
        }
    }

    /*
    Eliminar usuario
     */

    public boolean eliminarUsuario(String cedula){
        Usuario u = obtenerUsuario(cedula);
        if(u != null){
            listaUsuarios.remove(u);
            return true;
        }else{
            return false;
        }
    }

    /*
    funcion para obtener un usuario a partir de su cedula
     */

    public Usuario obtenerUsuario(String cedula){
        Usuario usuarioEncontrado = null;
        for (Usuario u: listaUsuarios) {
            if(u.getCedula().equals(cedula)){
                usuarioEncontrado = u;
            }
        }
        return usuarioEncontrado;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public ArrayList<Articulos> getListaArticulos() {
        return listaArticulos;
    }
}
