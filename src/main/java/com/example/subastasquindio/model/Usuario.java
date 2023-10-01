package com.example.subastasquindio.model;

public class Usuario{

    private String user;
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

    public String getUser() {
        return user;
    }


    public void setUser(String usuario) {
        this.user = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}
