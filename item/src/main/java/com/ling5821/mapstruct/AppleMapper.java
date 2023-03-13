package com.ling5821.mapstruct;

import com.ling5821.dto.AppleDTO;
import com.ling5821.entity.Apple;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author lsj
 * @date 2021/3/11 10:42
 */
@Mapper
public interface AppleMapper {
    AppleMapper INSTANCE = Mappers.getMapper(AppleMapper.class);

    AppleDTO toAppleDTO(Apple apple);
}
