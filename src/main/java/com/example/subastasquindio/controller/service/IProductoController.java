package com.example.subastasquindio.controller.service;

import com.example.subastasquindio.mapping.dto.ProductoDto;
import com.example.subastasquindio.model.Producto;

import java.util.List;

public interface IProductoController {
    List<ProductoDto> obtenerProductoDto();
    boolean registrarProducto(ProductoDto productoDto, String cedula);
    boolean eliminarProducto(String id);
    boolean actualizarProducto(String id, Producto producto);

}
