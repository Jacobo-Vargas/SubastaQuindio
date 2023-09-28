package com.example.subastasquindio.controller;

import com.example.subastasquindio.mapping.mappers.SubastaMapper;
import com.example.subastasquindio.model.Subasta;

public class ModelFactoryController  {
    Subasta subasta;
    SubastaMapper mapper = SubastaMapper.INSTANCE;

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


