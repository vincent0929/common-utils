package io.github.vincent0929.common.exception;

import lombok.Getter;

@Getter
public class BizException extends RuntimeException {

    private static final long serialVersionUID = -6585777448927057253L;

    private Integer code;

    public BizException(Integer code, String msg) {
        super(msg);
        this.code = code;
    }
}
