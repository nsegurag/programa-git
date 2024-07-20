package com.ns.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class linkedlist_1 {

    public static void main(String[] args) {
        
        List<Integer> numeros;
        
        numeros = new LinkedList<>();
        
        numeros.add(1);
        numeros.add(20);
        numeros.add(10);
        
        numeros.add(0, 50);
        
		System.out.println("----- Lista 1 -----");
        for (Integer num : numeros) {
            System.out.println(num);
        }
    }
}
