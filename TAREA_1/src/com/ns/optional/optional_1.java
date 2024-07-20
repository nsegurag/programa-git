package com.ns.optional;

import java.util.Optional;

public class optional_1 {

    public static void main(String[] args) {
    	Optional<String> stringNull = Optional.ofNullable(null);
    	Optional<String> stringOptional = Optional.of("Hola");
    	
    	if (stringNull.isEmpty()) {
    		System.out.println("El valor de StringNull es Nulo");
    		
    	}
    	
    	if (stringOptional.isEmpty()){
    		System.out.println("El valor de StringOptional esta Vacia");
    	};
    }

}
