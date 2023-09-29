package com.example.subastasquindio.utils;

import com.example.subastasquindio.model.Producto;
import com.example.subastasquindio.model.Subasta;
import com.example.subastasquindio.model.TipoArticulo;

public class SubastaUtils {
    public static void inicializarDatos(){
        Producto producto=new Producto();
        producto.setId("1");
        producto.setNombre("juan");
        producto.setTipoArticulo(TipoArticulo.CASAS);

        Producto producto2=new Producto();
        producto.setId("2");
        producto.setNombre("carlos");
        producto.setTipoArticulo(TipoArticulo.CASAS);
    }
}
