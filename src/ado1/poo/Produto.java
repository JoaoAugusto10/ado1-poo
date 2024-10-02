package ado1.poo;

public class Produto {
    private int idProduto;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto() {
    }

    public Produto(int id, String nome, double preco, int quantidade) {
        this.idProduto = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getId() {
        return idProduto;
    }

    public void setId(int id) {
        this.idProduto = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
 
    @Override
    public String toString() {
        return "Produto [ID=" + idProduto + ", Nome=" + nome + ", Preço=" + preco + ", Quantidade=" + quantidade + "]";
    }
}
   