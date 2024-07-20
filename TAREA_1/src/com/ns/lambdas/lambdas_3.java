package com.ns.lambdas;

import java.util.Arrays;
import java.util.List;

public class lambdas_3 {

	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 2);

	        numbers.sort((a, b) -> a.compareTo(b));

	        numbers.forEach(System.out::println);
	    }
	}

