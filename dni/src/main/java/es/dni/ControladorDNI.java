package es.dni;

import java.util.Random;

public class ControladorDNI {
	private final char[] LETRAS = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
			'V', 'H', 'L', 'C', 'K', 'E' };
	private final int DIVISOR = 23;
	private final int LONGITUD_NUMERO_DNI = 8;
	private final int LONGITUD_NUMERO_COMPLETO = 9;

	/*
	 * private char calcularLetra(String numeroDNI) { int num= Interger; return; }
	 */
	public String generarAleatorioDNI() {
		Random random = new Random();
		int test = random.nextInt(100_000_000);
		String numero = String.format("%08d", random);
		System.out.println(test);
		return numero;
	}
}
