package Retangulo;

public class RetanguloTeste {

    public static void negative(float valor1, float valor2){
        if(valor1 <= 0 || valor2 <= 0){
            ArithmeticException e = new ArithmeticException();
            System.err.println("Um dos lados do retângulo é menor ou igual a 0.0!");
            throw  e;
        }
    }
}
