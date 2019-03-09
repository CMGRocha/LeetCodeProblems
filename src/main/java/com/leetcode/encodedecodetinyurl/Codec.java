package com.leetcode.encodedecodetinyurl;

public class Codec {

    private final static String URL = "http://tinyurl.com/";

    // Encodes a URL to a shortened URL.
    public String encode(final String longUrl) {
        // split tiny
        return URL + asciiToHex(longUrl);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(final String shortUrl) {
        //split tiny
        return hexToAscii(shortUrl.replace(URL, ""));
    }

    private String asciiToHex(final String message) {
        final char[] chars = message.toCharArray();
        final StringBuilder buffer = new StringBuilder();
        for (final char ch : chars) {
            buffer.append(Integer.toHexString((int) ch));
        }
        return buffer.toString();
    }

    private String hexToAscii(final String message) {
        final StringBuilder output = new StringBuilder();

        for (int i = 0; i < message.length(); i += 2) {
            String str = message.substring(i, i + 2);
            output.append((char) Integer.parseInt(str, 16));
        }
        return output.toString();
    }
}
