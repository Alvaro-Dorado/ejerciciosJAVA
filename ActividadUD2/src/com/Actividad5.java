package com;

import java.util.Scanner;

public class Actividad5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1;
		
		System.out.println("Introduzca un numero entre el 1 al -1");
		num1 = sc.nextDouble();
		
		if(((num1 > 0 ) && (num1 < 1)) || ((num1 < 0) && (num1 > -1))) {
			System.out.println("Es casi cero");
		}else {
				System.out.println("Esta alejado del cero");
			}

	}
}
