package com.example.subastasquindio.controller;
import com.example.subastasquindio.controller.ModelFactoryController;
import com.example.subastasquindio.exceptions.ProductoException;
import com.example.subastasquindio.mapping.dto.ProductoDto;
import com.example.subastasquindio.model.Producto;
import com.example.subastasquindio.model.TipoArticulo;
import com.example.subastasquindio.model.services.IProductoService;

import java.util.List;

public class ProductoController implements IProductoService {
    ModelFactoryController modelFactoryController;
    public ProductoController(){modelFactoryController=ModelFactoryController.getInstance();}


    @Override
    public boolean registrarProducto(String id, String nombre, TipoArticulo t) throws ProductoException {
        return false;
    }

    @Override
    public boolean actualizarProducto(String id, Producto producto) throws ProductoException {
        return false;
    }

    @Override
    public Producto obtenerProducto(String id) throws ProductoException {
        return null;
    }

    @Override
    public boolean eliminarProducto(String id) throws ProductoException {
        return false;
    }
}
