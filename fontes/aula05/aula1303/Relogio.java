package aula05.aula1303;

public class Relogio {
	
	//Atributos da classe Relogio
	int hora;
	int minuto;
	int segundo;
	
	//Método que exibe o estado atual de hora
	void exibirHora() {
		System.out.println(hora + ":" + minuto
				+ ":" + segundo);
	}
	
	//Método que define a hora com base nos parâmetros hora, minuto e segundo
	void definirHora(int h, int m, int s) {
		if(h >= 0 && h < 24) {
			if(m >= 0 && m < 60) {
				if(s >= 0 && s < 60) {
					hora = h;
					minuto = m;
					segundo = s;
				}
			}
		}
	}
	
	//Método que ajusta apenas a hora
	void ajustaHora(int h) {
		if(h >= 0 && h < 24) {
			hora = h;
		} else {
			System.out.println("Valor inválido para hora!");
		}
	}
	
	//Método que ajusta apenas os minutos
	void ajustaMinuto(int m) {
		if(m >= 0 && m < 60) {
			minuto = m;
		} else {
			System.out.println("Valor inválido para minutos!");
		}
	}
	
	//Método que ajusta apenas os segundos
	void ajustaSegundos(int s) {
		if(s >= 0 && s < 60) {
			segundo = s;
		} else {
			System.out.println("Valor inválido para segundos!");
		}
	}
}
