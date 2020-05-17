package io.github.vincent0929.common.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class BaseDO implements Serializable {

    private static final long serialVersionUID = -5635229797056026005L;

    private Long id;

    private Integer deleted;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
