package com.example.subastasquindio.mapping.dto;

import com.example.subastasquindio.model.TipoArticulo;

public record ProductoDto(
    String id,
    TipoArticulo tipoArticulo,
    String nombre) {


}
