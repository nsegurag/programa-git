package com.ns.hashmap;

import java.util.HashMap;

public class hashmap_3 {
	
    public static void main(String[] args) {
    	HashMap<Double, String> hash = new HashMap<>();
    	
    	hash.put((double) 1.0, "Jorge");
    	hash.put((double) 1.2, "Maria");
    	hash.put((double) 1.3, "Sarah");
    	
    	for (Double id : hash.keySet())
    	System.out.println(hash.get(id));
    	
    }

}
