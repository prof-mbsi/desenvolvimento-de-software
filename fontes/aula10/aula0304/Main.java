package aula0304;

public class Main {

	public static void main(String[] args) {

		ContaBancaria c1 = new ContaBancaria("Devedor", 800);
		ContaBancaria c2 = new ContaBancaria("Credor", 500);
		c1.exibirDados();
		c2.exibirDados();
		c1.realizarTransferencia(130, c2);
		c1.exibirDados();
		c2.exibirDados();
		
		Dono d = new Dono();
		d.setNome("Cidadão");
		d.setTelefone("41999991111");
		
		Pet p = new Pet("Rex", "Cachorro", d);
		p.exibirDados();

	}

}
