package aula1505;

import java.time.format.DateTimeParseException;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		/*
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		LocalDate aniversario = LocalDate.of(2025, 12, 16);
		System.out.println(aniversario);
		System.out.println("Faltam " +
				hoje.until(aniversario).getMonths()
				+ " meses " +
				hoje.until(aniversario).getDays() 
				+ " dias ."
				);
		*/
		//System.out.println("Data formatada: " + hoje.format(dtf));
		/*
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Informe sua data de nascimento: ");
		String data = sc.nextLine();
		System.out.println("Data de nascimento recebida: " + data);
		LocalDate dataDeNascimento = LocalDate.parse(data, dtf);
		System.out.println("Data de nascimento em LocalDate: " + dataDeNascimento);
		System.out.println(dataDeNascimento.getYear());
		*/
		
		Random numero = new Random();
		System.out.println(numero.nextInt(-1000, 1000));
		System.out.println(" --- ");
		
		String texto = "Estudar Java é importante. Java é uma linguagem poderosa. "
				+ "Estudar todos os dias ajuda a entender Java melhor. "
				+ "Com Java podemos desenvolver aplicações web, desktop e mobile.";
		System.out.println(texto);
		texto = texto.replaceAll("[^a-zA-Z ]", "").toLowerCase();
		System.out.println(texto);
		String[] palavras = texto.split("\\s+");
		for (int i = 0; i < palavras.length; i++) {
			System.out.println(palavras[i]);
		}
		Set<String> palavrasUnicas = new HashSet<String>();
		for (int i = 0; i < palavras.length; i++) {
			palavrasUnicas.add(palavras[i]);
		}
		System.out.println("Quantidade de palavras: " + palavras.length);
		System.out.println("Quantidade no Set: " + palavrasUnicas.size());
		
		
		System.out.println(palavrasUnicas.toString());
		
		//Jogo de dados:
		JogoDeDados dados = new JogoDeDados();
		dados.jogar();
		
		//Cálculo de idade:
		try {
			Idade i = new Idade("10/03/2010");
			i.calculaIdade();
		} catch(DateTimeParseException e) {
			System.err.println("Erro: Formato inválido para a data de nascimento!");
		}
		
		//Números únicos:
		Numeros num = new Numeros();
		
		//Códigos String:
		Scanner sc = new Scanner(System.in);
		Set<String> codigos = new HashSet<String>();
		int continuar = 1;
		do {
			System.out.println("Informe um código: ");
			codigos.add(sc.next());
			System.out.println("Informe valor negativo para parar: ");
			continuar = sc.nextInt();
		} while(continuar >= 0);
		System.out.println("Códigos: " + codigos.toString());
	}

}
