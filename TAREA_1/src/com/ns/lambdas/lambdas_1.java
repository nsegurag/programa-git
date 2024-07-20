package com.ns.lambdas;

public class lambdas_1 {
	
    public static void main(String[] args) {
    	
    	ejecutor lambdaEjecutor = () -> {
    		System.out.println("Hola Mundo, Desde Lambdas");
    	};

    	lambdaEjecutor.ejecutar();
    }
}
