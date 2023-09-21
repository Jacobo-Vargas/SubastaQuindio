package com.example.subastasquindio.model;
import com.example.subastasquindio.exceptions.LogException;

import static com.example.subastasquindio.model.InstanciaSubasta.obtenerInstancia;

public class Login {

    public boolean validarAcceso(String usuario,String password) throws LogException {

        boolean acceso = false;

        for (Usuario u:obtenerInstancia().getSubasta().getListaUsuarios()) {
            if(u.getUsuario().equals(usuario) && u.getContrasenia().equals(password)){
                acceso = true;
                break;
            }
        }
        if(!acceso){
            throw new LogException("Verificar los datos ingresados");
        }
        return acceso;
    }
}
