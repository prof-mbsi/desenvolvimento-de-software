package aula05.aula1303;

public class Retangulo {
	
	//Atributos da classe Retangulo
	double altura;
	double largura;
	
	//Método que calcula a área e retorna o resultado
	double calculaArea() {
		return altura * largura;
	}
	
	//Método que calcula o perímetro e retorna o resultado
	double calculaPerimetro() {
		return (2 * largura) + (2 * altura);
	}
}
