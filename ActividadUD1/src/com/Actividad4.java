package com;

import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el año actual");
		int añoac = sc.nextInt();
		System.out.println("Dime tu año de nacimiento");
		int añona = sc.nextInt();
		int usuario = añoac - añona;
		System.out.println("tu edad sera: " + usuario);

	}

}
