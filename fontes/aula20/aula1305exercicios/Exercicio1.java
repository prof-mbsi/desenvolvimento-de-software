package aula1305exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//Ex1:
		/*
		try {
			System.out.println("Informe valor para a: ");
			int a = s.nextInt();
			System.out.println("Informe valor para b: ");
			int b = s.nextInt();
			System.out.println(a/b);
		} catch(ArithmeticException e) {
			System.err.println("Erro: divisão por 0!");
		} catch(InputMismatchException e) {
			System.err.println("Erro: tipo inválido para campo int!");
		}
		*/
		
		//Ex2:
		
		int[] numeros = {1, 2, 3, 4, 5};
		System.out.println("Informe um índice para mostrar o conteúdo: ");
		try {
			int indice = s.nextInt();
			System.out.println(numeros[indice]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("Erro: Índice inválido!");
		}catch(InputMismatchException e) {
			System.err.println("Erro: Valor para índice é inválido!");
		}finally {
			System.out.println("O bloco finally sempre é executado!");
		}
		
		
		//Ex3:
		/*
		System.out.println("Informe sua idade: ");
		try {
			int idade = s.nextInt();
			System.out.println("Idade informada: " + idade);
		}catch(InputMismatchException e) {
			System.err.println("Erro: Formato inválido para o campo idade!");
		}
		*/
	}

}
