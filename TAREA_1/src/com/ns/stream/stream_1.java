package com.ns.stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class stream_1 {

	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	        List<Integer> squaredEvens = numbers.stream()
	                                             .filter(n -> n % 2 == 0)
	                                             .map(n -> n * n)
	                                             .collect(Collectors.toList());
	        squaredEvens.forEach(System.out::println);
	    }
	}
