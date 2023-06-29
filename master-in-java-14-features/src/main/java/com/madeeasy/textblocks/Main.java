package com.madeeasy.textblocks;

public class Main {
    /**
     * Java 13 introduces text blocks to handle multiline strings like JSON/XML/HTML etc as is a
     * preview feature. With Java 14, we've second preview of Text Blocks. Now Text Block have following enhancements −
     * <p>
     * \ − indicates an end of the line in case new line is to be started.
     * <p>
     * \s − indicates a single space.
     */
    public static void main(String[] args) {
        String multiline1 = "A quick brown fox jumps over a lazy dog; the lazy dog howls loudly.";
        System.out.println("multiline1 = " + multiline1);
        String multiline2 = """
                A quick brown fox jumps over a lazy dog; \
                the lazy dog howls loudly.
                """;
        System.out.println("multiline2 = " + multiline2);
    }
}
