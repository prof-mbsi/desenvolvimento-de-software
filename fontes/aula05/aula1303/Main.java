package aula05.aula1303;

public class Main {

	public static void main(String[] args) {
		
		//Cria um Retangulo e popula suas variáveis
		Retangulo r1 = new Retangulo();
		r1.altura = 4;
		r1.largura = 7;
		
		//Exibe resultado retornado pelo método
		System.out.println("Área do retângulo r1: " + r1.calculaArea());
		System.out.println("Perímetro do retângulo r1: " + r1.calculaPerimetro());
		
		//Cria um relogio e popula suas variáveis
		Relogio rel = new Relogio();
		
		//Exibe hora em branco para checagem
		rel.exibirHora();
		//Define uma nova hora
		rel.definirHora(20, 04, 45);
		//Exibe hora definida para checagem
		rel.exibirHora();
		
		//Cria um Veiculo e popula suas variáveis
		Veiculo ve1 = new Veiculo();
		ve1.ano = 2000;
		ve1.modelo = "Fusca";
		ve1.placa = "ABC1234";
		
		//Cria uma Vaga e popula suas variáveis
		Vaga va1 = new Vaga();
		va1.numero = 10;
		
		//Estaciona um Veiculo na Vaga
		ve1.estacionar(va1);
		
		//Exibe estado da Vaga para checagem
		va1.exibir();
		
		//Cria um Passaporte e popula suas variáveis
		Passaporte pass1 = new Passaporte();
		pass1.numero = "FG444";
		pass1.pais = "Brasil";
		
		//Cria uma Pessoa e popula suas variáveis
		Pessoa p1 = new Pessoa();
		p1.nome = "Jorge";
		//Vinculaum Passaporte a p1
		p1.vincularPassaporte(pass1);
		//Exibe dados do Passaporte
		p1.exibirDados();
	}
}
