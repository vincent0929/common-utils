package io.github.vincent0929.common.util;

import java.util.UUID;

public class Strings {

    public static String uuid() {
        String token = UUID.randomUUID().toString();
        return token.substring(0, 8) + token.substring(9, 13) + token.substring(14, 18)
                + token.substring(19, 23) + token.substring(24, 32);
    }
}
