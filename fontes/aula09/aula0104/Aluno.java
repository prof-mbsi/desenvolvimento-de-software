package aula0104;

public class Aluno {
	
	private String nome;
	private int matricula;
	private double nota;
	
	//Construtor
	public Aluno() {
		this.nome = "Desconhecido";
		this.matricula = 0;
		this.nota = 0;
	}
	
	//Getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		if(nota >= 0 && nota <= 10) {
			this.nota = nota;
		} else {
			System.err.println("Nota fora do intervalo permitido!");
		}
	}
	
	//Método para exibir dados do Aluno
	public void mostrarAluno() {
		System.out.println("Nome: " + this.nome + ", matrícula: " 
				+ this.matricula + ", nota: " + this.nota);
	}
}
