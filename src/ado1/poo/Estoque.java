package ado1.poo;

public class Estoque{
    private Produto[] produtos;
    private int tamanho;
 
    public Estoque(int capacidade) {
        this.produtos = new Produto[capacidade];
        this.tamanho = 0;
    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    
    
    public void adicionarProduto(Produto produto) {
        if (tamanho < produtos.length) {
            produtos[tamanho] = produto;
            tamanho++;
            System.out.println("Produto adicionado com sucesso!");
        } else {
            System.out.println("Estoque cheio! Não é possível adicionar mais produtos.");
        }
    }

    public void removerProduto(int idProduto) {
        for (int i = 0; i < tamanho; i++) {
            if (produtos[i].getId() == idProduto) {
                produtos[i] = produtos[tamanho - 1]; 
                produtos[tamanho - 1] = null; 
                tamanho--;
                System.out.println("Produto removido com sucesso!");
                return;
            }
        }
        System.out.println("Produto com ID " + idProduto + " não encontrado.");
    }

    public void consultarProduto(int idProduto) {
        for (int i = 0; i < tamanho; i++) {
            if (produtos[i].getId() == idProduto) {
                System.out.println("Produto encontrado: " + produtos[i]);
                return;
            }
        }
        System.out.println("Produto com ID " + idProduto + " não encontrado.");
    }

    public void atualizarQuantidade(int idProduto, int quantidade) {
        for (int i = 0; i < tamanho; i++) {
            if (produtos[i].getId() == idProduto) {
                produtos[i].setQuantidade(quantidade);
                System.out.println("Quantidade do produto atualizada com sucesso!");
                return;
            }
        }
        System.out.println("Produto com ID " + idProduto + " não encontrado.");
    }
  public void listarProdutos() {
    if (tamanho == 0) {
        System.out.println("Nenhum produto no estoque.");
    } else {
        System.out.println("Produtos no estoque:");
        for (int i = 0; i < tamanho; i++) {
            if (produtos[i] != null) {  
                System.out.println(produtos[i].toString());
            }
        }
    }
}
}
