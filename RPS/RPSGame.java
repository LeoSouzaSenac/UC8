import java.util.Scanner;

public class RPSGame {
    private RPSValidator validator = new RPSValidator(); // Instancia o validador
    private Scanner scanner = new Scanner(System.in); // Para capturar a escolha do jogador

    public void start() {
        System.out.println("Bem-vindo ao Pedra, Papel e Tesoura!");
        System.out.println("Escolha 1 para Pedra, 2 para Papel, 3 para Tesoura:");

        int playerChoice = scanner.nextInt(); // Captura a escolha do jogador
        int computerChoice = (int) (Math.random() * 3) + 1; // Computador faz a escolha aleatória

        // Valida quem venceu
        if (validator.validateChoice(playerChoice, computerChoice)) {
            System.out.println("Você ganhou!");
        } else {
            System.out.println("Você perdeu!");
        }

        System.out.println("Computador escolheu: " + validator.choiceToString(computerChoice));
    }
}
