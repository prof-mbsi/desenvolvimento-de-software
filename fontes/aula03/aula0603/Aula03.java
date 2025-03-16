package aula03.aula0603;

//Classe que cria os objetos que fazem a leitura de dados pelo console
import java.util.Scanner;

public class Aula03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		//Ex.1: Array que usaremos para guardar os números informados
		int numeros[] = new int[5];
		
		//Ex.1: Variável usada para somar os elementos do array numeros
		int soma = 0;

		//Ex2. Variáveis para guardar maior e menor número do array
		int maior = 0, menor = 0;
		
		//Ex3. Variáveis que contam a quantidade de pares e ímpares
		int par = 0, impar = 0;
		
		//Ex4. Array que armazena o array numeros invertido:
		int arrayNumerosInvertido[] = new int[5];
		
		for (int i = 0; i < numeros.length; i++) {
			
			//Ex1. Conclui a lógica do exercício:
			System.out.println("Informe número inteiro: ");
			numeros[i] = sc.nextInt();			
			soma = soma + numeros[i];
			
			//Ex2. Adicionado para encontrar maior e menor número:
			if(i == 0) {
				maior = numeros[i];
				menor = numeros[i];
			} else {
				
				if(numeros[i] > maior) {
					maior = numeros[i];
				}
				
				if(numeros[i] < menor) {
					menor = numeros[i];
				}
			}
			
			//Ex3. Adicionado para contar pares e ímpares:
			if(numeros[i] % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		
		//Exibe array numeros para comparação com o array invertido:
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(" | " + numeros[i]);
		}
		System.out.print(" | ");
		//Pula uma linha para melhor visualização no console:
		System.out.println();
		
		//Ex4. Inverte numeros em arrayNumerosInvertido: 
		for (int i = 0 ; i < arrayNumerosInvertido.length ; i++) {
			arrayNumerosInvertido[i] = numeros[4-i];
		}

		//Ex4. Exibe o arrayNumerosInvertido para comparação com numeros:
		for (int i = 0; i < arrayNumerosInvertido.length; i++) {
			System.out.print(" | " + arrayNumerosInvertido[i]);
		}
		System.out.print(" | ");
		//Pula uma linha para melhor visualização no console:
		System.out.println();
		
		//Ex5. Array double e variáveis para calcular a média
		double[] vetorDouble = new double[5];
		double somaDouble = 0, mediaDouble = 0;
		
		//Ex5. Preenche o array somando cada item para, posteriormente, calcular a média:
		for (int i = 0; i < vetorDouble.length; i++) {
			System.out.println("Informe valor double: ");
			vetorDouble[i] = sc.nextDouble();
			somaDouble += vetorDouble[i];
		}

		/*
		 * Ex5. Divide o total somado pelo número de elementos do array (arrayNumerosInvertido.length).
		 * A vantagem de se usar essa notação é que, ao atualizar o tamanho do array na linha em que ele
		 * foi declarado, no nosso caso linha 79, não precisamos alterar os loops que percorrem o array
		 * definidos com arrayNumerosInvertido.length ou o cálculo da média.
		 */
		mediaDouble = somaDouble / arrayNumerosInvertido.length;

		//Exibe os resultados solicitados para checagem:
		System.out.println("Soma: " + soma);
		System.out.println("Maior número informado: " + maior);
		System.out.println("Menor número informado: " + menor);
		System.out.println("Total de pares: " + par);
		System.out.println("Total de ímpares: " + impar);
		System.out.println("Média dos números double informados: " + mediaDouble);

		//Fecha o objeto Scanner - boa prática:
		sc.close();
	}

}
