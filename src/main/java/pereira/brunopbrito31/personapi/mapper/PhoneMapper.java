package pereira.brunopbrito31.personapi.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import pereira.brunopbrito31.personapi.dto.request.PhoneDTO;
import pereira.brunopbrito31.personapi.entity.Phone;

@Mapper
public interface PhoneMapper {

    PhoneMapper INSTANCE = Mappers.getMapper(PhoneMapper.class);

    Phone toModel(PhoneDTO phoneDTO);

    PhoneDTO toDTO(Phone phone);
}
