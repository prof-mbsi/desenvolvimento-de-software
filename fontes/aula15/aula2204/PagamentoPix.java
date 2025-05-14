package aula2204;

public class PagamentoPix extends Pagamento{
	
	@Override
	public void processarPagamento() {
		System.out.println("Pagamento realizado com PIX!");
	}
}
