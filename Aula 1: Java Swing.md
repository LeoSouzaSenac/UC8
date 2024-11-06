# Aula 1: Introdução ao Swing e ao GUI Builder no NetBeans

## Objetivo da Aula

1. **Entender a estrutura básica do código Swing** gerado pelo NetBeans.
2. **Aprender sobre JFrame, JLabel, JButton e o GUI Builder**, explicando a estrutura e a função de cada componente.
3. **Praticar criando e personalizando uma interface gráfica** com componentes básicos usando o NetBeans.

---

### Estrutura do Código Gerado

Aqui está a estrutura do código gerado pelo NetBeans para uma janela básica (`JFrame`):

```java
public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
}
```

### Explicação Passo a Passo do Código

1. **Classe JFrame**: `public class NewJFrame extends javax.swing.JFrame`
   - `JFrame` é a janela principal de uma aplicação Swing, que é a base para colocar outros componentes (botões, rótulos, caixas de texto).
   - **Extends** significa que `NewJFrame` herda as funcionalidades de `JFrame`.

2. **Construtor NewJFrame()**:
   - `public NewJFrame()` é o **construtor** da classe, onde a janela (`JFrame`) é inicializada chamando `initComponents()`.
   - O método `initComponents()` é gerado automaticamente pelo NetBeans e configura todos os elementos da interface gráfica.

3. **Configuração do Comportamento da Janela**:
   - `setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);` configura para encerrar o programa ao fechar a janela.

4. **Layout Manager**:
   - `javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());` cria um layout (organização dos componentes) usando `GroupLayout`.
   - `GroupLayout` permite posicionar componentes em grupos e é gerado automaticamente quando criamos uma janela em branco.

5. **Método pack()**:
   - `pack()` ajusta o tamanho da janela para caber todos os componentes.

6. **Método main()**:
   - O método `main` inicializa e exibe a janela (`NewJFrame`) na tela. A `EventQueue` cuida para que a janela seja exibida na **Thread de Eventos** do Swing.

---

## Criando a Primeira Interface com o GUI Builder

Agora que entendemos o código, vamos adicionar componentes básicos usando o GUI Builder. 

### Passos Práticos para Criar a Interface

1. **Criar o JFrame no GUI Builder**:
   - No NetBeans, crie um novo `JFrame Form` (`NewJFrame` já existe, então pode nomear `MinhaPrimeiraInterface`).
   - Isso abrirá o **GUI Builder** automaticamente.

2. **Adicionar Componentes**:
   - No GUI Builder, arraste um **JLabel** para a janela e posicione-o no topo. Configure o texto para "Bem-vindo!".
   - Arraste um **JButton** e posicione-o logo abaixo do `JLabel`. No botão, configure o texto para "Clique Aqui!".

3. **Configurar Propriedades**:
   - Selecione o `JButton` e, no painel **Properties**, altere a cor de fundo para uma cor de sua preferência.
   - Selecione o `JLabel` e altere a fonte e o tamanho do texto para deixá-lo mais visível.

### Explicação dos Componentes

- **JLabel**:
   - `JLabel` exibe um texto ou imagem. Não é interativo, ou seja, os usuários não podem clicar ou digitar nele.
   - Serve para mostrar informações aos usuários, como títulos ou mensagens.

- **JButton**:
   - `JButton` é um botão interativo. Pode ser configurado para executar ações quando clicado.
   - No NetBeans, você pode adicionar uma ação para o botão clicando com o botão direito > **Events > Action > actionPerformed** e escrever o código desejado.

---

## Exercícios Práticos

1. **Exercício 1: Personalizar a Janela**
   - Abra a janela no GUI Builder e mude o título para "Minha Primeira Interface".
   - Aumente o tamanho da janela para 500x400 pixels (clique nas bordas e arraste ou configure em **Properties > Preferred Size**).

2. **Exercício 2: Adicionar Ação ao Botão**
   - No `JButton`, clique com o botão direito e vá para **Events > Action > actionPerformed**. 
   - No código que se abre, adicione:
     ```java
     JOptionPane.showMessageDialog(this, "Olá! Você clicou no botão.");
     ```
   - Isso faz com que uma janela de mensagem apareça quando o botão é clicado.

3. **Exercício 3: Adicionar um JTextField**
   - No GUI Builder, arraste um **JTextField** (caixa de texto) e posicione-o ao lado do `JLabel`.
   - Adicione um segundo botão com o texto "Exibir Texto" abaixo do `JTextField`.
   - No segundo botão, adicione um evento `actionPerformed` e escreva o seguinte:
     ```java
     String texto = jTextField1.getText();
     JOptionPane.showMessageDialog(this, "Você digitou: " + texto);
     ```

### Explicação do Exercício

Esses exercícios ajudarão os alunos a entender os elementos principais de uma interface gráfica:

- **Componentes** (`JLabel`, `JButton`, `JTextField`) para entrada e saída de dados.
- **Eventos de ação** para tornar a interface interativa.
- **Exibição de mensagens** usando `JOptionPane` para mostrar pop-ups.
- Criado uma janela interativa que exibe mensagens ao clicar em botões e ao inserir texto.

Na próxima aula, vamos explorar mais componentes, como **JPanel** (para organizar outros componentes), **JCheckBox** e **JComboBox**, para criar interfaces mais completas. 
