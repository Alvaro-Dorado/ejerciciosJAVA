package com;

import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int edad, alumn, mediaEdad, mayorEdad, sumaEdad;

		alumn = 0;
		mayorEdad = 0;
		mediaEdad = 0;
		sumaEdad = 0;

		do {
			System.out.println("Dime la edad del alumno");
			edad = sc.nextInt();
			if (edad >= 0) {
				alumn++;
				sumaEdad = sumaEdad + edad;
				mediaEdad = sumaEdad / alumn;
			}
			if (edad > 18) {
				mayorEdad++;
			}
		} while (edad >= 0);
		System.out.println("La suma de las edades es: " + sumaEdad);
		System.out.println("La media de las edades es: " + mediaEdad);
		System.out.println("El total de los alumnos es: " + alumn);
		System.out.println("Los alumnos mayores de edad es: " + mayorEdad);
	}

}
