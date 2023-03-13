package com.ling5821;

import com.ling5821.dto.AppleDTO;
import com.ling5821.entity.Apple;
import com.ling5821.mapstruct.AppleMapper;

/**
 * @author lsj
 * @date 2021/3/11 10:42
 */
public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.setUrl("12588");
        apple.setColor("555");
        AppleDTO appleDTO = AppleMapper.INSTANCE.toAppleDTO(apple);
        System.out.println(appleDTO);
    }
}
