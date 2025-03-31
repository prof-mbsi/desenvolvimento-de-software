package aula2703;

public class Main {

	public static void main(String[] args) {
		
		Relogio r = new Relogio();
		//As linhas abaixo não funcionam, pois os atributos são private
		//(Só podem ser acessados pela própria classe)
		//r.h = 858585;
		//r.m = 999;
		//r.s = 333;
		
		//Atributos são populados por métodos da própria classe,
		//implementando o conceito de encapsulamento.
		r.definirHora(20);
		r.definirMinuto(35);
		r.definirSegundo(55);
		r.exibirHora();
		
		Produto p = new Produto();
		p.nome = "Arroz";
		p.exibirProduto();
		//p.estoqueMinimo = 10;
		
		//Acesso a um atributo de classe: NomeDaClasse.atributo
		System.out.println(Produto.estoqueMinimo);

	}

}
