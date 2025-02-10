package compras;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
// Classe principal com sistema de compras
public class SistemaCompras {
    // ArrayList que representa o carrinho
    private static ArrayList<Produto> carrinho = new ArrayList<>();
    // ArrayList que representa os produtos em estoque
    private static ArrayList<Produto> estoque = new ArrayList<>();
    // Inicializa o scanner
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Criando alguns produtos antecipadamente e adicionando ao estoque
        estoque.add(new Eletronico("Smartphone", 1500.00));
        estoque.add(new Eletronico("Laptop", 3000.00));
        estoque.add(new Alimento("Arroz", 5.00));
        estoque.add(new Alimento("Feijão", 7.00));
        estoque.add(new Vestuario("Camiseta", 30.00));
        estoque.add(new Vestuario("Calça Jeans", 90.00));
        estoque.add(new Brinquedo("Bola", 15.00));
        estoque.add(new Brinquedo("Carrinho de brinquedo", 25.00));
        estoque.add(new Livro("Livro: Java para Iniciantes", 40.00));
        estoque.add(new Livro("Livro: Programação Avançada", 70.00));

        int opcao = 0;
        while (opcao != 5) {
            System.out.println("\n1. Adicionar produto ao carrinho");
            System.out.println("2. Remover produto do carrinho");
            System.out.println("3. Ver itens do carrinho");
            System.out.println("4. Finalizar compra");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                   adicionarProduto();
                    break;
                case 2:
                    removerProduto();
                    break;
                case 3:
                    verCarrinho();
                    break;
                case 4:
                    finalizarCompra();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        }
    }

    private static void adicionarProduto() {
        System.out.println("\nEscolha um produto para adicionar ao carrinho:");
        for (int i = 0; i < estoque.size(); i++) {
            System.out.println((i + 1) + ". " + estoque.get(i).getNome() + " | R$ " + estoque.get(i).getPreco());
        }

        System.out.print("Escolha o numero do produto: ");
        int indice = scanner.nextInt();
        if (indice > 0 && indice <= estoque.size()) {
            carrinho.add(estoque.get(indice - 1));
            System.out.println("Produto adicionado ao carrinho.");
        } else {
            System.out.println("Indice invalido!");
        }
    }

    private static void removerProduto() {
        if (carrinho.isEmpty()) {
            System.out.println("Carrinho vazio!");
            return;
        }
        System.out.println("Itens no carrinho:");
        for (int i = 0; i < carrinho.size(); i++) {
            System.out.println((i + 1) + ". " + carrinho.get(i).getNome());
        }
        System.out.print("Escolha o numero do produto para remover: ");
        int indice = scanner.nextInt();
        if (indice > 0 && indice <= carrinho.size()) {
            carrinho.remove(indice - 1);
            System.out.println("Produto removido.");
        } else {
            System.out.println("Indice invalido!");
        }
    }

    private static void verCarrinho() {
        if (carrinho.isEmpty()) {
            System.out.println("Carrinho vazio!");
            return;
        }
        System.out.println("\nItens no carrinho:");
        for (Produto prod : carrinho) {
            System.out.println("- " + prod.getNome() + " | R$ " + prod.getPreco());
        }
    }

    private static void finalizarCompra() {
        if (carrinho.isEmpty()) {
            System.out.println("Carrinho vazio! Adicione produtos antes de finalizar.");
            return;
        }
        double total = 0;
        for (Produto p : carrinho) {
            total += p.getPreco();
        }
        System.out.println("Total da compra: R$ " + total);
        System.out.println("Compra finalizada! Obrigado por comprar conosco.");
        carrinho.clear();
    }
}
