package aula0805;

public class Triatleta extends Pessoa implements Nadador {

	public Triatleta(String nome) {
		super(nome);
	}

	//Método que a interface obriga a implementar
	@Override
	public void nadar() {
		System.out.println(this.nome + " nadando...");
	}
}
