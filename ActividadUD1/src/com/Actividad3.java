package com;

import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu edad");
		int edad = sc.nextInt();
		System.out.println("tu edad sera: " + (edad + 1));
	}

}