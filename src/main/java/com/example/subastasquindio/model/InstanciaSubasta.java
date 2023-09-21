package com.example.subastasquindio.model;

public class InstanciaSubasta {
    private static InstanciaSubasta instancia;
    private final Subasta subasta;

    private InstanciaSubasta() {
        // Inicializa la subasta en el constructor privado
        subasta = new Subasta();
    }

    public static InstanciaSubasta obtenerInstancia() {
        if (instancia == null) {
            instancia = new InstanciaSubasta();
        }
        return instancia;
    }

    public Subasta getSubasta() {
        return subasta;
    }
}
