package Geometria;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangulo ret = new Retangulo();
        Quadrado quad = new Quadrado();
        Circulo circ = new Circulo();
        
        System.out.println("Digite o raio do círculo:");
        double raio = sc.nextDouble();
        System.out.println("Digite a base do retângulo:");
        double base = sc.nextDouble();
        System.out.println("Digite a altura do retângulo:");
        double altura = sc.nextDouble();
        System.out.println("Digite o lado do quadrado:");
        double lado = sc.nextDouble();

        circ.setRaio(raio);
        ret.setBase(base);
        ret.setAltura(altura);
        quad.setLado(lado);

        System.out.println("Área Círculo: " + circ.Area(circ.getRaio()));
        System.out.println("Perímetro Círculo: " + circ.Perimetro(circ.getRaio()));
        System.out.println("Área Retângulo: " + ret.Area(ret.getBase(), ret.getAltura()));
        System.out.println("Perímetro Retângulo: " + ret.Perimetro(ret.getBase(), ret.getAltura()));
        System.out.println("Área Quadrado: " + quad.Area(quad.getLado()));
        System.out.println("Perímetro Quadrado: " + quad.Perimetro(quad.getLado()));
    }
}
