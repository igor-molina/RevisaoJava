package FigurasMoveis;

public class CirculoMovel implements Movel {
    private int raio;
    private PontoMovel centro;

    public CirculoMovel(int x, int y, int velX, int velY, int raio) {
        centro = new PontoMovel(x, y, velX, velY);
        this.raio = raio;
    }

    @Override
    public void moverParaCima() {
        centro.moverParaCima();
    }

    @Override
    public void moverParaBaixo() {
        centro.moverParaBaixo();
    }

    @Override
    public void moverParaEsquerda() {
        centro.moverParaEsquerda();
    }

    @Override
    public void moverParaDireita() {
        centro.moverParaDireita();
    }

    @Override
    public String toString() {
        return "CirculoMovel[raio="+ raio +", " + centro + "]";
    }
}
