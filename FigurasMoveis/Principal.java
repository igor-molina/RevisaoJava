package FigurasMoveis;

public class Principal {
    public static void main(String args[]) {
        char figChar = args[0].charAt(0);

        Movel figuraMovel = null;

        switch (figChar) {
            case 'c':
                int raio = Integer.parseInt(args[1]);
                int x = Integer.parseInt(args[2]);
                int y = Integer.parseInt(args[3]);
                int velX = Integer.parseInt(args[4]);
                int velY = Integer.parseInt(args[5]);
                figuraMovel = new CirculoMovel(x, y, velX, velY, raio);
                break;
            case 'r':
                int x1 = Integer.parseInt(args[1]);
                int y1 = Integer.parseInt(args[2]);
                int x2 = Integer.parseInt(args[3]);
                int y2 = Integer.parseInt(args[4]);
                velX = Integer.parseInt(args[5]);
                velY = Integer.parseInt(args[6]);
                figuraMovel = new RetanguloMovel(x1, y1, x2, y2, velX, velY);
                break;
        }

        System.out.println("> " + figuraMovel);
        System.out.println("> Movendo para cima.");
        figuraMovel.moverParaCima();
        System.out.println("> " + figuraMovel);
        System.out.println("> Movendo para direita.");
        figuraMovel.moverParaDireita();
        System.out.println("> " + figuraMovel);
        System.out.println("> Movendo para baixo.");
        figuraMovel.moverParaBaixo();
        System.out.println("> " + figuraMovel);
        System.out.println("> Movendo para esquerda.");
        figuraMovel.moverParaEsquerda();
        System.out.println("> " + figuraMovel);
    }
}
