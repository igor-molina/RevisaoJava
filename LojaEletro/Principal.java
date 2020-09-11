package LojaEletro;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fatura fat = new Fatura();

        try {

            System.out.println("Digite o código do produto:");
            int cod = sc.nextInt();
            System.out.println("Digite a descrição:");
            String desc = sc.next();
            System.out.println("Digite o preco:");
            float preco = sc.nextFloat();
            System.out.println("Digite a quantidade comprada:");
            int qtd = sc.nextInt();

            fat.setCodFatura(cod);
            fat.setDescricao(desc);
            fat.setPreco(preco);
            fat.setQtdComprada(qtd);

            System.out.println(fat);
        }
        catch(Exception ex){
            System.out.println("O valor digitado não é maior que zero!");
        }
    }
}
