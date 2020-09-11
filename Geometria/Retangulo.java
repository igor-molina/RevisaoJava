package Geometria;

public class Retangulo extends Forma{
    protected double base;
    protected double altura;

    public Retangulo(){

    }

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Retangulo(String cor, boolean preenchido, double base, double altura) {
        super(cor, preenchido);
        this.base = base;
        this.altura = altura;
    }


    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double Area(double base, double altura){
        return base * altura;
    }

    public double Perimetro(double base, double altura){
        return 2 * (base+altura);
    }

    @Override
    public String toString() {
        return "Retângulo:" +
                "Base=" + base +
                ", Altura=" + altura +
                ", Cor='" + cor + '\'' +
                ", Preenchido=" + preenchido;
    }
}
