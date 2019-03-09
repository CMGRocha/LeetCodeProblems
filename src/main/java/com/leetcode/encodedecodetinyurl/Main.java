package com.leetcode.encodedecodetinyurl;

public class Main {
    public static void main(String[] args) {
        final String url = "https://leetcode.com/problems/design-tinyurl";
        final Codec codec = new Codec();
        final String minifiedUrl = codec.encode(url);
        System.out.println("minified : " + minifiedUrl);
        System.out.println(codec.decode(minifiedUrl));
    }
}
