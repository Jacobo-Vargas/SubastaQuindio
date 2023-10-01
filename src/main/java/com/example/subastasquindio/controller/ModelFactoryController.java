package com.example.subastasquindio.controller;

import com.example.subastasquindio.mapping.dto.ProductoDto;
import com.example.subastasquindio.mapping.mappers.SubastaMapper;
import com.example.subastasquindio.model.Subasta;
import com.example.subastasquindio.model.services.IModelFactoryService;

import java.util.List;

public class ModelFactoryController implements IModelFactoryService  {
    Subasta subasta;
    SubastaMapper mapper = SubastaMapper.INSTANCE;

    @Override
    public List<ProductoDto> obtenerProducto() {
        return null;
    }

    @Override
    public boolean agregarProducto(ProductoDto productoDto) {
        return false;
    }

    @Override
    public boolean eliminarProducto(String id) {
        return false;
    }

    @Override
    public boolean actulizarProducto(String id, ProductoDto productoDto) {
        return false;
    }


    private static class SingletonHolder{
        private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
    }
    public static ModelFactoryController getInstance(){
        return SingletonHolder.eINSTANCE;
    }

    public ModelFactoryController(){
        System.out.println("Invocando singleton");
    }

    public Subasta getSubasta(){
        return subasta;
    }


}


