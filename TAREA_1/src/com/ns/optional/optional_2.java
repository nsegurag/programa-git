package com.ns.optional;

import java.util.Optional;

public class optional_2 {

    public static void main(String[] args) {

        Optional<String> optionalWithValue = Optional.of("Hola");
        Optional<String> emptyOptional = Optional.empty();

        System.out.println("Valor presente: " + optionalWithValue.orElse("No hay valor"));

        System.out.println("Valor presente: " + emptyOptional.orElse("No hay valor"));

        Optional<String> upperCaseOptional = optionalWithValue.map(String::toUpperCase);
        System.out.println("Valor en mayúsculas: " + upperCaseOptional.orElse("No hay valor"));
    }
}
