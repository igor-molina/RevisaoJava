package Retangulo;

public class RetanguloFig {
    private float comprimento;
    private float largura;

    public RetanguloFig(){

    }

    public RetanguloFig(float comprimento, float largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float perimetro(float comprimento, float largura){
        float result = (comprimento + largura) * 2;
        return result;
    }

    public float area(float comprimento, float largura){
        float result = comprimento * largura;
        return result;
    }
}
