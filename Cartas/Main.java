package Cartas;

public class Main {
    public static void main(String[] args) {
        Baralho deck = new Baralho();

        deck.embaralhar();
        deck.imprimirBaralho();

        System.out.println("Nenhuma carta no baralho, fim de jogo!");

    }
}
