package com.example.subastasquindio.Model;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Subasta {

    private ArrayList<Persona> listaPersonas;
    private ArrayList<Articulos> listaArticulos;

    /*
    Registrar un usuario
     */

    public boolean registrarUsuario(Persona p){
        boolean existe = listaPersonas.stream()
                .anyMatch(persona -> persona.getCedula().equals(p.getCedula()));
        if(!existe){
            listaPersonas.add(p);
            return true; // retorna true si es registrada exitosamente
        }else{
            return false; // retorna false en caso de que la cedula ya este registrada
        }
    }
}
