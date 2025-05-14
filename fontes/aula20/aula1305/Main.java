package aula1305;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * Exemplos comuns de exceções:
		 * ArithmeticException
		 * NullPointerException
		 * ArrayIndexOutOfBoundsException
		 * NumberFormatException
		 * InputMismatchException
		 * 
		 * Motivo para tratar exceções:
		 * Evitar que o programa "quebre" ao encontrar
		 * um erro inesperado, garantindo seu funcionamento
		 * 
		 * Exemplo 1:
		 */
		try {
			int resultado = 10 / 0;
			System.out.println("Resultado: " + resultado);
		} catch (ArithmeticException e){
			System.err.println("Erro: divisão por 0!");
		}
		
		//Exemplo 2:
		try {
			int[] numeros = {1, 2, 3};
			System.out.println(numeros[5]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("Erro: Posição fora do limite do array!");
		}
		
		//Exemplo 3:
		try {
			String valor = "1o";
			int numero = Integer.parseInt(valor);
			System.out.println(numero);
		} catch(NumberFormatException e) {
			System.err.println("Erro: Valor inválido para conversão!");
		}
		
	}

}
