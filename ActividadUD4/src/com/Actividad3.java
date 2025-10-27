package com;

public class Actividad3 {

	public static void main(String[] args) {
		System.out.println("DIme que quieres calcular area o volumen");
		cilindro(1.0, 1.0);

	}

	public static void cilindro(double radio, double altura) {
		double area = 2 * Math.PI * radio * (altura + radio);
		double volumen = Math.PI * Math.pow(radio, 2) * altura;
		System.out.println("El area es " + area);
		System.out.println("El volumen es " + volumen);
	}
}
