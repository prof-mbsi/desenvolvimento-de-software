package aula1505;

import java.util.Random;

public class JogoDeDados {
	
	public static void jogar() {
		
		System.out.println();
		
		Random dado1 = new Random();
		Random dado2 = new Random();
		int d1 = dado1.nextInt(1, 6);
		int d2 = dado2.nextInt(1, 6);
		
		System.out.println("Dado 1: " + d1);
		System.out.println("Dado 2: " + d2);
		System.out.println("Total: " + (d1 + d2));
	}

}
