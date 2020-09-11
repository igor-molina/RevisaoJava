package FigurasMoveis;

public class PontoMovel implements Movel{
    private int x;
    private int y;
    private int velX;
    private int velY;

    public PontoMovel(int x, int y, int velX, int velY) {
        this.x = x;
        this.y = y;
        this.velX = velX;
        this.velY = velY;
    }

    @Override
    public void moverParaCima() {
        y += velY;
    }

    @Override
    public void moverParaBaixo() {
        y -= velY;
    }

    @Override
    public void moverParaEsquerda() {
        x -= velX;
    }

    @Override
    public void moverParaDireita() {
        x += velX;
    }

    @Override
    public String toString() {
        return "PontoMovel[x=" + x + ", y=" + y + ", velX="
                + velX + ", velY=" + velY + "]";
    }
}
