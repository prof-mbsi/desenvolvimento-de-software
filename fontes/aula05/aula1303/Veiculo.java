package aula05.aula1303;

public class Veiculo {
	
	//Atributos de Veiculo
	String placa;
	int ano;
	String modelo;
	
	//Método que estaciona um Veiculo em uma vaga
	void estacionar(Vaga vaga) {
		vaga.v = this;
		vaga.ocupada = true;
	}
}
