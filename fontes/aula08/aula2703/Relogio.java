package aula2703;

public class Relogio {
	
	//Atributos private para possibilitar o encapsulamento
	private int hora;
	private int minuto;
	private int segundo;
	
	//Método protected. Tem visibilidade public + subclasses + pacote
	protected void exibirHora() {
		System.out.println(hora + ":" + minuto + ":" + segundo);
	}
	
	//Métodos public que definem as regras para acesso/alteração dos valores private
	public void definirHora(int hora) {
		if(hora >= 0 && hora <= 23) {
			this.hora = hora;
		} else {
			System.out.println("Erro: Hora fora do intervalo!");
		}
	}
	
	public void definirMinuto(int minuto) {
		if(minuto >= 0 && minuto <= 59) {
			this.minuto = minuto;
		} else {
			System.out.println("Erro: Minuto fora do intervalo!");
		}
	}
	
	public void definirSegundo(int segundo) {
		if(segundo >= 0 && segundo <= 59) {
			this.segundo = segundo;
		} else {
			System.out.println("Erro: Segundo fora do intervalo!");
		}
	}

}
