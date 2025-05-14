package aula0605;

public class Main {

	public static void main(String[] args) {
		/*
		 * As linhas abaixo não compilam, pois Animal e Funcionario são classes 
		 * abstratas, portanto, não podem ser instanciadas
		 * 
		 * Animal a = new Animal();
		 * Funcionario f = new Funcionario();
		 */
		Cachorro c = new Cachorro("Tonhão");
		c.emitirSom();
		
		System.out.println(" --- ");
		
		FuncionarioCLT fc = new FuncionarioCLT();
		fc.salario = 2500;
		System.out.println(fc.calculaSalario());
		
		System.out.println(" --- ");
		
		FuncionarioPJ fp = new FuncionarioPJ();
		fp.valorHora = 16;
		fp.horasTrabalhadas = 160;
		System.out.println(fp.calculaSalario());
	}

}
