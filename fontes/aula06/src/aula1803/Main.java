package aula1803;

public class Main {

	public static void main(String[] args) {

		//Cria uma Pessoa e um Endereco na memória
		Pessoa p = new Pessoa();
		Endereco e = new Endereco();
		
		//Preenche os dados de Pessoa e Endereco
		p.nome = "Maria";
		e.rua = "Rua X";
		e.numero = 4;
		e.cep = "80000";
		e.cidade = "Curitiba";
		
		/*Vincula um Endereco a uma Pessoa atribuindo o 
		 *Endereco e ao atributo end da Pessoa p
		 */
		p.end = e;
		
		//Exibe os dados para checagem
		e.exibirEndereco();
		p.exibirDados();
		
		//Cria um Processador na memória e preenche os dados
		Processador proc = new Processador();
		proc.marca = "Intel";
		proc.modelo = "XYZ";
		proc.frequenciaGHZ = 1200;
		
		//Cria um Computador na memória e preenche os dados
		Computador comp = new Computador();
		comp.marca = "Positivo";
		comp.modelo = "ABC";
		comp.preco = 2099.99;
		
		/*Vincula um Processador a um Computador atribuindo o 
		 *Processador p ao atributo processador do Computador comp
		 */
		comp.processador = proc;
		
		//Exibe os dados de comp para checagem
		comp.exibirDados();
		
		//Cria uma Carteira na memória e preenche os dados
		Carteira carteira = new Carteira();
		carteira.codigo = 456;
		carteira.dataDeValidade = "10/10/2025";
		carteira.exibirCarteira();
		
		//Cria um Aluno na memória e preenche os dados
		Aluno al = new Aluno();
		al.nome = "Cidadão";
		al.matricula = 1234;
		
		/*Vincula um Aluno a uma Carteira atribuindo a Carteira carteira 
		 *ao atributo carteiraEstudantil do Aluno al
		 */
		al.carteiraEstudantil = carteira;
		
		//Exibe os dados de al para checagem
		al.exibirInformacoes();
	}

}
