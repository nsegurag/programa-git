package com.ns.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class stream_2 {

	    public static void main(String[] args) {
	        List<String> names = Arrays.asList("Ana", "Juan", "Pedro", "Lucía", "Carlos");

	        List<String> filteredAndUppercasedNames = names.stream()
	                                                        .filter(name -> name.length() > 4)
	                                                        .map(String::toUpperCase)
	                                                        .collect(Collectors.toList());

	        filteredAndUppercasedNames.forEach(System.out::println);
	    }
	}

