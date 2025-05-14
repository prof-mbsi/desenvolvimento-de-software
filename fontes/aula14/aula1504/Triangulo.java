package aula1504;

public class Triangulo extends Figura {
	
    private double base;
    private double altura;

    //Construtor com argumentos
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}