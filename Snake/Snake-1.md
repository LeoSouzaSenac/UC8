## Passo a Passo: Criando o Jogo da Cobrinha em Java

### 1. Iniciar o Projeto

- Primeiro, abra sua IDE favorita (por exemplo, NetBeans, IntelliJ, ou Eclipse) e crie um **novo projeto Java**. Nomeie-o como **SnakeGame**.
- Dentro do projeto, crie um pacote chamado **snake** para organizar suas classes.

---

### 2. Criando a Janela do Jogo

- Nosso jogo da cobrinha precisa ser exibido em uma janela. Para isso, vamos usar o `JFrame`, que é uma janela em Java.
  
**Passo 2.1:** Primeiro, precisamos criar uma classe que será responsável por criar essa janela.

1. Crie uma nova classe chamada `SnakeGame`.

2. Agora, dentro dessa classe, declare que ela vai **herdar** de `JFrame`, que é o componente que cria uma janela em Java. Assim, nossa classe será capaz de abrir e configurar essa janela.

```java
import javax.swing.JFrame;

public class SnakeGame extends JFrame {
    // Essa é a nossa classe principal que vai criar a janela do jogo.
}
```

---

### 3. Inicializando a Janela

- Precisamos de um **construtor** na nossa classe `SnakeGame`. O construtor é um método especial que é chamado quando o objeto da classe é criado. Aqui, ele vai inicializar a interface do jogo.

**Passo 3.1:** Vamos criar o construtor `SnakeGame()` e um método chamado `initUI()`, que será responsável por definir as configurações da janela.

```java
public SnakeGame() {
    initUI(); // Chamamos o método initUI() para configurar a janela
}

private void initUI() {
    // Aqui vamos configurar as propriedades da janela
    setTitle("Snake Game"); // Definimos o título da janela
    setSize(300, 300); // Definimos o tamanho da janela (largura x altura)
    setLocationRelativeTo(null); // Faz a janela aparecer no centro da tela
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha a aplicação ao clicar no botão "X"
}
```

- O método `setTitle()` define o título da janela.
- O método `setSize()` define o tamanho da janela.
- `setLocationRelativeTo(null)` posiciona a janela no centro da tela.
- `setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)` garante que a aplicação feche corretamente ao clicar no botão de fechar.

---

### 4. Exibindo a Janela

- Agora, precisamos de um método principal (`main`) que seja o ponto de entrada da aplicação e mostre essa janela.

**Passo 4.1:** No método `main`, vamos usar o `EventQueue.invokeLater()`, que é usado para garantir que a interface gráfica seja criada na **thread de eventos**, o que é uma boa prática em Java.

```java
public static void main(String[] args) {
    EventQueue.invokeLater(() -> {
        SnakeGame game = new SnakeGame(); // Criamos uma instância da nossa janela
        game.setVisible(true); // Definimos a janela como visível
    });
}
```

- `EventQueue.invokeLater` faz com que o código que está dentro do `run` seja executado na thread correta para componentes gráficos.
- `setVisible(true)` torna a janela visível na tela.

---

### 5. Criando o Tabuleiro do Jogo

- Nosso jogo precisa de um painel onde a cobrinha será desenhada e o jogo acontecerá. Para isso, vamos criar uma nova classe chamada `Board`, que vai herdar de `JPanel` (um painel em Java que permite desenhar gráficos).

**Passo 5.1:** Crie uma nova classe chamada `Board`.

```java
import javax.swing.JPanel;

public class Board extends JPanel {
    // O painel do jogo, onde a ação vai acontecer
}
```

- `JPanel` é o componente onde a cobrinha vai ser desenhada e onde a lógica do jogo será aplicada.

---

### 6. Definindo as Dimensões do Tabuleiro

- O tabuleiro precisa ter uma largura e uma altura definidas, para sabermos onde a cobrinha pode se mover.

**Passo 6.1:** Vamos criar algumas variáveis para a largura e altura do painel.

```java
private final int B_WIDTH = 300; // Largura do painel
private final int B_HEIGHT = 300; // Altura do painel
```

- Essas variáveis definem o tamanho da área onde o jogo acontecerá.

---

### 7. Definindo o Background do Jogo

- Precisamos definir a cor de fundo do nosso painel e garantir que ele tenha o tamanho correto.

**Passo 7.1:** Vamos criar um método `initBoard()` dentro da classe `Board` para configurar essas propriedades.

```java
private void initBoard() {
    setBackground(Color.BLACK); // Cor de fundo do painel (preto)
    setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT)); // Define o tamanho do painel
}
```

- `setBackground(Color.BLACK)` define o fundo do painel como preto.
- `setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT))` garante que o painel tenha o tamanho que especificamos anteriormente.

---

### 8. Atualizando o Jogo Periodicamente

- Nosso jogo precisa ser atualizado em intervalos regulares para que a cobrinha se mova. Vamos usar um **Timer** para isso.

**Passo 8.1:** Declare um `Timer` na classe `Board`.

```java
private Timer timer; // Timer para controlar o tempo de atualização do jogo
```

- O `Timer` vai disparar eventos em intervalos regulares, o que nos permitirá atualizar a posição da cobrinha.

**Passo 8.2:** Vamos inicializar esse `Timer` dentro do método `initBoard()`.

```java
timer = new Timer(140, this); // O jogo será atualizado a cada 140 milissegundos
timer.start(); // Inicia o timer
```

- `new Timer(140, this)` cria um timer que chama o método `actionPerformed()` a cada 140 milissegundos.
- `timer.start()` inicia o timer.

Agora que o `Timer` está configurado, ele vai disparar eventos a cada 140 milissegundos, atualizando o jogo.

---

### 9. Adicionando o Tabuleiro ao Jogo

- Agora, precisamos adicionar o tabuleiro (`Board`) que acabamos de criar à nossa janela (`SnakeGame`).

**Passo 9.1:** Volte para a classe `SnakeGame` e adicione o `Board` no método `initUI()`.

```java
private void initUI() {
    add(new Board()); // Adiciona o painel Board ao JFrame
    setResizable(false); // Não permite redimensionar a janela
    pack(); // Ajusta a janela ao tamanho do conteúdo
    setTitle("Snake Game");
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
```

- O método `add(new Board())` adiciona o painel de jogo ao JFrame.
- `pack()` ajusta o tamanho da janela para o tamanho do painel.



### 10. Testando o Jogo

Agora, se você executar o código, verá uma janela preta de 300x300, que é a base do nosso jogo da cobrinha!

---

Este é o início da criação do jogo da cobrinha! A seguir, adicionaremos mais funcionalidades, como a lógica da cobrinha, movimentação, comida e pontuação. Quer continuar?
