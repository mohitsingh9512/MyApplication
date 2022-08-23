package com.example.myapplication.utils;

import androidx.test.InstrumentationRegistry;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Parameterized {

    public static final String PARAM_INDEX = "paramIndex";

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public static @interface Repeat {
        int count();
    }

    public static int getIndex() {
        try {
            return Integer.parseInt(InstrumentationRegistry.getArguments().getString(PARAM_INDEX));
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}