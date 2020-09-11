package LojaEletro;

public class Fatura {
    int codFatura;
    String descricao;
    int qtdComprada;
    double preco;

    public Fatura(){

    }

    public Fatura(int codFatura, String descricao, int qtdComprada, double preco) {
        this.codFatura = codFatura;
        this.descricao = descricao;
        this.qtdComprada = qtdComprada;
        this.preco = preco;
    }

    public int getCodFatura() {
        return codFatura;
    }

    public void setCodFatura(int codFatura) {
        this.codFatura = codFatura;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdComprada() {
        return qtdComprada;
    }

    public void setQtdComprada(int qtdComprada) {
        this.qtdComprada = qtdComprada;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double totalFaturado(int quantidade, double preco){
        return quantidade * preco;

    }

    @Override
    public String toString() {
        return "Código: " + codFatura + "\n" +
                "Descrição: '" + descricao + "\n" +
                "Preço: " + preco + "\n" +
                "Total: " + totalFaturado(qtdComprada, preco);
    }
}
