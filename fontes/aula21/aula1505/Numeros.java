package aula1505;

import java.util.HashSet;
import java.util.Set;

public class Numeros {
	
	int[] numeros = {8, 5, 7, 8, 5, 13, 4, 8, 3, 5};
	
	public Numeros() {
		Set<Integer> numerosUnicos = new HashSet<Integer>();
		for (Integer num : numeros) {
			numerosUnicos.add(num);
		}
		System.out.println("Conjunto: " + numerosUnicos.toString());
		System.out.println("Total de elementos: " + numerosUnicos.size());
	}
}
