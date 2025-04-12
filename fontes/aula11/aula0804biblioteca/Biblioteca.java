package aula0804biblioteca;

public class Biblioteca {
	
	private Livro[] acervo;
	
	//Construtor que recebe a quantidade de livros da Biblioteca
	public Biblioteca(int quantidadeDeLivros) {
		this.acervo = new Livro[quantidadeDeLivros];
	}

	//Getters e setters
	public Livro[] getAcervo() {
		return acervo;
	}
	public void setAcervo(Livro[] acervo) {
		this.acervo = acervo;
	}

	//Métodos da classe
	
	public void adicionarLivro(Livro l) {
		//boolean que controla quando o livro é adicionado ou não
		boolean adicionou = false;
		for (int i = 0; i < acervo.length; i++) {
			//Se tem espaço no array, adiciona o livro na posição livre
			if(this.acervo[i] == null) {
				this.acervo[i] = l;
				//Armazena true para saber que adicionou e sai do loop (break;)
				adicionou = true;
				break;
			}
		}
		//Se não tinha espaço, exibe mensagem de erro
		if(!adicionou) {
			System.err.println("O array de livros está cheio!");
		}
	}
	
	public void listarTodos() {
		/*
		 * Percorre o array e chama o método exibirInfo()
		 * para cada livro encontrado
		 */
		for (int i = 0; i < acervo.length; i++) {
			if(acervo[i] != null) {
				acervo[i].exibirInfo();
			}
		}
	}
	
	public void consultarLivro(Livro l) {
		//boolean que controla quando o livro é encontrado ou não
		boolean encontrado = false;
		for (int i = 0; i < acervo.length; i++) {
			if(acervo[i] == l) {
				/*
				 * Armazena true para saber que encontrou e formata
				 * a saída com exibirInfo() de Livro, atribuindo true
				 * para saber que encontrou e sai do loop (break;)
				 */
				encontrado = true;
				System.out.print("Encontrado: ");
				acervo[i].exibirInfo();
				break;
			}
		}
		//Se não encontrou, mostra mensagem de erro
		if(!encontrado) {
			System.err.println("Livro " + l.getTitulo() + " não está no acervo!");
		}
	}

}
