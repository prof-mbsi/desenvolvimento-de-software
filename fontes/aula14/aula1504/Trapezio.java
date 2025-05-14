package aula1504;

public class Trapezio extends Figura {
	
    private double baseMaior;
    private double baseMenor;
    private double altura;

    //Construtor com argumentos
    public Trapezio(double baseMaior, double baseMenor, double altura) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return ((baseMaior + baseMenor) * altura) / 2;
    }
}
