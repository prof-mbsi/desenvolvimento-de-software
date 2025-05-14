package aula0805;

public class Cachorro extends Animal{

	public Cachorro(String nome) {
		super(nome);
	}

	//Método que a superclasse obriga a implementar
	@Override
	public void emitirSom() {
		System.out.println("Au au");		
	}
}
