package com.ns.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class linkedlist_3 {

    public static void main(String[] args) {
        
        List<Float> numeros;
        
        numeros = new LinkedList<>();
        
        numeros.add((float) 8.2);
        numeros.add((float) 6.5);
        numeros.add((float) 4.9);
        
        numeros.add(0, (float) 50.6);
        
		System.out.println("----- Lista 1 -----");
        for (Float num : numeros) {
            System.out.println(num);
        }
    }
}
