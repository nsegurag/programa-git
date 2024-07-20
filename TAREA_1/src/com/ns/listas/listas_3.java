package com.ns.listas;

import java.util.ArrayList;
import java.util.List;

public class listas_3 {
	
	public static void main(String[] args) {
		
		List<Float> numeros;
		
		numeros = new ArrayList<>();
		numeros.add((float) 1.0);
		numeros.add((float) 5.2);
		numeros.add((float) 9.8);
		
		System.out.println("----- Lista 3 -----");
		System.out.println(numeros.get(0));
		System.out.println(numeros.get(1));
		System.out.println(numeros.get(2));
		
	}

}
