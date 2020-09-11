package Cartas;

import java.time.temporal.ValueRange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {

    public final int TOTAL_DE_CARTAS = 52;
    public List<Carta> monte;

    public Baralho() {
        monte = new ArrayList<>();
        Integer cartaAtual;

        String[] naipes = {"Paus", "Ouros", "Copas", "Espadas"};
        int index = 0;
        Carta c;

        while (index < 4) {
            for (int i = 1; i <= 10; i++) {
                c = new Carta();
                c.setValor(i + " ");
                c.setNaipe(naipes[index]);

                monte.add(c);
            }
            c = new Carta();
            c.setValor("Valete");
            c.setNaipe(naipes[index]);
            monte.add(c);
            c = new Carta();
            c.setValor("Dama");
            c.setNaipe(naipes[index]);
            monte.add(c);
            c = new Carta();
            c.setValor("Rei");
            c.setNaipe(naipes[index]);
            monte.add(c);
            index ++;
        }
        //for (int j = 0; j < 5; j++) {
        //}
    }

    public void imprimirBaralho() {
        StringBuilder sb = new StringBuilder();

        monte.forEach((c) -> {
            sb.append("Carta: ").append(c.getValor()).append(" | Naipe: ").append(c.getNaipe()).append("\n");
        });

        System.out.println(sb.toString());
    }

    public void embaralhar(){
        System.out.println("Embaralhando deck.");
        Collections.shuffle(monte);
    }
}
