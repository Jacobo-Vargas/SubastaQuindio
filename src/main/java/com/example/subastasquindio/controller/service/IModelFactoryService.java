package com.example.subastasquindio.controller.service;

import com.example.subastasquindio.mapping.dto.AnuncianteDto;
import com.example.subastasquindio.mapping.dto.CompradorDto;
import com.example.subastasquindio.mapping.dto.ProductoDto;

import java.util.List;

public interface IModelFactoryService {



    // metodos addcomprador
    boolean addProducto(ProductoDto productoDtoDto, String cedula);
    List<ProductoDto> obtenerProducto();

    boolean addComprador(CompradorDto compradorDto);
    // addAnunciane
    boolean addComprador(AnuncianteDto anunciateDto);
    //addAnuncio
    //autenticarComprador
    //autenticarAnunciante
}
