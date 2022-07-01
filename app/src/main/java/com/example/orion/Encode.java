package com.example.orion;



public class Encode {
    public static String encode(String s) {
        String res = " ";
        StringBuilder encryped = new StringBuilder();
        for(Character a: s.toCharArray())
            encryped.append(Character.toChars((a+17))) ;
        res = encryped.toString();
        return res;
    }
}