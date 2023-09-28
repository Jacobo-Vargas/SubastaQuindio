package com.example.subastasquindio.model.services;

import com.example.subastasquindio.exceptions.UsuarioException;
import com.example.subastasquindio.model.Usuario;

public interface ISubastaService {
    public boolean registrarUsuario(String usuario) throws UsuarioException;
    public boolean eliminarUsuario(String usuario);
    public Usuario obtenerUsuario(String usuario);
}
