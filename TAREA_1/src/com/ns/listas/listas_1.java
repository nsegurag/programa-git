package com.ns.listas;

import java.util.ArrayList;
import java.util.List;

public class listas_1 {
	
	public static void main(String[] args) {
		
		List<Integer> numeros;
		
		numeros = new ArrayList<>();
		numeros.add(1);
		numeros.add(20);
		numeros.add(10);
		
		System.out.println("----- Lista 1 -----");
		System.out.println(numeros.get(0));
		System.out.println(numeros.get(1));
		System.out.println(numeros.get(2));
		
	}
	

}
