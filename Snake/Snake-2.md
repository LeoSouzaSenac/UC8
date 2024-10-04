### 11. Definindo a Cobrinha

- Para criar a lógica da cobrinha, vamos precisar de algumas variáveis para armazenar sua posição e direção. 

**Passo 11.1:** Dentro da classe `Board`, declare as seguintes variáveis para a cobrinha:

```java
private int[] x; // Posições x da cobrinha
private int[] y; // Posições y da cobrinha
private int dots; // Quantidade de segmentos da cobrinha
private int apple_x; // Posição x da comida
private int apple_y; // Posição y da comida
private boolean leftDirection = false; // Direção esquerda
private boolean rightDirection = true; // Direção direita
private boolean upDirection = false; // Direção para cima
private boolean downDirection = false; // Direção para baixo
private boolean inGame = true; // Estado do jogo
```

- Aqui estamos criando:
  - `x` e `y`: Arrays que armazenam a posição de cada segmento da cobrinha.
  - `dots`: Para contar quantos segmentos a cobrinha tem.
  - `apple_x` e `apple_y`: Para armazenar a posição da comida.
  - `leftDirection`, `rightDirection`, `upDirection`, `downDirection`: Para controlar a direção da cobrinha.
  - `inGame`: Para verificar se o jogo ainda está ativo.

---

### 12. Inicializando a Cobrinha e a Comida

- Precisamos de um método para inicializar a posição da cobrinha e da comida quando o jogo começa.

**Passo 12.1:** Crie um método chamado `initGame()` na classe `Board`.

```java
private void initGame() {
    dots = 3; // Inicialmente, a cobrinha terá 3 segmentos
    for (int z = 0; z < dots; z++) {
        x[z] = 50 - z * 10; // Define a posição inicial da cobrinha
        y[z] = 50; // Todos na mesma linha
    }
    locateApple(); // Localiza a comida na tela
}
```

- O loop `for` inicializa a posição da cobrinha, colocando-a na horizontal na posição (50, 50).
- O método `locateApple()` será responsável por posicionar a comida.

**Passo 12.2:** Agora, vamos implementar o método `locateApple()`.

```java
private void locateApple() {
    int r = (int) (Math.random() * 29); // Gera uma posição aleatória
    apple_x = (r * 10); // Multiplica por 10 para alinhar com a grade
    r = (int) (Math.random() * 29);
    apple_y = (r * 10); // Mesma lógica para a posição y
}
```

- `Math.random() * 29` gera um número aleatório entre 0 e 28, e multiplicamos por 10 para que a posição esteja alinhada com a grade do tabuleiro.

---

### 13. Desenhando a Cobrinha e a Comida

- Precisamos desenhar a cobrinha e a comida no painel.

**Passo 13.1:** Override o método `paintComponent(Graphics g)` na classe `Board` para desenhar a cobrinha e a comida.

```java
@Override
protected void paintComponent(Graphics g) {
    super.paintComponent(g); // Chama o método pai
    if (inGame) {
        g.setColor(Color.RED); // Cor da comida
        g.fillRect(apple_x, apple_y, 10, 10); // Desenha a comida

        for (int z = 0; z < dots; z++) {
            g.setColor(Color.GREEN); // Cor da cobrinha
            g.fillRect(x[z], y[z], 10, 10); // Desenha cada segmento da cobrinha
        }
    } else {
        gameOver(g); // Chama o método que desenha a tela de Game Over
    }
}
```

- `g.fillRect(...)` é usado para desenhar retângulos, representando a comida e cada segmento da cobrinha.
- O método `gameOver(g)` será responsável por exibir uma mensagem quando o jogo terminar.

---

### 14. Atualizando a Posição da Cobrinha

- Precisamos de um método para atualizar a posição da cobrinha a cada vez que o `Timer` dispara.

**Passo 14.1:** Crie um método chamado `checkCollision()` para verificar se a cobrinha colidiu com ela mesma ou com as bordas do painel.

```java
private void checkCollision() {
    for (int z = dots; z > 0; z--) {
        if (z > 3 && x[0] == x[z] && y[0] == y[z]) {
            inGame = false; // Colisão com a própria cobrinha
        }
    }

    if (x[0] < 0 || x[0] >= B_WIDTH || y[0] < 0 || y[0] >= B_HEIGHT) {
        inGame = false; // Colisão com as bordas
    }

    if (!inGame) {
        timer.stop(); // Para o timer se o jogo terminar
    }
}
```

- Esse método verifica se a cabeça da cobrinha colidiu com algum segmento dela mesma ou se saiu dos limites do painel.

**Passo 14.2:** Vamos implementar o método `move()`, que atualiza a posição da cobrinha.

