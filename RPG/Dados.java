import java.util.Scanner;

public class Dados {

     // Método que pede ao jogador para rolar os dados
    public int rolarDados(Scanner scanner, int quantidade, int faces) {
        int resultadoTotal = 0; // variável que vai somar o valor total dos dados, dependendo da quantidade
        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Pressione Enter para rolar o dado " + i + " de " + quantidade + " (d" + faces + ").");
            scanner.nextLine(); // Aguarda o Enter do jogador
             // Gerar valor entre 1 e o número máximo de lados (sides)
            int resultado = (int) (Math.random() * faces) + 1; // o + 1 garante que o valor seja, no mínimo, 1, e não zero. O (int)  descarta a parte decimal, deixando apenas o número inteiro
            System.out.println("Você rolou: " + resultado);
            resultadoTotal += resultado;
        }
        return resultadoTotal;
    }
}


