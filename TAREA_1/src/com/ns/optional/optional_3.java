package com.ns.optional;

import java.util.Optional;

public class optional_3 {

    public static void main(String[] args) {

        Optional<String> result1 = findValue("clave1");
        Optional<String> result2 = findValue("claveInexistente");

        result1.ifPresent(value -> System.out.println("Valor encontrado: " + value));
        result2.ifPresent(value -> System.out.println("Valor encontrado: " + value));

        System.out.println("Resultado con valor predeterminado: " + result2.orElse("Valor no encontrado"));
    }

    private static Optional<String> findValue(String key) {
        if ("clave1".equals(key)) {
            return Optional.of("Valor para clave1");
        } else {
            return Optional.empty();
        }
    }
}
