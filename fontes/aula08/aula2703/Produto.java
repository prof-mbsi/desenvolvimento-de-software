package aula2703;

public class Produto {
	
	public String nome;
	
	//Teste de atributo de classe (static)
	public static int estoqueMinimo = 5;
	
	void exibirProduto() {
		System.out.println("Nome: " + nome + 
				", estoque mínimo: " + estoqueMinimo);
	}

}
