package com.example.subastasquindio.mapping.dto;

import com.example.subastasquindio.model.Puja;

import java.util.List;

public record CompradorDto(
        String direccion,
        List<Puja> listaPujas
) {
}