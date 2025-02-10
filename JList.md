# Trabalhando com JList no NetBeans GUI Builder

## O que é um JList?
`JList` é um componente da biblioteca Swing do Java que exibe uma lista de itens. Ele pode ser usado para seleções múltiplas ou únicas e manipulado com um `DefaultListModel`.

# Trabalhando com JList no NetBeans

## Criando uma Lista com GUI no NetBeans

O NetBeans possui um editor gráfico que facilita a criação de interfaces Swing. Quando criamos uma `JList`, o próprio ambiente gera o código dentro do método `initComponents()`, e não podemos modificá-lo diretamente pelo código. No entanto, podemos manipular a lista utilizando modelos de dados e eventos.

---

## O que é `DefaultListModel`?

O `DefaultListModel` é uma implementação de `ListModel`, que armazena os elementos da `JList`. Ele permite adicionar, remover e modificar itens dinamicamente.

### Exemplo de uso:
```java
DefaultListModel<String> modelo = new DefaultListModel<>();
modelo.addElement("Item 1");
modelo.addElement("Item 2");
modelo.addElement("Item 3");
lista.setModel(modelo);
```

No NetBeans, devemos criar um `DefaultListModel` fora do `initComponents()` e depois associá-lo à `JList`.

---

## Métodos Principais do JList

### Adicionando um Item à Lista
```java
modelo.addElement(txtItem.getText());
txtItem.setText(""); // Limpa o campo de texto
```

### Removendo um Item Selecionado
```java
int index = lista.getSelectedIndex();
if (index != -1) { // Verifica se algum item está selecionado
    modelo.remove(index);
}
```

### Obtendo o Item Selecionado
```java
String itemSelecionado = lista.getSelectedValue();
System.out.println("Selecionado: " + itemSelecionado);
```

### Limpando a Lista
```java
modelo.clear();
```



## Criando um JList no NetBeans
1. **Abra o NetBeans e crie um novo projeto Java com GUI (Swing).**
2. **Adicione um JFrame Form** ao projeto.
3. **No editor visual, arraste e solte os seguintes componentes:**
   - `JList` (Lista)
   - `JScrollPane` (para envolver a `JList`)
   - `JTextField` (para entrada de novos itens)
   - Dois `JButton` (um para adicionar e outro para remover itens da lista)

## Configurando os componentes no NetBeans
1. **Selecione a `JList`** no GUI Builder e, na propriedade `model`, defina um modelo padrão, como `Pokemon 1, Pokemon 2, Pokemon 3`.
2. **Renomeie os componentes** na aba "Properties" para facilitar a manipulação no código:
   - `JList`: **listaItens**
   - `JTextField`: **txtItem**
   - `JButton` (Adicionar): **btnAdicionar**
   - `JButton` (Remover): **btnRemover**

## Criando a Lógica no Código
Como o NetBeans gera automaticamente o método `initComponents()`, **não podemos modificar diretamente a JList dentro dele**. Para isso, criamos um `DefaultListModel` para controlar os itens.

### 1. Criar o modelo da lista
No início da classe (antes do construtor), declare:

```java
private DefaultListModel<String> modeloLista;
```

No construtor, após `initComponents();`, inicialize o modelo:

```java
modeloLista = new DefaultListModel<>();
listaItens.setModel(modeloLista);
```

### 2. Implementar o botão de adicionar itens
Clique duas vezes no botão **Adicionar** no GUI Builder para gerar um evento `ActionPerformed`. Em seguida, adicione o seguinte código:

```java
private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {                                              
    String novoItem = txtItem.getText().trim();
    if (!novoItem.isEmpty()) {
        modeloLista.addElement(novoItem);
        txtItem.setText(""); // Limpa o campo
    }
}
```

### 3. Implementar o botão de remover itens
Clique duas vezes no botão **Remover** para gerar um evento e adicione o seguinte código:

```java
private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {                                              
    int index = listaItens.getSelectedIndex();
    if (index != -1) { // Verifica se algo foi selecionado
        modeloLista.remove(index);
    }
}
```

## Conclusão
Agora você tem uma interface funcional que permite adicionar e remover itens dinamicamente em uma `JList`! Como tudo foi feito sem modificar `initComponents()`, você pode continuar usando o GUI Builder sem problemas.

Caso precise de mais ajustes, me avise! 🚀

