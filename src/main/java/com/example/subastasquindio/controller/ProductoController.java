package com.example.subastasquindio.controller;

import com.example.subastasquindio.controller.ModelFactoryController;
import com.example.subastasquindio.controller.service.IProductoController;
import com.example.subastasquindio.exceptions.ProductoException;
import com.example.subastasquindio.mapping.dto.ProductoDto;
import com.example.subastasquindio.model.Producto;
import com.example.subastasquindio.model.TipoArticulo;
import com.example.subastasquindio.model.services.IProductoService;

import java.util.List;

public class ProductoController implements IProductoController {
    ModelFactoryController modelFactoryController;

    public ProductoController() {
        modelFactoryController = ModelFactoryController.getInstance();
    }

    @Override
    public List<ProductoDto> obtenerProductoDto() {
        return modelFactoryController.obtenerProducto();
    }

    @Override
    public boolean registrarProducto(ProductoDto productoDto, String cedula) {
        return modelFactoryController.addProducto(productoDto, cedula);
    }

    @Override
    public boolean eliminarProducto(String id) {
        return false;
    }

    @Override
    public boolean actualizarProducto(String id, Producto producto) {
        return false;
    }
}
