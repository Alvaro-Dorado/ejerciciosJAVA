package com;

import java.util.Scanner;

public class Actividad10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean lluvia, tarea, biblioteca, salir;

		System.out.println("¿Esta lloviendo?");
		lluvia = sc.nextBoolean();

		System.out.println("¿Has terminado la tarea?");
		tarea = sc.nextBoolean();

		System.out.println("¿Vas a la biblioteca?");
		biblioteca = sc.nextBoolean();

		salir = (!lluvia && tarea) || (biblioteca);
		System.out.println("¿Podra salir?" + salir);
	}

}
