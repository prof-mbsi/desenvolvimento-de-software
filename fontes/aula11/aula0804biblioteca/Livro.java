package aula0804biblioteca;

public class Livro {

	private String titulo;
	private int ano;
	private Genero genero;
	private Autor autor;
	
	//Construtor com campos
	public Livro(String titulo, int ano, Genero genero, Autor autor) {
		super();
		this.titulo = titulo;
		this.ano = ano;
		this.genero = genero;
		this.autor = autor;
	}
	
	//Getters e setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	//Métodos da classe
	public void exibirInfo() {
		System.out.println("Livro [titulo=" + titulo + ", ano=" 
				+ ano + ", genero=" + genero.getDescricao() 
				+ ", autor=" + autor.getNome() + "]");
	}

}
