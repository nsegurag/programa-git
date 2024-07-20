package com.ns.lambdas;

import java.util.Arrays;
import java.util.List;

public class lambdas_2 {
	
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana", "Juan", "Pedro", "Lucía");


        names.forEach(name -> System.out.println(name));
    }
}

