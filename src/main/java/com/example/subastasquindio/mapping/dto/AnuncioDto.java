package com.example.subastasquindio.mapping.dto;

import com.example.subastasquindio.model.Producto;
import javafx.scene.image.Image;

import java.time.LocalDate;

public record AnuncioDto(
        String codigoAnuncio,
        Producto producto,
        String descripcion,
        float valorInicial,
        Image fotoAnuncio,
        String nombreAnunciante,
        LocalDate fechaPublicacion,
        LocalDate fechaFinPublicacion


) {
}
