package Geometria;

public class Quadrado extends Forma {
    protected double lado;

    public Quadrado(){

    }

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public Quadrado(String cor, boolean preenchido, double lado) {
        super(cor, preenchido);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double Area(double lado){
        return lado * lado;
    }

    public double Perimetro(double lado){
        return 5 * 4;
    }

    @Override
    public String toString() {
        return "Quadrado:" +
                " Lado=" + lado +
                ", Cor='" + cor + '\'' +
                ", Preenchido=" + preenchido;
    }
}
