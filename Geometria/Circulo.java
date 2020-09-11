package Geometria;

public class Circulo extends Forma {
    protected double raio;

    public Circulo(){

    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public Circulo(String cor, boolean preenchido, double raio) {
        super(cor, preenchido);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double Area(double raio){
        return Math.PI * Math.pow(raio, 2);
    }

    public double Perimetro(double raio){
        return 2 * (Math.PI * raio);
    }

    @Override
    public String toString() {
        return "Circulo:" +
                " Raio=" + raio +
                ", Cor='" + cor + '\'' +
                ", Preenchido=" + preenchido;
    }
}
