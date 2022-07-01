package com.example.orion;


import android.util.Log;

public class Decode {
    public static String decode(String s) {

        String ret = " ";
        StringBuilder decryped = new StringBuilder();
        for(Character a: s.toCharArray())
            decryped.append(Character.toChars((a-17))) ;
        ret = decryped.toString();
        return ret;









    }}
