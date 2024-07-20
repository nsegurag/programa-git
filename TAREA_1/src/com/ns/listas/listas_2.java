package com.ns.listas;

import java.util.ArrayList;
import java.util.List;

public class listas_2 {
	
	public static void main(String[] args) {
		
		List<String> nombres;
		
		nombres = new ArrayList<>();
		nombres.add("Juan");
		nombres.add("Carlos");
		nombres.add("Luis");
		
		System.out.println("----- Lista 2 -----");
		System.out.println(nombres.get(0));
		System.out.println(nombres.get(1));
		System.out.println(nombres.get(2));
		
	}

}
