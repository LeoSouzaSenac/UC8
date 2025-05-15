```java

public class Rpsgame {

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}

```


```java
public class Player {
    private String name;
    private int draws;
    private int wins;
    private int losses;
    
    /*
    Criar um atributo jogadas/plays para o player
    criar um método que incrementa as jogadas e outro que mostra o numero de jogadas
    mudar a lógica do jogo para, no final, mostrar quantas jogadas o player precisou fazer até acertar
    
    */
    
    
    public Player() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        this.name = scanner.nextLine();
        
    }

    public String getName() {
        return name;
    }
    
    public void addDraws(){
        this.draws++;
    }
    
    public void addWins(){
        this.wins++;
    }
    
    public void addLosses(){
        this.losses++;
    }
    
    public int getDraws(){
        return draws;
    }
    
    public int getWins(){
        return wins;
    }
    
    public int getLosses(){
        return losses;
    }
    
}

```

```java
public class Validator {
    public String validateGuess(int choice, int computerChoice) { 
        if (choice == computerChoice){
            System.out.println("Empate!");
            return "E";
        } else if((choice == 1 && computerChoice == 3) 
                || (choice == 2 && computerChoice == 1)
                || (choice == 3 && computerChoice == 2)){
            System.out.println("Você venceu esta rodada!");
            return "V";
        } else {
            System.out.println("O computador venceu esta rodada!");
            return "P";
        }
    }
    
    // Converte o número (1, 2, 3) para a escolha correspondente (Pedra, Papel, Tesoura)
    public String choiceToString(int choice) {
        switch (choice) {
            case 1:
                return "Pedra";
            case 2:
                return "Papel";
            case 3:
                return "Tesoura";
            default:
                return "Escolha inválida";
        }
    }
    
    
}

```

```java
public class Game {
    private int numberToGuess; // Número aleatório

    private Player player;
    private Validator validator;
    private Scanner scanner;
    
    public Game() {
        this.numberToGuess = (int) (Math.random() * 3) + 1; // Gera número aleatório entre 1 e 3
        this.player = new Player(); // Instancio o player
        this.validator = new Validator(); // Instancio o validator 
        this.scanner = new Scanner(System.in); // Instancio o scanner
    }  

    public void start() {
        
         System.out.println("Bem-vindo ao jogo de pedra, papel e tesoura " + player.getName() + "!");
        
        String result; // Variável que recebe o resultado da rodada
        int plays = 0; // Variável que indica quantas rodadas já se passaram
        
        // Enquanto o número de vitórias do jogador for menor que dois E o número de derrotas do jogador for menor que
        // dois E o número de jogadas for menor que três, ele continua o loop
        while (player.getWins() < 2 && player.getLosses() < 2 && plays < 3) {
            System.out.print("Digite seu palpite: ");
            System.out.println("1 para pedra, 2 para papel, 3 para tesoura");
            int guess = scanner.nextInt();
            
            // Chama o método que mostra que opção eu escolhi (e o computador também)
            System.out.println("Você escolheu: " + validator.choiceToString(guess)); 
            System.out.println("O computador escolheu: " + validator.choiceToString(numberToGuess));
            
            // Compara as escolhas dos dois e verifica quem venceu a rodada
            result = validator.validateGuess(guess, numberToGuess);
            
            
            if (result == "V"){
                player.addWins();
                
            } else if (result == "E"){
                player.addDraws();
            } else {
                player.addLosses();
            }
            
            // Incrementa o número de jogadas
            plays++; 
            
        }
        
        
        if (player.getWins() > player.getLosses()){
            System.out.println("Parabéns, " + player.getName() + ", você venceu!");
        } else if (player.getWins() < player.getLosses()){
            System.out.println("Que peninha" + player.getName() + ", o computador levou essa!");
        } else {
            System.out.println("Ora ora, um empate!");
        }

        
    }
}

```
