package com.ns.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class linkedlist_2 {

	public static void main(String[] args) {
	        
		List<String> nombres;
	    nombres = new LinkedList<>();
	        
	    nombres.add("Carlos");
	    nombres.add("Nataly");
	    nombres.add("Carla");
	        
	    nombres.add(0, "Matias");
	        
	    System.out.println("----- Lista 2 -----");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
	}
}

