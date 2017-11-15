package com.util;

import java.util.Random;

public class Util {

    public static Integer getRandomNumber(final Integer number) {
        final Random generator = new Random();
        return generator.nextInt(number);
    }
}
