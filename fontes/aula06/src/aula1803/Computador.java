package aula1803;

public class Computador {
	
	//Atributosde Computador
	String marca;
	String modelo;
	double preco;
	//Associação entre Computador e Processador
	Processador processador;
	
	//Método que exibe dados de Computador e o Processador vinculado
	void exibirDados() {
		System.out.println("Modelo: " + this.modelo + ", processador: "
				+ processador.modelo + ", frequêcia: " 
				+ processador.frequenciaGHZ + ", preço: " + this.preco);
	}
}
