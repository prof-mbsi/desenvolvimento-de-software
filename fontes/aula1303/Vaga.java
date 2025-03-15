package aula1303;

public class Vaga {
	
	//Atributos de Vaga
	int numero;
	boolean ocupada;
	Veiculo v;
	
	//Método que exibe os dados da Vaga com o Veículo estacionado
	void exibir() {
		System.out.println("Vaga número: " + numero + 
				", ocupada por: " + v.placa);
	}
}
