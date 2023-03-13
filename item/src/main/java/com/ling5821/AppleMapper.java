package com.ling5821;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @author lsj
 * @date 2021/3/11 10:42
 */
@Mapper
public interface AppleMapper {
    AppleMapper INSTANCE = Mappers.getMapper(AppleMapper.class);

    @Mapping(source = "ossUrl", target = "url")
    @Mapping(source = "age", target = "agex")
    AppleDTO toAppleDTO(Apple apple);
}
