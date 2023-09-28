package com.example.subastasquindio.mapping.mappers;
import com.example.subastasquindio.mapping.dto.AnuncianteDto;
import com.example.subastasquindio.model.Anunciante;
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

}
