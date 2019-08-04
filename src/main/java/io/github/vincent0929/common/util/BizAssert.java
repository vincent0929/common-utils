package io.github.vincent0929.common.util;


import io.github.vincent0929.common.constant.BaseEnum;
import io.github.vincent0929.common.exception.BizException;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Collection;
import java.util.Map;

public class BizAssert {

    public static void isTrue(boolean expression, BaseEnum<Integer> exception) {
        if (!expression) {
            throw new BizException(exception.getCode(), exception.getDesc());
        }
    }

    public static void notTrue(boolean expression, BaseEnum<Integer> exception) {
        if (expression) {
            throw new BizException(exception.getCode(), exception.getDesc());
        }
    }

    public static void isNull(Object object, BaseEnum<Integer> exception) {
        if (object != null) {
            throw new BizException(exception.getCode(), exception.getDesc());
        }
    }

    public static void notNull(Object object, BaseEnum<Integer> exception) {
        if (object == null) {
            throw new BizException(exception.getCode(), exception.getDesc());
        }
    }

    public static void isBlank(String text, BaseEnum<Integer> exception) {
        if (StringUtils.isNotBlank(text)) {
            throw new BizException(exception.getCode(), exception.getDesc());
        }
    }

    public static void notBlank(String text, BaseEnum<Integer> exception) {
        if (StringUtils.isBlank(text)) {
            throw new BizException(exception.getCode(), exception.getDesc());
        }
    }

    public static void notEmpty(Object[] array, BaseEnum<Integer> exception) {
        if (ArrayUtils.isEmpty(array)) {
            throw new BizException(exception.getCode(), exception.getDesc());
        }
    }

    public static void notEmpty(Collection<?> collection, BaseEnum<Integer> exception) {
        if (CollectionUtils.isEmpty(collection)) {
            throw new BizException(exception.getCode(), exception.getDesc());
        }
    }

    public static void notEmpty(Map<?, ?> map, BaseEnum<Integer> exception) {
        if (MapUtils.isEmpty(map)) {
            throw new BizException(exception.getCode(), exception.getDesc());
        }
    }
}
