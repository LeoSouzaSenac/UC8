# Principais Métodos do Java Swing

Abaixo estão listados os principais métodos utilizados no **Java Swing**, organizados por componente.

---

## **JButton**
- `setText(String text)` - Define o texto do botão.
- `getText()` - Retorna o texto do botão.
- `addActionListener(ActionListener listener)` - Adiciona um ouvinte para capturar cliques no botão.

---

## **JLabel**
- `setText(String text)` - Define o texto do rótulo.
- `getText()` - Retorna o texto do rótulo.
- `setIcon(Icon icon)` - Define um ícone para o rótulo.
- `setHorizontalAlignment(int alignment)` - Define o alinhamento horizontal do texto ou ícone.

---

## **JTextField**
- `setText(String text)` - Define o texto no campo de texto.
- `getText()` - Retorna o texto inserido no campo.
- `setEditable(boolean editable)` - Ativa ou desativa a edição do campo.
- `addActionListener(ActionListener listener)` - Adiciona um ouvinte para capturar eventos de ação, como pressionar "Enter".

---

## **JTextArea**
- `setText(String text)` - Define o texto na área de texto.
- `getText()` - Retorna o texto da área de texto.
- `append(String text)` - Adiciona texto ao final da área de texto existente.
- `setLineWrap(boolean wrap)` - Define se o texto deve ser quebrado automaticamente.
- `setWrapStyleWord(boolean word)` - Define se as quebras devem ocorrer em palavras completas.

---

## **JCheckBox**
- `setText(String text)` - Define o texto associado à caixa de seleção.
- `isSelected()` - Retorna o estado atual da caixa de seleção (true ou false).
- `setSelected(boolean selected)` - Define o estado da caixa de seleção.

---

## **JRadioButton**
- `setText(String text)` - Define o texto associado ao botão de rádio.
- `isSelected()` - Retorna o estado atual do botão de rádio.
- `setSelected(boolean selected)` - Define o estado do botão de rádio.

---

## **JComboBox**
- `addItem(Object item)` - Adiciona um item ao combo box.
- `removeItem(Object item)` - Remove um item do combo box.
- `getSelectedItem()` - Retorna o item selecionado.
- `setSelectedItem(Object item)` - Define o item selecionado.

---

## **JTable**
- `setModel(TableModel model)` - Define o modelo de dados para a tabela.
- `getValueAt(int row, int column)` - Retorna o valor de uma célula específica.
- `setValueAt(Object value, int row, int column)` - Define o valor de uma célula específica.
- `getRowCount()` - Retorna o número de linhas.
- `getColumnCount()` - Retorna o número de colunas.

---

## **JPanel**
- `add(Component comp)` - Adiciona um componente ao painel.
- `remove(Component comp)` - Remove um componente do painel.
- `setLayout(LayoutManager manager)` - Define o gerenciador de layout do painel.

---

## **JFrame**
- `setTitle(String title)` - Define o título da janela.
- `setSize(int width, int height)` - Define o tamanho da janela.
- `setDefaultCloseOperation(int operation)` - Define a ação ao fechar a janela (ex.: `JFrame.EXIT_ON_CLOSE`).
- `setVisible(boolean visible)` - Torna a janela visível.
- `add(Component comp)` - Adiciona um componente à janela.

---

## **JMenuBar**
- `add(JMenu menu)` - Adiciona um menu à barra de menus.
- `setVisible(boolean visible)` - Torna a barra de menus visível.

---

## **JMenu**
- `add(JMenuItem item)` - Adiciona um item ao menu.
- `addSeparator()` - Adiciona um separador ao menu.
- `setText(String text)` - Define o texto do menu.

---

## **JMenuItem**
- `setText(String text)` - Define o texto do item do menu.
- `addActionListener(ActionListener listener)` - Adiciona um ouvinte para capturar cliques no item.

---

## **JSlider**
- `setValue(int value)` - Define o valor atual do slider.
- `getValue()` - Retorna o valor atual do slider.
- `setMinimum(int min)` - Define o valor mínimo do slider.
- `setMaximum(int max)` - Define o valor máximo do slider.

---

Esses são os métodos mais comuns e úteis ao trabalhar com Java Swing. Para detalhes adicionais, consulte a documentação oficial do [Java Swing](https://docs.oracle.com/javase/8/docs/api/javax/swing/package-summary.html).
