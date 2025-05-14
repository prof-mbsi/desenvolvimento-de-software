package aula1504;

public class Main {

	public static void main(String[] args) {
		/*
		 * Cria o array de figuras populando com objetos de forma semelhante a 
		 * quando fazemos int[] numeros = {1, 2, 3, 4};
		 * No caso abaixo, em vez de números inteiros, passamos objetos do tipo 
		 * Figura em cada posição do array
		 */
		Figura[] figuras = {
	            new Retangulo(4, 5),
	            new Circulo(3),
	            new Triangulo(6, 4),
	            new Trapezio(10, 6, 4)
	        };

        for (int i = 0; i < figuras.length; i++) {
            System.out.println("Área: " + figuras[i].calcularArea());
        }
	}

}
