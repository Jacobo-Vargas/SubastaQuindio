package com.example.subastasquindio.mapping.mappers;
import com.example.subastasquindio.mapping.dto.AnuncianteDto;
import com.example.subastasquindio.mapping.dto.ProductoDto;
import com.example.subastasquindio.model.Anunciante;
import com.example.subastasquindio.model.Producto;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.util.List;

public interface SubastaMapper {
    SubastaMapper INSTANCE = Mappers.getMapper(SubastaMapper.class);

    @Named("anuncianteToAnuncianteDto")
    AnuncianteDto anuncianteToAnuncianteDto(Anunciante anunciante);

    Anunciante anuncianteToAnuncianteDto(AnuncianteDto anuncianteDto);

    @IterableMapping(qualifiedByName = "anuncioToAnuncioDto")
    List<AnuncianteDto> getAnunciantesDto(List<Anunciante> listAnunciantes);

    @Named("productoToProductoDto")
    ProductoDto ProductoToProductoDto(Producto producto);
    Producto productoDtoToproducto(ProductoDto productoDto);
    @IterableMapping(qualifiedByName = "productoToProductoDto")
    List<ProductoDto> getProductoDto(List<Producto> listaProducto);



}
