package aula0104;

public class Main {

	public static void main(String[] args) {
		/*
		Pessoa p = new Pessoa();
		p.mostrarPessoa();
		p.setNome("Cidadão");
		p.setIdade(20);
		p.mostrarPessoa();
		
		Aluno a = new Aluno();
		a.setNome("Primeiro Aluno");
		a.setMatricula(1011);
		a.setNota(12);
		a.mostrarAluno();
		*/
		/*
		Produto prod = new Produto();
		prod.mostrarProduto();
		prod.setNome("Mouse");
		prod.setQuantidade(-10);
		prod.setPreco(-1);
		prod.mostrarProduto();
		*/
		
		ContaBancaria cb = new ContaBancaria();
		System.out.println(cb.getSaldo());
		cb.depositar(40);
		System.out.println(cb.getSaldo());
		cb.sacar(27);
		System.out.println(cb.getSaldo());
		
		Livro[] livros = new Livro[3];
		livros[0] = new Livro();
		livros[0].setTitulo("O Pequeno Príncipe");
		livros[0].setAno(1943);
		
		livros[1] = new Livro();
		livros[1].setTitulo("Moby Dick");
		livros[1].setAno(1851);
		
		livros[2] = new Livro();
		livros[2].setTitulo("Cem Anos de Solidão");
		livros[2].setAno(1967);
		
		Biblioteca b = new Biblioteca(3);
		b.setLivros(livros);
		b.exibirLivros();
		
	}

}
