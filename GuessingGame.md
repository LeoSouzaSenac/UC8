### Passo a Passo para Criar um Jogo de Adivinhação em Java

Neste tutorial, você vai aprender a criar um jogo de adivinhação simples em Java, organizando o código em diferentes classes. Vamos construir o jogo passo a passo.


### 1. Configurando o Projeto

Antes de começarmos a escrever o código, você deve garantir que tem o ambiente de desenvolvimento Java configurado. Isso inclui:

- **Instalar o JDK**: Se ainda não o fez, baixe e instale o Java Development Kit (JDK).
- **IDE**: Utilize uma IDE como o **Eclipse**, **IntelliJ**, **NetBeans** ou o **VS Code** com suporte para Java.

Agora, vamos começar!

---

### 2. Criando a Estrutura do Jogo

Nosso jogo será dividido em quatro classes principais:
- **Main.java**: Ponto de entrada do programa.
- **Game.java**: Gerencia a lógica do jogo.
- **Player.java**: Representa o jogador.
- **GuessValidator.java**: Valida o palpite do jogador.

#### 2.1 Criando a Classe `Main.java`
Comece criando uma classe chamada `Main`. Ela será o ponto de entrada do nosso programa e vai inicializar o jogo.

1. Crie uma classe chamada **Main**.
2. Dentro dela, crie o método `main` que será executado quando o programa rodar.
3. Dentro do método `main`, inicialize a classe `Game` e chame o método `start()` para começar o jogo.

Seu código deve se parecer com isso:
```java
public class Main {
    public static void main(String[] args) {
        Game game = new Game(); // Inicializa o jogo
        game.start(); // Inicia o jogo
    }
}
```

#### 2.2 Criando a Classe `Game.java`
A classe `Game` vai gerenciar a lógica do jogo. Ela será responsável por:
- Gerar um número aleatório.
- Pedir ao jogador que insira seu palpite.
- Verificar se o palpite está correto.

Vamos começar criando essa classe:

1. Crie uma classe chamada **Game**.
2. Dentro dela, crie uma variável que vai armazenar o **número a ser adivinhado**.
3. Adicione um método chamado `start()` que vai rodar o jogo.

```java
import java.util.Scanner;

public class Game {
    private int numberToGuess; // Número aleatório

    public Game() {
        this.numberToGuess = (int) (Math.random() * 100) + 1; // Gera número aleatório entre 1 e 100
    }

    public void start() {
        // Lógica do jogo será adicionada aqui
    }
}
```

#### 2.3 Criando a Classe `Player.java`
Agora vamos criar a classe **Player** para representar o jogador. Essa classe vai armazenar o nome do jogador e o seu palpite.

1. Crie uma classe chamada **Player**.
2. Adicione uma variável para armazenar o nome do jogador.
3. Adicione métodos para definir e obter o nome do jogador.

```java
import java.util.Scanner;

public class Player {
    private String name;

    public Player() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        this.name = scanner.nextLine();
    }

    public String getName() {
        return name;
    }
}
```

#### 2.4 Criando a Classe `GuessValidator.java`
Para verificar se o palpite do jogador está correto, precisamos de uma classe que valide o palpite.

1. Crie uma classe chamada **GuessValidator**.
2. Dentro dela, crie um método que vai receber o **palpite** e o **número correto**, e retornar se o palpite está correto.

```java
public class GuessValidator {
    public boolean validateGuess(int guess, int numberToGuess) {
        if (guess > numberToGuess) {
            System.out.println("Seu palpite é muito alto!");
            return false;
        } else if (guess < numberToGuess) {
            System.out.println("Seu palpite é muito baixo!");
            return false;
        } else {
            return true; // Palpite correto
        }
    }
}
```

---

### 3. Implementando a Lógica do Jogo

Agora que temos nossas classes principais, vamos implementar a lógica do jogo na classe `Game`.

1. No método `start()` da classe **Game**, adicione um loop que peça ao jogador para fazer um palpite até que ele acerte o número.
2. Utilize a classe `Player` para capturar o nome e o palpite do jogador.
3. Use a classe `GuessValidator` para verificar se o palpite está correto.

Aqui está um exemplo de como fazer isso:

```java
import java.util.Scanner;

public class Game {
    private int numberToGuess;
    private Player player;
    private GuessValidator guessValidator;
    private Scanner scanner;

    public Game() {
        this.numberToGuess = (int) (Math.random() * 100) + 1;
        this.player = new Player();
        this.guessValidator = new GuessValidator();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Bem-vindo ao jogo de adivinhação, " + player.getName() + "!");
        boolean hasWon = false;

        while (!hasWon) {
            System.out.print("Digite seu palpite: ");
            int guess = scanner.nextInt();
            hasWon = guessValidator.validateGuess(guess, numberToGuess);
        }

        System.out.println("Parabéns, " + player.getName() + "! Você adivinhou o número.");
    }
}
```

---

### 4. O código até agora deve ficar assim:

**Main.java**
```java
public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}
```

**Game.java**
```java
import java.util.Scanner;

public class Game {
    private int numberToGuess;
    private Player player;
    private GuessValidator guessValidator;
    private Scanner scanner;

    public Game() {
        this.numberToGuess = (int) (Math.random() * 100) + 1;
        this.player = new Player();
        this.guessValidator = new GuessValidator();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Bem-vindo ao jogo de adivinhação, " + player.getName() + "!");
        boolean hasWon = false;

        while (!hasWon) {
            System.out.print("Digite seu palpite: ");
            int guess = scanner.nextInt();
            hasWon = guessValidator.validateGuess(guess, numberToGuess);
        }

        System.out.println("Parabéns, " + player.getName() + "! Você adivinhou o número.");
    }
}
```

**Player.java**
```java
import java.util.Scanner;

public class Player {
    private String name;

    public Player() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        this.name = scanner.nextLine();
    }

    public String getName() {
        return name;
    }
}
```

**GuessValidator.java**
```java
public class GuessValidator {
    public boolean validateGuess(int guess, int numberToGuess) {
        if (guess > numberToGuess) {
            System.out.println("Seu palpite é muito alto!");
            return false;
        } else if (guess < numberToGuess) {
            System.out.println("Seu palpite é muito baixo!");
            return false;
        } else {
            return true;
        }
    }
}
