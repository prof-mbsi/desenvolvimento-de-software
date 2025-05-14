package aula0805;

public class Peixe extends Animal implements Nadador {

	public Peixe(String nome) {
		super(nome);
	}

	//Método que a interface obriga a implementar
	@Override
	public void nadar() {
		System.out.println("Peixe nadando...");
	}

	//Método que a superclasse obriga a implementar
	@Override
	public void emitirSom() {
		System.out.println("Glub");
	}
}
