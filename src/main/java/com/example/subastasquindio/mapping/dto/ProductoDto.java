package com.example.subastasquindio.mapping.dto;

import com.example.subastasquindio.model.TipoArticulo;

public record ProductoDto(
    int id,
    TipoArticulo tipoArticulo,
    String nombre
) {

}
