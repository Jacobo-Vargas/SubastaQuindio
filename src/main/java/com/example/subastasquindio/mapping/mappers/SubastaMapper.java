package com.example.subastasquindio.mapping.mappers;

import com.example.subastasquindio.mapping.dto.*;
import com.example.subastasquindio.model.*;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.util.List;


@Mapper
public interface SubastaMapper {
    SubastaMapper INSTANCE = Mappers.getMapper(SubastaMapper.class);

    @Named("anuncianteToAnuncianteDto")
    AnuncianteDto anuncianteToAnuncianteDto(Anunciante anunciante);

    Anunciante anuncianteDtoToAnunciante(AnuncianteDto anuncianteDto);

    @Named("compradorToCompradorDto")
    CompradorDto compradorToCompradorDto(Comprador comprador);

    Comprador compradorDtoComprador(CompradorDto compradorDto);

    @Named("productoToProductoDto")
    ProductoDto productoToProductoDto(Producto producto);

    Producto productoDtoToProducto(ProductoDto productoDto);

    @Named("anuncioToAnuncioDto")
    AnuncioDto anuncioToAnuncioDto(Anuncio anuncio);

    Anuncio anuncioDtoToAnuncio(AnuncioDto anuncioDto);

    @Named("pujaToPujaDto")
    PujaDto pujaToPujaDto(Puja puja);

    Puja pujaDtoToPuja(PujaDto pujaDto);


    @IterableMapping(qualifiedByName = "anuncioToAnuncioDto")
    List<AnuncioDto> getAnunciosDto(List<Anuncio> listaAnuncios);

        @IterableMapping(qualifiedByName = "productoToProductoDto")
        List<ProductoDto> getProductoDto(List<Producto> listaProductos);

    @IterableMapping(qualifiedByName = "pujaToPujaDto")
    List<PujaDto> getPujaDto(List<Puja> listaPujas);


}
