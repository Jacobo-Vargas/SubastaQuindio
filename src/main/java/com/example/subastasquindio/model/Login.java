package com.example.subastasquindio.model;
import static com.example.subastasquindio.model.InstanciaSubasta.obtenerInstancia;

public class Login {

    public boolean validarAcceso(String usuario,String password){
        boolean acceso = false;
        for (Usuario u:obtenerInstancia().getSubasta().getListaUsuarios()) {
            if(u.getUsuario().equals(usuario) && u.getContrasenia().equals(password)){
                acceso = true;
                break;
            }
        }
        return acceso;
    }
}
