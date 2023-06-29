package com.madeeasy.patternforinstanceof;

public class Main {
    /**
     * if (obj instanceof String s) {
     * }
     */
    public static void main(String[] args) {
        String message = "Welcome to madeeasy";
        Object obj = message;
        // Old way of getting length
        if (obj instanceof String) {
            String value = (String) obj;
            System.out.println(value.length());
        }
        // New way of getting length
        if (obj instanceof String value) {
            System.out.println(value.length());
        }
    }
}
