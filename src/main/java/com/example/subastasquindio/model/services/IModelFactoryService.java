package com.example.subastasquindio.model.services;

import com.example.subastasquindio.mapping.dto.ProductoDto;

import java.util.List;

public interface IModelFactoryService {
    List<ProductoDto> obtenerProducto();
    boolean agregarProducto(ProductoDto productoDto);
    boolean eliminarProducto(String id);
    boolean actulizarProducto(String id,ProductoDto productoDto);
}
