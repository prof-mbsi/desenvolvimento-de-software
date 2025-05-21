package aula2005;

public class Main {

	public static void main(String[] args) {

		String teste1 = "Uma pequena String para testes";
		String teste2 = "uma pequena String para testes";
		
		if(teste1.equals(teste2)) {
			System.out.println("Iguais");
		} else {
			System.out.println("Diferentes");
		}
		
		if(teste1.contains("ing")) {
			System.out.println("Contém");
		}
		
		if(teste1.endsWith("ara testes")) {
			System.out.println("Termina com tes");
		}
		
		if(teste1.startsWith("uma")) {
			System.out.println("Começa com Uma");
		}
		
		System.out.println(teste1.substring(15));
		System.out.println(teste1.substring(15, 18));
		
		System.out.println();
		String[] palavras = teste1.split(" "); 
		for (String palavra : palavras) {
			System.out.println(palavra);
		}
		
		System.out.println();
		for (int i = 0; i < palavras.length; i++) {
			System.out.println(palavras[i]);
		}
		
		System.out.println(teste1.toLowerCase());
		System.out.println(teste1.toUpperCase());
		
		System.out.println(teste1.charAt(0));
		
		System.out.println();
		String cpf = "111.222.333-44";
		String[] cpf1 = cpf.split("\\.");
		String[] cpf2 = cpf1[2].split("-"); 
		System.out.println(cpf1[0] + cpf1[1] + cpf2[0] + cpf2[1]);

		String numero = "123";
		Integer num = Integer.valueOf(numero);
		System.out.println(num * 2);

	}

}
