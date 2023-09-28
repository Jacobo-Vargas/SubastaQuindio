package com.example.subastasquindio.mapping.dto;

import com.example.subastasquindio.model.Anuncio;
import com.example.subastasquindio.model.Producto;

import java.util.List;

public record AnuncianteDto(

        String nombre,
        List<Anuncio> listaAnuncioDto,
        List<Producto> listaProductosDto

) {
}
