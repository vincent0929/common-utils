package io.github.vincent0929.common.dto;

import io.github.vincent0929.common.constant.BaseEnum;
import lombok.Data;
import lombok.Getter;

import java.io.Serializable;

@Data
public class ResultDTO<T> implements Serializable {

    private static final long serialVersionUID = 4880497561661508152L;

    private boolean success;

    private Integer code;

    private String message;

    private T data;

    public static <E> ResultDTO<E> success(E content) {
        ResultDTO<E> resultDTO = new ResultDTO<>();
        resultDTO.setSuccess(true);
        resultDTO.setData(content);
        resultDTO.setCode(Status.SUCCESS.code);
        return resultDTO;
    }

    public static <E> ResultDTO<E> fail(Integer code, String message) {
        ResultDTO<E> resultDTO = new ResultDTO<>();
        resultDTO.setSuccess(false);
        resultDTO.setCode(code);
        resultDTO.setMessage(message);
        return resultDTO;
    }

    @Getter
    static enum Status implements BaseEnum<Integer> {

        SUCCESS(200, "success"), FAIL(500, "fail");

        private Integer code;

        private String desc;

        Status(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }
    }
}
