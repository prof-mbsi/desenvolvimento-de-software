package aula1803;

public class Processador {
	
	//Atributos de Processador
	String marca;
	String modelo;
	int frequenciaGHZ;
	
	//Método que exibe os dados de Processador
	void exibir() {
		System.out.println("Processador [marca=" + marca + ", modelo=" + modelo + 
				", frequenciaGHZ=" + frequenciaGHZ + "]");
	}
}
