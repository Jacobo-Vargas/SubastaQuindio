package com.example.subastasquindio.utils;

import com.example.subastasquindio.exceptions.ProductoException;
import com.example.subastasquindio.model.Anunciante;
import com.example.subastasquindio.model.Producto;
import com.example.subastasquindio.model.Subasta;
import com.example.subastasquindio.model.TipoArticulo;

public class SubastaUtils {


    public static Subasta inicializarDatos() throws ProductoException {

        Subasta subasta = new Subasta();
        Anunciante a = new Anunciante();
        a.setCedula("123");
        subasta.registrarAnunciante(a);

        Producto producto = new Producto();
        producto.setNombre("juan");
        producto.setTipoArticulo(TipoArticulo.CASAS);

        Producto producto2 = new Producto();
        producto2.setNombre("carlos");
        producto2.setTipoArticulo(TipoArticulo.CASAS);

        a.registrarProducto(producto);
        a.registrarProducto(producto2);

        return subasta;
    }
}
