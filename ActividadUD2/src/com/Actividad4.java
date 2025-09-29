package com;

import java.util.Scanner;

public class Actividad4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;

		System.out.println("Introduzca el primer numero");
		num1 = sc.nextInt();
		System.out.println("Introduzca el segundo numero");
		num2 = sc.nextInt();
		if (num1 == num2) {
			System.out.println("el numero " + num1 + " es igual a " + num2);
		} else if(num1>num2){
			System.out.println("el numero " + num2 + " es mayor que " + num1);
		}else {
				System.out.println("el numero " + num1 + " es mayor que " + num2);
			}


	}
}
