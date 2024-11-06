# Aula 1: Introdução aos Componentes Básicos do Swing

## Objetivo
Aprender a criar uma interface gráfica simples com Java Swing usando o **GUI Builder** do NetBeans. Vamos entender como adicionar e configurar componentes básicos como **JFrame**, **JLabel**, **JButton** e **JTextField**, tanto visualmente quanto via código.

## Conteúdo

### 1. Introdução ao Swing
O **Swing** é uma biblioteca Java para criar interfaces gráficas. Ele oferece uma série de componentes visuais como botões, rótulos, campos de texto, que podemos usar para construir aplicações desktop interativas. Usaremos o NetBeans, que tem uma ferramenta visual chamada **GUI Builder** para facilitar a criação dessas interfaces.

### 2. Componentes Básicos do Swing
Na aula de hoje, vamos trabalhar com os seguintes componentes do Swing:

- **JFrame**: A janela principal da aplicação.
- **JLabel**: Um rótulo para exibir texto.
- **JButton**: Um botão clicável.
- **JTextField**: Um campo de entrada de texto.

### 3. Usando o GUI Builder no NetBeans
O NetBeans permite a criação de interfaces gráficas de forma visual através do **GUI Builder (Matisse)**, onde você pode arrastar e soltar componentes, e o NetBeans gera automaticamente o código correspondente.

## Passo a Passo para Criar a Interface Gráfica

### 1. Criar o Projeto no NetBeans

1. **Abra o NetBeans**.
2. **Crie um novo projeto**:
   - Clique em **File** > **New Project**.
   - Selecione **Java** > **Java Application** e clique em **Next**.
   - Dê um nome ao projeto (por exemplo, **MinhaPrimeiraInterface**) e clique em **Finish**.
   
### 2. Criar a Interface Gráfica Usando o GUI Builder

Agora vamos usar o **GUI Builder** para criar a interface visualmente.

1. **Abrir a Classe JFrame no GUI Builder**:
   - No **Project Explorer** (lado esquerdo), clique com o botão direito na classe principal do seu projeto (que geralmente tem o mesmo nome do projeto, como `MinhaPrimeiraInterface.java`).
   - Selecione **"Open in Designer"**. Isso abrirá a interface gráfica onde você poderá arranjar os componentes.

2. **Adicionar Componentes Visualmente**:
   - **JFrame**: A janela principal já estará criada. Você pode ajustar o título da janela clicando na janela e alterando o campo **Text** nas propriedades (no painel inferior).
   - **JLabel**: Arraste um componente **JLabel** da **Palette** (painel à direita) e solte na janela principal. No campo **Text**, altere para "Bem-vindo ao Java Swing!".
   - **JTextField**: Arraste um **JTextField** para a janela. Ele aparecerá como uma caixa de texto. Você pode ajustar a largura e a altura diretamente na tela.
   - **JButton**: Arraste um **JButton** para a janela. Altere o texto do botão para "Clique Aqui".
   
   Quando você arrasta e solta os componentes, o NetBeans irá automaticamente gerar o código para esses componentes.

3. **Visualizar em Tempo Real**:
   - À medida que você adiciona os componentes, a interface gráfica é atualizada na tela, e você pode ver em tempo real o layout da sua janela.

### 3. Gerar o Código do GUI Builder

Após adicionar os componentes visualmente, o NetBeans gera o código Java automaticamente. Para ver o código gerado:

1. **Volte para a aba de código**:
   - Clique na aba **Source** na parte superior da janela do NetBeans (onde está o código fonte).
   
2. **Código Gerado**:
   O NetBeans gera o código correspondente aos componentes que você adicionou visualmente. Veja o exemplo abaixo:

```java
import javax.swing.*;

public class MinhaPrimeiraInterface {
    public MinhaPrimeiraInterface() {
        // Criando o JFrame
        JFrame frame = new JFrame("Minha Primeira Interface");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        
        // Criando o JLabel
        JLabel label = new JLabel("Bem-vindo ao Java Swing!");
        frame.add(label);

        // Criando o JTextField
        JTextField textField = new JTextField(20);
        frame.add(textField);

        // Criando o JButton
        JButton button = new JButton("Clique Aqui");
        frame.add(button);

        // Tornando o JFrame visível
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Chamando o construtor para exibir a interface
        new MinhaPrimeiraInterface();
    }
}
```

### 4. Executar o Código

Para ver a interface em funcionamento:

1. **Clique no botão "Run" (Executar)** na parte superior do NetBeans ou pressione **F6**.
2. O NetBeans compilará o código e abrirá a janela com os componentes que você adicionou.

---

## Exercícios

### 1. **Explorando o JLabel**:
   - Crie um novo `JLabel` com seu nome e adicione-o à interface. Tente modificar a cor e o alinhamento do texto usando o painel de propriedades.

### 2. **Modificando o JTextField**:
   - Adicione um novo `JTextField` abaixo do primeiro e defina seu limite de caracteres para 10. Explore a funcionalidade para alterar o tamanho do campo de texto diretamente na interface gráfica.

### 3. **Adicionando Ações ao JButton**:
   - No código gerado pelo NetBeans, adicione uma ação ao **JButton** para que, ao clicar no botão, ele altere o texto do `JLabel` para "Você clicou no botão!".
   - Exemplo de código para adicionar uma ação ao botão:
   
   ```java
   button.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
           label.setText("Você clicou no botão!");
       }
   });
   ```

### 4. **Explorando o Layout**:
   - No GUI Builder, experimente alterar o **layout** da janela para `BorderLayout` ou `GridLayout`. Observe como os componentes se reposicionam na interface.

---

## Conclusão
Na primeira aula, você aprendeu a criar uma interface gráfica simples usando Java Swing no NetBeans. Ao utilizar o **GUI Builder**, foi possível adicionar e configurar componentes visualmente, enquanto também aprendia o código gerado para cada componente. Esse processo ajudará a entender como funciona a criação de interfaces gráficas e como personalizar o comportamento dos componentes. Nas próximas aulas, vamos explorar como adicionar interatividade e funcionalidades mais avançadas!

