package com;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] notas = new int[5][3];
		double media1, media2, media3;
		double mediaAlumno;
		int num_alumno;
		for (int colum = 0; colum < notas[0].length; colum++) {
			for (int filas = 0; filas < notas.length; filas++) {
				System.out.println("Escribe la nota del trimestre " + (colum + 1) + " y del alumno " + (filas + 1));
				notas[filas][colum] = sc.nextInt();
			}
		}

		imprimirMatriz(notas);
		media1 = mediaColumnaMatriz(notas, 0);
		System.out.println("Media primer trimestre: " + media1);
		media2 = mediaColumnaMatriz(notas, 1);
		System.out.println("Media primer trimestre: " + media2);
		media3 = mediaColumnaMatriz(notas, 2);
		System.out.println("Media primer trimestre: " + media3);
		do {
			System.out.println("Dime el alumno a comprobar su media (1-5) (-1 para salir)");
			num_alumno = sc.nextInt();

			if (num_alumno >= 1 && num_alumno <= 5) {
				mediaAlumno = mediaFilaMatriz(notas, num_alumno - 1);
				System.out.println("La media del alumno introducido es: " + mediaAlumno);
			} else if (num_alumno < 1 && num_alumno > 5 && num_alumno != -1) {
				System.err.println("Ese no es un valor válido");
			}
		} while (num_alumno != -1);
		System.out.println("Saliendo...");
	}

	public static void imprimirMatriz(int[][] matriz) {
		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz[x].length; y++) {
				System.out.print(matriz[x][y]);
				if (y != matriz[x].length - 1)
					System.out.print("\t");
			}
			System.out.println();
		}
	}

	public static double mediaColumnaMatriz(int[][] m, int columna) {
		double acum = 0, media = 0;
		for (int i = 0; i < m.length; i++) {
			acum += m[i][columna];
		}
		media = acum / m.length;
		return media;
	}

	public static double mediaFilaMatriz(int[][] m, int fila) {
		double acum = 0, media = 0;
		for (int i = 0; i < m[0].length; i++) {
			acum += m[fila][i];
		}

		media = acum / m[0].length;
		return media;
	}
}