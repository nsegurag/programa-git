package com.ns.stream;

import java.util.Arrays;
import java.util.List;

public class stream_3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("cat", "dog", "elephant", "bat", "rat", "ant");


        long count = words.stream()
                          .filter(word -> word.length() < 5) 
                          .count();

        System.out.println("Numero de palabras con menos de 5 Caracteres: " + count);
    }
}