```java
private void move() {
    for (int z = dots; z > 0; z--) {
        x[z] = x[z - 1]; // Move cada segmento para a posição do anterior
        y[z] = y[z - 1];
    }

    if (leftDirection) {
        x[0] -= 10; // Move para a esquerda
    }

    if (rightDirection) {
        x[0] += 10; // Move para a direita
    }

    if (upDirection) {
        y[0] -= 10; // Move para cima
    }

    if (downDirection) {
        y[0] += 10; // Move para baixo
    }
}
```

- Aqui estamos movendo a cobrinha atualizando a posição da cabeça e empurrando os segmentos.

---

### 15. Comendo a Comida

- Agora, precisamos verificar se a cobrinha comeu a comida e, se sim, aumentar o tamanho da cobrinha.

**Passo 15.1:** Adicione o método `checkApple()` que verifica a colisão da cobrinha com a comida.

```java
private void checkApple() {
    if (x[0] == apple_x && y[0] == apple_y) {
        dots++; // Aumenta o tamanho da cobrinha
        locateApple(); // Relocaliza a comida
    }
}
```

- Se a cabeça da cobrinha estiver na mesma posição que a comida, aumentamos o número de segmentos (`dots`).

---

### 16. Integrando Tudo

- Agora, precisamos chamar todos esses métodos dentro do `actionPerformed()` do `Timer` para atualizar o estado do jogo.

**Passo 16.1:** Implemente o método `actionPerformed(ActionEvent e)` na classe `Board`.

```java
@Override
public void actionPerformed(ActionEvent e) {
    if (inGame) {
        move(); // Atualiza a posição da cobrinha
        checkApple(); // Verifica se a cobrinha comeu a comida
        checkCollision(); // Verifica colisões
    }

    repaint(); // Chama o paintComponent para redesenhar
}
```

- Esse método é chamado a cada tick do timer e chama os métodos que atualizam a lógica do jogo.

---

### 17. Implementando Game Over

- Agora, vamos criar o método `gameOver(Graphics g)` para exibir uma mensagem quando o jogo termina.

**Passo 17.1:** Adicione o seguinte método na classe `Board`.

```java
private void gameOver(Graphics g) {
    String msg = "Game Over";
    Font small = new Font("Helvetica", Font.BOLD, 14);
    FontMetrics metr = getFontMetrics(small);

    g.setColor(Color.WHITE); // Cor do texto
    g.setFont(small); // Define a fonte
    g.drawString(msg, (B_WIDTH - metr.stringWidth(msg)) / 2, B_HEIGHT / 2); // Centraliza o texto
}
```

- Esse método desenha a mensagem "Game Over" no centro do painel.

---

### 18. Controlando a Direção da Cobrinha

- Para mover a cobrinha, precisamos capturar as teclas pressionadas.

**Passo 18.1:** Adicione um método `keyPressed(KeyEvent e)` na classe `Board`.

```java
@Override
public void keyPressed(KeyEvent e) {
    int key = e.getKeyCode(); // Captura o código da tecla pressionada

    if (key == KeyEvent.VK_LEFT && !rightDirection) {
        leftDirection = true; // Mover para a esquerda
        upDirection = false;
        downDirection = false;
    }

    if (key == KeyEvent.VK_RIGHT && !leftDirection) {
        rightDirection = true; // Mover para a direita
        upDirection = false;
        downDirection = false;
    }

    if

 (key == KeyEvent.VK_UP && !downDirection) {
        upDirection = true; // Mover para cima
        rightDirection = false;
        leftDirection = false;
    }

    if (key == KeyEvent.VK_DOWN && !upDirection) {
        downDirection = true; // Mover para baixo
        rightDirection = false;
        leftDirection = false;
    }
}
```

- Aqui, estamos verificando qual tecla foi pressionada e atualizando as direções da cobrinha.

---

### 19. Finalizando a Classe Board

- Certifique-se de que sua classe `Board` implemente as interfaces `ActionListener` e `KeyListener`, e que o `KeyListener` seja adicionado ao painel.

**Passo 19.1:** Certifique-se de que a classe `Board` tenha o seguinte no seu construtor:

```java
setBackground(Color.BLACK); // Cor do fundo
setFocusable(true); // Para receber eventos de teclado
addKeyListener(this); // Adiciona o KeyListener
```

---

### 20. Executando o Jogo

- Para rodar o jogo, adicione um método `main` na classe `SnakeGame` que inicializa a `Board`.

```java
public static void main(String[] args) {
    JFrame frame = new JFrame("Snake Game");
    Board board = new Board();
    frame.add(board);
    frame.setSize(B_WIDTH, B_HEIGHT);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.setResizable(false);
}
```

- Isso cria a janela do jogo e adiciona o painel `Board` a ela.

---

### 21. Testando o Jogo

- Compile e execute o jogo! Você deve ver a cobrinha na tela e a comida. Use as setas do teclado para mover a cobrinha.

---

### 22. Melhorias Futuras

- Você pode adicionar mais funcionalidades, como um sistema de pontuação, níveis de dificuldade, ou até mesmo animações para deixar o jogo mais interessante.
