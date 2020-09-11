package Retangulo;

import java.util.Scanner;

public class Principal extends  RetanguloTeste{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RetanguloFig ret = new RetanguloFig(1, 1);

        System.out.println("Digite o comprimento do Retângulo:");
        float comp = sc.nextFloat();
        System.out.println("Digite a largura do Retângulo:");
        float larg = sc.nextFloat();

        negative(comp, larg);

        ret.setComprimento(comp);
        ret.setLargura(larg);

        float resultP = ret.perimetro(ret.getComprimento(), ret.getLargura());
        float resultA = ret.area(ret.getComprimento(), ret.getLargura());

        System.out.println("A área desse Retângulo é: " + resultA);
        System.out.println("O perímetro desse Retângulo é: " + resultP);
    }
}
