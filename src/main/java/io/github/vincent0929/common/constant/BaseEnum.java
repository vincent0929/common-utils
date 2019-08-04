package io.github.vincent0929.common.constant;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public interface BaseEnum<T> {

    T getCode();

    String getDesc();

    default <E extends BaseEnum<T>> E unknownEnum(T value) {
        return null;
    }

    static <E extends BaseEnum> E valueOf(Class<E> enumImpl, Object value) {
        E[] enumConstants = enumImpl.getEnumConstants();
        if (ArrayUtils.isEmpty(enumConstants)) {
            return null;
        }
        @SuppressWarnings("unchecked")
        E unknownEnum = (E) enumConstants[0].unknownEnum(value);
        return Arrays.stream(enumConstants).filter(enumConstant -> enumConstant.getCode().equals(value))
                .findFirst().orElse(unknownEnum);
    }

    static <E extends BaseEnum> E descOf(Class<E> enumImpl, String desc) {
        E[] enumConstants = enumImpl.getEnumConstants();
        if (ArrayUtils.isEmpty(enumConstants)) {
            return null;
        }
        @SuppressWarnings("unchecked")
        E unknownEnum = (E) enumConstants[0].unknownEnum(desc);
        return Arrays.stream(enumConstants).filter(enumConstant -> enumConstant.getDesc().equals(desc))
                .findFirst().orElse(unknownEnum);
    }
}
