### **1. JFrame**  
**O que é**: Representa uma janela principal em uma aplicação Swing.  
**O que fazer com ele**: Use para criar a base da interface gráfica onde outros componentes serão adicionados.  

**Exemplo**:  
```java
JFrame frame = new JFrame("Minha Janela");
frame.setSize(400, 300);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
```

---

### **2. JPanel**  
**O que é**: Um contêiner genérico que pode conter outros componentes.  
**O que fazer com ele**: Use para organizar layouts ou agrupar componentes.  

**Exemplo**:  
```java
JPanel panel = new JPanel();
panel.add(new JButton("Botão no painel"));
frame.add(panel);
```

---

### **3. JLabel**  
**O que é**: Um rótulo para exibir texto ou imagens.  
**O que fazer com ele**: Exiba mensagens, títulos, ou imagens.  

**Exemplo**:  
```java
JLabel label = new JLabel("Bem-vindo ao Java Swing!");
frame.add(label);
```

---

### **4. JButton**  
**O que é**: Um botão clicável.  
**O que fazer com ele**: Use para capturar ações do usuário.  

**Exemplo**:  
```java
JButton button = new JButton("Clique aqui");
button.addActionListener(e -> System.out.println("Botão clicado!"));
frame.add(button);
```

---

### **5. JTextField**  
**O que é**: Campo de texto para entrada de uma única linha.  
**O que fazer com ele**: Capture entradas simples, como nomes ou números.  

**Exemplo**:  
```java
JTextField textField = new JTextField(20);
frame.add(textField);
```

---

### **6. JTextArea**  
**O que é**: Área de texto para múltiplas linhas.  
**O que fazer com ele**: Use para entradas ou exibição de textos longos.  

**Exemplo**:  
```java
JTextArea textArea = new JTextArea(5, 20);
frame.add(new JScrollPane(textArea)); // Com barra de rolagem
```

---

### **7. JCheckBox**  
**O que é**: Um botão de seleção para marcar ou desmarcar.  
**O que fazer com ele**: Use para opções booleanas.  

**Exemplo**:  
```java
JCheckBox checkBox = new JCheckBox("Aceitar termos");
frame.add(checkBox);
```

---

### **8. JRadioButton**  
**O que é**: Botões de opção para escolhas mutuamente exclusivas.  
**O que fazer com ele**: Use em conjunto com `ButtonGroup` para criar seleções únicas.  

**Exemplo**:  
```java
JRadioButton radio1 = new JRadioButton("Opção 1");
JRadioButton radio2 = new JRadioButton("Opção 2");
ButtonGroup group = new ButtonGroup();
group.add(radio1);
group.add(radio2);
frame.add(radio1);
frame.add(radio2);
```

---

### **9. JComboBox**  
**O que é**: Um menu suspenso.  
**O que fazer com ele**: Use para escolhas de lista.  

**Exemplo**:  
```java
String[] options = {"Item 1", "Item 2", "Item 3"};
JComboBox<String> comboBox = new JComboBox<>(options);
frame.add(comboBox);
```

---

### **10. JList**  
**O que é**: Lista de seleção.  
**O que fazer com ele**: Exiba listas com suporte a seleção de itens únicos ou múltiplos.  

**Exemplo**:  
```java
String[] listItems = {"Item A", "Item B", "Item C"};
JList<String> list = new JList<>(listItems);
frame.add(new JScrollPane(list));
```

---

### **11. JTable**  
**O que é**: Tabela de dados.  
**O que fazer com ele**: Exiba dados organizados em linhas e colunas.  

**Exemplo**:  
```java
String[][] data = {{"1", "Alice"}, {"2", "Bob"}};
String[] columns = {"ID", "Nome"};
JTable table = new JTable(data, columns);
frame.add(new JScrollPane(table));
```

---

### **12. JSlider**  
**O que é**: Controle deslizante para valores numéricos.  
**O que fazer com ele**: Capture valores dentro de um intervalo.  

**Exemplo**:  
```java
JSlider slider = new JSlider(0, 100, 50);
frame.add(slider);
```

---

### **13. JProgressBar**  
**O que é**: Barra de progresso para exibir status.  
**O que fazer com ele**: Mostre o andamento de tarefas.  

**Exemplo**:  
```java
JProgressBar progressBar = new JProgressBar(0, 100);
progressBar.setValue(75);
frame.add(progressBar);
```

---

### **14. JOptionPane**  
**O que é**: Caixa de diálogo para mensagens, entrada ou confirmação.  
**O que fazer com ele**: Exiba mensagens ou capture entradas rápidas.  

**Exemplo**:  
```java
JOptionPane.showMessageDialog(frame, "Mensagem exibida!");
```

---

### **15. JMenuBar, JMenu e JMenuItem**  
**O que é**: Componentes para criar menus suspensos.  
**O que fazer com eles**: Crie barras de menus, opções e submenus.  

**Exemplo**:  
```java
JMenuBar menuBar = new JMenuBar();
JMenu menu = new JMenu("Arquivo");
JMenuItem menuItem = new JMenuItem("Abrir");
menu.add(menuItem);
menuBar.add(menu);
frame.setJMenuBar(menuBar);
```

---

### **16. JScrollPane**  
**O que é**: Um contêiner com barra de rolagem.  
**O que fazer com ele**: Adicione componentes grandes, como tabelas ou áreas de texto, que podem precisar de rolagem.  

**Exemplo**:  
```java
JTextArea largeText = new JTextArea(10, 30);
frame.add(new JScrollPane(largeText));
```
