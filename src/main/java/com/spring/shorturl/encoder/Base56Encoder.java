package com.spring.shorturl.encoder;

// 23456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnpqrstuvwxyz
public class Base56Encoder {
    private final char[] base56 = new char[]{
            '2', '3', '4', '5', '6', '7', '8', '9',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
            'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R',
            'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
            'i', 'j', 'k', 'm', 'n', 'p', 'q', 'r',
            's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    };
    private final int base = 56;

    public String encode(){
        int len = 6;
        int[] randomNumbers = getRandomNumber(len);

        char[] encodedUrl = new char[len];
        for(int i=0; i<len; i++){
            encodedUrl[i] = base56[randomNumbers[i]];
        }

        return new String(encodedUrl);
    }

    public int[] getRandomNumber(int len){
        int[] randomNumber = new int[len];
        for(int i=0; i<len; i++){
            randomNumber[i] = (int)(Math.random()*base) + 1;
        }
        return randomNumber;
    }
}
