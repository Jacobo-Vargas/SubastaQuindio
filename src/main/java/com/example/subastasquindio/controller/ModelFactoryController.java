package com.example.subastasquindio.controller;

import com.example.subastasquindio.controller.service.IModelFactoryService;
import com.example.subastasquindio.exceptions.LogException;
import com.example.subastasquindio.exceptions.ProductoException;
import com.example.subastasquindio.mapping.dto.AnuncianteDto;
import com.example.subastasquindio.mapping.dto.CompradorDto;
import com.example.subastasquindio.mapping.dto.ProductoDto;
import com.example.subastasquindio.mapping.mappers.SubastaMapper;
import com.example.subastasquindio.model.Anunciante;
import com.example.subastasquindio.model.Producto;
import com.example.subastasquindio.model.Subasta;
import com.example.subastasquindio.utils.SubastaUtils;

import java.util.List;

public class ModelFactoryController implements IModelFactoryService {

    private AnuncianteDto anuncianteLog;
    private CompradorDto compradorLog;
    Subasta subasta;
    SubastaMapper mapper = SubastaMapper.INSTANCE;


    private static class SingletonHolder {
        private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
    }

    public static ModelFactoryController getInstance() {
        return SingletonHolder.eINSTANCE;
    }

    public ModelFactoryController() throws ProductoException {
        System.out.println("Invocando singleton");
        quemarDatos();
    }

    public Subasta getSubasta() {
        return subasta;
    }

    //---------------------------------- fin singleton -----------------------------------

    //-------------------------cargar datos----------------------
    private void quemarDatos() throws ProductoException {
        subasta = SubastaUtils.inicializarDatos();
        System.out.println(subasta.getListaAnunciantes());
    }

    //-------------------- validar Login ---------------------------------------

    public boolean verificarAnunciante(String cedula, String contrasenia) throws LogException {
        if (subasta.verificarAccesoAnunciante(cedula, contrasenia)) {
            anuncianteLog = mapper.anuncianteToAnuncianteDto(subasta.obtenerAnunciante(cedula));
            return true;
        } else {
            return false;
        }
    }

    public boolean verificarComprador(String cedula, String contrasenia) throws LogException {
        if (subasta.verificarAccesoAnunciante(cedula, contrasenia)) {
            compradorLog = mapper.compradorToCompradorDto(subasta.obtenerComprador(cedula));
            return true;
        } else {
            return false;
        }
    }


    public void LogOut() {
        anuncianteLog = null;
        compradorLog = null;
    }


    //---------------------fin validar login------------------------------------


    // lo cruds Dto recibo normales los transformo y los registro despues de transformarlos

    @Override
    public boolean addProducto(ProductoDto productoDto, String cedula) {
        try {
            Anunciante anunciante = subasta.obtenerAnunciante(cedula);
            if (!subasta.productoExiste(productoDto.id())) {
                Producto producto = mapper.productoDtoToProducto(productoDto);
                anunciante.getListaProductos().add(producto);
                return true;
            } else {
                return false;
            }
        } catch (ProductoException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<ProductoDto> obtenerProducto() {
        Anunciante anunciante = subasta.obtenerAnunciante(getAnuncianteLog().nombre());
        System.out.println(subasta.getListaAnunciantes());
        return  mapper.getProductoDto(anunciante.getListaProductos());
    }

    @Override
    public boolean addComprador(CompradorDto compradorDto) {
        return false;
    }

    @Override
    public boolean addComprador(AnuncianteDto anunciateDto) {
        return false;
    }

    public AnuncianteDto getAnuncianteLog() {
        return anuncianteLog;
    }

    public CompradorDto getCompradorLog() {
        return compradorLog;
    }
}


