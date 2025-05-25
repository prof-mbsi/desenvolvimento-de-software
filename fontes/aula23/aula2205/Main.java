package aula2205;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Gato g = new Gato();
		//Mostrador lambdaMostrador = (a, d) -> System.out.println(a + " Miau com variável lambda. " + d);
		Mostrador lambdaMostrador = (a, d) -> a + " Um gato com variável lambda. " + d;
		mostrarCoisa(
				(a, d) -> {
					System.out.println(a + " Um gato lambda " + d);
					return a + " Miau " + d;
				}
		);
		mostrarCoisa(lambdaMostrador);
		/*
		 * mostrarCoisa(() -> System.out.println("Miau"));
		 */
		
		//Executando a lambda de Runnable
		System.out.println("---");
		Runnable r = () -> System.out.println("Executando!");
		r.run();
		
		//Executando a lambda de Operacao:
System.out.println("---");
		Operacao soma = (x, y) -> x + y;
		System.out.println(soma.executar(2, 3));
		
		//Exemplo de filtro:
		System.out.println("---");
		List<String> nomes = List.of("Ana", "Bruno", "Amanda", "Carlos", "Alice");
        nomes.stream()
             .filter(nome -> nome.startsWith("A"))
             .forEach(System.out::println);
        
        //Exemplo de ordenação:
        System.out.println("---");
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Ana", 25),
                new Pessoa("Carlos", 20),
                new Pessoa("Bruno", 30)
            );
            pessoas.sort((p1, p2) -> Integer.compare(p1.getIdade(), p2.getIdade()));
            pessoas.forEach(System.out::println);
            
            //Exemplo forEach:
            System.out.println("---");
            List<Integer> numeros = List.of(1, 2, 3, 4, 5);
            numeros.forEach(n -> System.out.println(n + " ao quadrado = " + (n * n)));
	}
	
	static void mostrarCoisa(Mostrador coisa) {
		System.out.println(coisa.mostrar("Saída: ", "!"));
	}

}
