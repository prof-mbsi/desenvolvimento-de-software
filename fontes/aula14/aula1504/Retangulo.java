package aula1504;

public class Retangulo extends Figura {
	
    private double largura;
    private double altura;

    //Construtor com argumentos
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }
}