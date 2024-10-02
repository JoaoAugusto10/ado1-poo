package ado1.poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //NOMES DA DUPLA
        //GUILHERME MIRANDA SOARES
        //JOÃO AUGUSTO DE OLIVEIRA
        // Variáveis 
        int opcao;
        Scanner leia = new Scanner(System.in);
        Estoque estoque = new Estoque(10);

        // Login
        System.out.println("\nLogin\nID:");
        int idCliente = leia.nextInt();
        System.out.println("Nome:");
        String nomeCliente = leia.next();
        Cliente cliente1 = new Cliente(idCliente, nomeCliente);

        do {
            System.out.println("\nOlá " + nomeCliente + " ID: " + idCliente);
            System.out.println("\nMenu de Opções:\n"
                    + "1. Adicionar Produto\n"
                    + "2. Remover Produto\n"
                    + "3. Consultar Produto\n"
                    + "4. Atualizar Produto\n"
                    + "5. Listar Produtos\n"
                    + "6. Sair\n"
                    + "Escolha uma opção:");
            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    // Adicionar Produto
                    System.out.print("Digite o ID do produto: ");
                    int id = leia.nextInt();
                    leia.nextLine(); // Consumir a nova linha
                    System.out.print("Digite o nome do produto: ");
                    String nome = leia.nextLine();
                    System.out.print("Digite o preço do produto: ");
                    double preco = leia.nextDouble();
                    System.out.print("Digite a quantidade do produto: ");
                    int quantidade = leia.nextInt();

                    Produto produto = new Produto(id, nome, preco, quantidade);
                    estoque.adicionarProduto(produto);
                    break;

                case 2:
                    // Remover Produto
                    System.out.print("Digite o ID do produto que deseja remover: ");
                    int idRemover = leia.nextInt();
                    estoque.removerProduto(idRemover);
                    break;

                case 3:
                    // Consultar Produto
                    System.out.print("Digite o ID do produto que deseja consultar: ");
                    int idConsultar = leia.nextInt();
                    estoque.consultarProduto(idConsultar);
                    break;

                case 4:
                    // Atualizar Produto
                    System.out.print("Digite o ID do produto que deseja atualizar: ");
                    int idAtualizar = leia.nextInt();
                    System.out.print("Digite a nova quantidade: ");
                    int novaQuantidade = leia.nextInt();
                    estoque.atualizarQuantidade(idAtualizar, novaQuantidade);
                    break;

                case 5:
                    // Listar Produtos
                    estoque.listarProdutos();
                    break;

                case 6:
                    // Sair
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 6);  // Sair com a opção 6

        leia.close();
    }
}
