package aula0104;

public class Produto {
	
	private String nome;
	private int quantidade;
	private double preco;
	
	public Produto() {
		this.nome = "Produto padrão";
		this.quantidade = 0;
		this.preco = 0;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		if(quantidade >= 0) {
			this.quantidade = quantidade;
		} else {
			System.err.println("A quantidade deve ser maior que 0!");
		}
	}	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		if(preco > 0) {
			this.preco = preco;
		} else {
			System.err.println("O preço deve ser maior que 0!");
		}
	}

	public void mostrarProduto() {
		System.out.println("Produto: " + this.nome + ", quantidade: " 
				+ this.quantidade + ", preço: " + this.preco);
	}

}
