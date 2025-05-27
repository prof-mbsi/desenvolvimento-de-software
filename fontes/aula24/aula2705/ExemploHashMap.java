package aula2705;

import java.util.HashMap;
import java.util.HashSet;


public class ExemploHashMap {
	
	public static void main(String[] args) {
		
		//HashMap:
		HashMap<String, Double> produtos = new HashMap<>();

		// put() — Adiciona um par chave-valor
		produtos.put("Arroz", 4.50);
		produtos.put("Feijão", 7.20);
		produtos.put("Macarrão", 3.80);

		// get() — Recupera valor pela chave
		System.out.println("Preço do Feijão: " + produtos.get("Feijão"));
		
		// remove() — Remove par pela chave
		produtos.remove("Macarrão");

		// Exibir todo o mapa
		for (String produto : produtos.keySet()) {
			System.out.println(produto + ": " + produtos.get(produto));
		}   
		HashMap<Produto, Integer> estoque = new HashMap<>();
		
		Produto p1 = new Produto("Teclado", 101);
		Produto p2 = new Produto("Mouse", 102);
		Produto p3 = new Produto("Monitor", 103);

		estoque.put(p1, 10);
		estoque.put(p2, 20);
		estoque.put(p3, 5);

		// Procurar quantidade de um produto
		Produto busca = new Produto("Mouse", 102);

		if (estoque.containsKey(busca)) {
			System.out.println("Estoque de " + busca.nome + ": " + estoque.get(busca) + " unidades");
		} else {
			System.out.println("Produto não encontrado.");
		}
        
		//Testando métodos sobrescritos equals e hash:
		Produto p4 = new Produto("Caderno", 104);
		Produto p5 = new Produto("Caderno", 104);
		Produto p6 = new Produto("Caneta", 106);

		System.out.println("p4.equals(p5)? " + p4.equals(p5)); // true
		System.out.println("p4.hashCode(): " + p4.hashCode());
		System.out.println("p5.hashCode(): " + p5.hashCode());

		System.out.println("p4.equals(p6)? " + p4.equals(p6)); // false
		System.out.println("p6.hashCode(): " + p6.hashCode());

		// Exemplo usando HashSet
		HashSet<Produto> produtosSet = new HashSet<>();
		produtosSet.add(p4);
		produtosSet.add(p5);  // não será adicionado porque é igual a p4
		produtosSet.add(p6);

		System.out.println("Produtos no HashSet: " + produtosSet);
		System.out.println("p4 == p5? " + (p4 == p5));
	}
}
