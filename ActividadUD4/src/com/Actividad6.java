package com;

public class Actividad6 {

	public static void main(String[] args) {
		System.out.println(vocal('e'));
	}

	public static boolean vocal(char a1) {
		if (a1 == 'a' || a1 == 'e' || a1 == 'i' || a1 == 'o' || a1 == 'u') {
			return true;
		}
		return false;
	}
}
