package aula0304;

public class Pet {
	private String nome;
	private String especie;
	private Dono dono;
	
	//Construtor
	public Pet(String nome, String especie, Dono dono) {
		super();
		this.setNome(nome);
		this.setEspecie(especie);
		this.setDono(dono);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public Dono getDono() {
		return dono;
	}
	public void setDono(Dono dono) {
		this.dono = dono;
	}
	
	public void exibirDados() {
		System.out.println();
		System.out.println("Pet: " + this.getNome() + ", espécie: " + this.getEspecie() 
			+ ", dono: " + this.getDono().getNome());
	}
}
