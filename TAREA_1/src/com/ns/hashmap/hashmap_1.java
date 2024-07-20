package com.ns.hashmap;

import java.util.HashMap;

public class hashmap_1 {
	
    public static void main(String[] args) {
    	HashMap<Integer, String> hash = new HashMap<>();
    	
    	hash.put(01, "Juan");
    	hash.put(02, "Ana");
    	hash.put(03, "Carlos");
    	
    	for (Integer id : hash.keySet())
    	System.out.println(hash.get(id));
    	
    }

}
