package com.ling5821.dto;

import lombok.Data;

/**
 * @author lsj
 * @date 2021/3/11 10:42
 */
@Data
public class AppleDTO {
    private String url;

    /* 当修改字段类型时 无法刷新 mapper impl 的引用, 导致仍然获取前一个类型的 getter, 待 mapstruct 回复 */
    private String color;
}
