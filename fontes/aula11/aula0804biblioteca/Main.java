package aula0804biblioteca;

public class Main {
	
	public static void main(String[] args) {
		Autor a = new Autor();
		a.setNome("Autor");
		a.setNacionalidade("Brasileiro");
		Genero g = new Genero();
		g.setDescricao("Drama");
		Livro l = new Livro("Teste Livro", 2012, g, a);
		Biblioteca b = new Biblioteca(2);
		b.adicionarLivro(l);
		b.adicionarLivro(l);
		//Adiciona terceiro livro para forçar o erro
		b.adicionarLivro(l);
		b.listarTodos();
		b.consultarLivro(l);
		Livro l1 = new Livro("Outro Livro", 2010, g, a);
		b.consultarLivro(l1);
	}

}
