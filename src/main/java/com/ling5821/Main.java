package com.ling5821;

/**
 * @author lsj
 * @date 2021/3/11 10:42
 */
public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.setOssUrl("123231");
        AppleDTO appleDTO = AppleMapper.INSTANCE.toAppleDTO(apple);
        System.out.println(appleDTO);
    }
}
