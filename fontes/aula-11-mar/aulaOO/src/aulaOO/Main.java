package aulaOO;

public class Main {

	public static void main(String[] args) {

		/*Cria cli na memória (objeto do tipo Cliente), passando como parâmetro
		 * uma String conforme definido no construtor de Cliente.
		 */
		Cliente cli = new Cliente("Marlon");
		
		//Popula o atributo cpf de cli
		cli.cpf = "0123";
		
		/*Cria c na memória (objeto do tipo Conta), passando como parâmetro
		 * um Cliente, criado na linha 10 conforme definido no construtor de Conta.
		 */
		Conta c = new Conta(cli);
		//Popula dados da conta
		c.saldo = 200;
		c.numero = 222;
		
		//Mostra que o Cliente cli está vinculado à Conta c ao acessar c.cliente.nome
		System.out.println("Conta: " + c.numero + ", Nome do cliente: " + c.cliente.nome);
		
		//Testa o método depositar():
		c.depositar(125);
		//Mostra estado de c após depósito
		c.mostrar();
		
		//Testa o método sacar(double quantidade)
		c.sacar(450);
		//Mostra estado de c após saque
		c.mostrar();
		
		//Cria cli2 na memória e define nome (pelo construtor) e cpf	
		Cliente cli2 = new Cliente("Cliente");
		cli2.cpf = "2222";
		
		/*
		 * Cria cli3 na memória e define nome (pelo construtor) e cpf com os mesmos 
		 * dados de cli2 para testar se cli2 e cli3 são iguais
		 */
		Cliente cli3 = new Cliente("Cliente");
		cli3.cpf = "2222";
		
		//cli2 = cli3;
		
		/* Testa se cli2 e cli3 são iguais. Se a linha 47 estiver comentada, a saída
		 * esperada é "São iguais", caso contrário, a saída deve ser "Não são iguais"
		 */
		if(cli2 == cli3) {
			System.out.println("São iguais");
		} else {
			System.out.println("Não são iguais");
		}
		
		/*
		 * Exibe os identificadores de objeto para checagem. Se a linha 47 estiver
		 * comentada eles devem ser diferentes, caso contrário, devem ser iguais
		 */
		System.out.println("cli2: " + cli2 + ", cli3: " + cli3);
		
	}

}
