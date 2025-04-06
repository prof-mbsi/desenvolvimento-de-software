package aula0104;

public class Biblioteca {

	private Livro[] livros;
	
	public Biblioteca(int quantidadeDeLivros) {
		this.livros = new Livro[quantidadeDeLivros];
		setLivros(this.livros);
	}

	public Livro[] getLivros() {
		return livros;
	}

	public void setLivros(Livro[] livros) {
		this.livros = livros;
	}
	
	public void exibirLivros() {
		System.out.println();
		System.out.println("---Relatório de livros da biblioteca---");
		for (int i = 0; i < livros.length; i++) {
			System.out.println("Livro: " + this.getLivros()[i].getTitulo());
			System.out.println("Ano de publicação: " + this.getLivros()[i].getAno());
		}
	}
}
