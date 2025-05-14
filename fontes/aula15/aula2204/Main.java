package aula2204;

public class Main {

	public static void main(String[] args) {
		
		Animal[] animais = {
				new Cachorro(),
				new Gato(),
				new Vaca(),
				new Animal()
		};
		
		Pagamento[] pagamentos = {
				new PagamentoDinheiro(),
				new PagamentoCartao(),
				new PagamentoPix(),
				new Pagamento()
		};
		
		for(int i = 0; i < animais.length; i++) {
			animais[i].emitirSom();
		}
		
		System.out.println(" --- ");
		
		for(int i = 0; i < pagamentos.length; i++) {
			pagamentos[i].processarPagamento();
		}
		
		System.out.println(" --- ");
		
		FuncionarioCLT fc = new FuncionarioCLT();
		fc.setSalario(2500.0);
		FuncionarioComissionado fco = new FuncionarioComissionado();
		fco.setSalario(2050.0);
		FuncionarioHorista fh = new FuncionarioHorista();
		fh.setValorHora(80);
		System.out.println("Salário Funcionário CLT: " + fc.calcularSalario());
		System.out.println("Salário Funcionário Comissionado: " + fco.calcularSalario(8500, 3));
		System.out.println("Salário Funcionário Horista: " + fh.calcularSalario(20));
	}
}
