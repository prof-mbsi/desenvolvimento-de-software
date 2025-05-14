package aula0805;

public class Main {

	public static void main(String[] args) {
		
		Cachorro c = new Cachorro("Tonhão");
		Peixe p = new Peixe("Nemo");
		Triatleta t = new Triatleta("Joraifa");
		
		c.emitirSom();
		p.emitirSom();
		p.nadar();
		t.nadar();
	}

}
