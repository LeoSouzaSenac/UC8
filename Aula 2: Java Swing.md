## Aula 2: Manipulação de Eventos em Java Swing no NetBeans

### Objetivos
- Compreender o funcionamento do modelo de eventos em Java Swing.
- Entender o papel dos principais *Listeners* (ActionListener, MouseListener, KeyListener).
- Implementar eventos de clique em botões e criar interações simples.
  
### Estrutura da Aula
1. Explicação Teórica do Modelo de Eventos em Swing
2. Exemplos Práticos de *Listeners*
3. Exercícios Guiados (Incluindo jogos simples)

---

### 1. Modelo de Eventos em Java Swing

Em Java Swing, o sistema de eventos é baseado no modelo de **Observador**. Isso significa que:
- Um evento ocorre quando um usuário interage com a interface (ex: clica em um botão).
- O evento é capturado por um **Listener** (ou "ouvinte"), que responde ao evento.
- Para cada tipo de interação (clique, tecla pressionada, etc.), existe um *Listener* específico que pode ser usado.

#### Exemplo de Funcionamento
1. O usuário clica em um botão.
2. O *Button* gera um **evento de ação**.
3. O **ActionListener** “escuta” o evento e executa o código associado.

#### Principais *Listeners*
- **ActionListener**: Usado para capturar ações como cliques em botões.
- **MouseListener**: Usado para eventos de mouse (clique, entrar e sair da área de um componente).
- **KeyListener**: Usado para eventos de teclado (tecla pressionada, liberada).

---

### 2. Exemplos Práticos

#### Exemplo 1: ActionListener - Clique no Botão
Neste exemplo, vamos criar um botão que exibe uma mensagem quando clicado.

1. **Criando a Interface:**
   - Abra o NetBeans e crie um novo projeto Java com GUI.
   - Adicione um botão (`JButton`) e um rótulo (`JLabel`) à interface.
   - Nomeie o botão como `btnClick` e o rótulo como `lblMessage`.

2. **Código:**
   - Clique duas vezes no botão `btnClick` para abrir o editor de código.
   - Adicione o código abaixo dentro do método do evento `ActionPerformed`:

     ```java
     private void btnClickActionPerformed(java.awt.event.ActionEvent evt) {
         lblMessage.setText("Olá! Você clicou no botão!");
     }
     ```
    - Se preferir, na aba Design do NetBeans, ao lado de Properties, há a opção Events. Selecione *actionPerformed* e um código será criado automaticamente.
    - 
3. **Explicação:**
   - Quando o botão é clicado, o *ActionListener* detecta o evento e executa o código que define o texto do rótulo como "Olá! Você clicou no botão!"

---

#### Exemplo 2: MouseListener - Evento de Mouse

Neste exemplo, vamos detectar quando o mouse entra e sai da área de um botão.

1. **Criando a Interface:**
   - Adicione outro botão chamado `btnHover`.
   - Adicione um `JLabel` com o nome `lblHoverMessage`.

2. **Código:**
   - Clique no botão `btnHover` e vá para a aba "Eventos" -> "Mouse" -> "mouseEntered".
   - No evento `mouseEntered`, adicione o seguinte código:

     ```java
     private void btnHoverMouseEntered(java.awt.event.MouseEvent evt) {
         lblHoverMessage.setText("Mouse sobre o botão!");
     }
     ```

   - Agora, vá para o evento `mouseExited` e adicione:

     ```java
     private void btnHoverMouseExited(java.awt.event.MouseEvent evt) {
         lblHoverMessage.setText("");
     }
     ```

3. **Explicação:**
   - Quando o mouse entra na área do botão, o texto do `lblHoverMessage` muda para "Mouse sobre o botão!".
   - Quando o mouse sai, o texto volta a ser vazio.

---

#### Exemplo 3: KeyListener - Eventos de Teclado

Neste exemplo, vamos fazer com que o programa detecte quando uma tecla específica é pressionada.

1. **Criando a Interface:**
   - Adicione um campo de texto (`JTextField`) e um rótulo (`JLabel`).
   - Nomeie o campo de texto como `txtInput` e o rótulo como `lblKeyMessage`.

2. **Código:**
   - No `JTextField`, vá para "Eventos" -> "Key" -> "keyPressed".
   - Adicione o código abaixo:

     ```java
     private void txtInputKeyPressed(java.awt.event.KeyEvent evt) {
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
             lblKeyMessage.setText("Enter foi pressionado!");
         }
     }
     ```

3. **Explicação:**
   - Quando o usuário pressiona a tecla "Enter" no campo de texto, o rótulo exibe "Enter foi pressionado!".

---

### 3. Exercícios Guiados

#### Exercício 1: Jogo de Clique no Botão

**Objetivo**: Criar um jogo onde o aluno precisa clicar em um botão que muda de posição na tela.

1. Adicione um botão (`JButton`) chamado `btnClickMe`.
2. No evento `ActionPerformed` do botão, faça com que ele mude de posição na tela.
   
   ```java
   private void btnClickMeActionPerformed(java.awt.event.ActionEvent evt) {
       int maxX = this.getWidth() - btnClickMe.getWidth();
       int maxY = this.getHeight() - btnClickMe.getHeight();
        
       int x = (int) (Math.random() * maxX);
       int y = (int) (Math.random() * maxY);
        
       btnClickMe.setLocation(x, y);
   }
   ```
3. **Desafio**: Fazer com que o programa conte quantas vezes o botão foi clicado e exiba essa contagem. Dica: crie um jLabel e use setText() para trocar o texto 

#### Exercício 2: Jogo de Reação com Mouse

**Objetivo**: Criar um jogo onde o aluno precisa clicar em uma área específica para marcar pontos.

1. Adicione um botão (`JButton`) chamado `btnTarget`.
2. No evento `mouseEntered` do botão, mude a posição do botão aleatoriamente.
   
   ```java
   private void btnTargetMouseEntered(java.awt.event.MouseEvent evt) {
       int x = (int) (Math.random() * this.getWidth());
       int y = (int) (Math.random() * this.getHeight());
       btnTarget.setLocation(x, y);
   }
   ```
3. **Desafio**: Adicione um rótulo que exiba a quantidade de vezes que o botão foi clicado.

#### Exercício 3: Campo de Texto Mágico

**Objetivo**: O aluno digita um número em um campo de texto e, ao pressionar Enter, o programa responde se o número está correto.

1. Adicione um `JTextField` chamado `txtGuess` e um `JLabel` chamado `lblFeedback`.
2. No evento `keyPressed` do `txtGuess`, faça o seguinte:
   
   ```java
   private void txtGuessKeyPressed(java.awt.event.KeyEvent evt) {
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           int numeroSecreto = 7; // Número secreto a ser adivinhado
           int tentativa = Integer.parseInt(txtGuess.getText());
           if (tentativa == numeroSecreto) {
               lblFeedback.setText("Parabéns! Você acertou!");
           } else {
               lblFeedback.setText("Tente novamente!");
           }
       }
   }
   ```
3. **Desafio**: Escolha um número aleatório para ser o "número secreto" cada vez que o jogo começa.
