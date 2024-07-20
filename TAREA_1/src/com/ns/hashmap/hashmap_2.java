package com.ns.hashmap;

import java.util.HashMap;

public class hashmap_2 {
	
    public static void main(String[] args) {
    	HashMap<String, String> hash = new HashMap<>();
    	
    	hash.put("Honda", "Acura");
    	hash.put("Toyota", "Hilux");
    	hash.put("Mazda", "Protege");
    	
    	for (String id : hash.keySet())
    	System.out.println(hash.get(id));
    	
    }

}