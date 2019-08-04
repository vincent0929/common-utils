package io.github.vincent0929.common.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BaseDO {

    private Long id;

    private Integer deleted;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
