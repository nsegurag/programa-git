package com.ns.calcularEdad;

import java.time.LocalDate; // Importa la clase LocalDate para manejar fechas sin hora
import java.time.Period; // Importa la clase Period para calcular períodos de tiempo entre fechas
import java.util.Scanner; // Importa la clase Scanner para leer la entrada del usuario

public class calcularEdad {

    public static void main(String[] args) {

        Scanner ingresoDatos = new Scanner(System.in); // Variable para obtener datos por teclado

        System.out.println("Introduce tu fecha de nacimiento (en formato yyyy-mm-dd):"); // Mmensaje pidiendo al usuario que introduzca su fecha de nacimiento
        String fechaNacimientoPersona = ingresoDatos.nextLine(); // Lee la fecha de nacimiento ingresada por el usuario como una cadena de texto
        LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoPersona); // Convierte la cadena de texto en un objeto LocalDate

        LocalDate hoy = LocalDate.now(); // Obtiene la fecha actual
        
         Period edad = Period.between(fechaNacimiento, hoy); // Calcula el período de tiempo entre la fecha de nacimiento y la fecha actual
     
        System.out.println("Tu edad es: " + edad.getYears() + " años");
    }
}
