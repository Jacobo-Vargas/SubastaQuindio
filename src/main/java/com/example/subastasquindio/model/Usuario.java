package com.example.subastasquindio.model;

public class Usuario extends Persona{

    private String usuario;
    private String contrasenia;
    private String correo;


    public Usuario() {

    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String getUsuario() {
        return usuario;
    }


    public Usuario() {
    }



    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}
