package aula1504;

public class Circulo extends Figura {
	
    private double raio;

    //Construtor com argumentos
    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}