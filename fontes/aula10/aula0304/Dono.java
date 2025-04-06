package aula0304;

public class Dono {
	
	private String nome;
	private String telefone;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void exibirDados() {
		System.out.println("Dono: " + this.getNome() + ", telefone: " + this.getTelefone());
	}

}
