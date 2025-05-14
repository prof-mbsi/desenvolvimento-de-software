package aula2204;

public class PagamentoCartao extends Pagamento{
	
	@Override
	public void processarPagamento() {
		System.out.println("Pagamento realizado com cartão!");
	}
}
