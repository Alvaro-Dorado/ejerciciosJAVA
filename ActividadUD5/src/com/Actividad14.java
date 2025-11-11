package com;

public class Actividad14 {
	public static void main(String[] args) {
		int[] ganadora = { 1, 2, 3, 4, 5, 6 };
		int[] jugadora = { 1, 2, 5, 8, 10, 3330 };
		int aciertos = numAciertos(ganadora, jugadora);
		System.out.println("El numero de aciertos es: " + aciertos);
	}

	public static int numAciertos(int[] t1, int[] t2) {
		int aciertos = 0;
		for (int i = 0; i < t2.length; i++) {
			for (int j = 0; j < t1.length; j++) {
				if (t2[i] == t1[j]) {
					aciertos++;
				}
			}
		}
		return aciertos;
	}
}