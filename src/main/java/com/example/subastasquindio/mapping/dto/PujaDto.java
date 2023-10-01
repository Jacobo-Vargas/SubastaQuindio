package com.example.subastasquindio.mapping.dto;

import java.time.LocalDate;

public record PujaDto(
        String direccion,
        String codigo,
        float oferta,
        LocalDate fechaPuja
) {
}
