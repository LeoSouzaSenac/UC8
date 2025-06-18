# Trabalhando com JTable no NetBeans GUI Builder

## O que é um JTable?

`JTable` é um componente Swing utilizado para exibir dados em formato de tabela (linhas e colunas). É amplamente usado para apresentar dados tabulares como planilhas, resultados de consultas, etc.

Ele pode ser manipulado dinamicamente através de um modelo de dados chamado `DefaultTableModel`.

---

## Criando uma Tabela com GUI no NetBeans

No NetBeans, ao adicionar uma `JTable` pelo editor visual, o código é gerado automaticamente no método `initComponents()`. Embora esse método não deva ser alterado manualmente, podemos manipular a tabela usando um `DefaultTableModel` fora dele.

---

## O que é `DefaultTableModel`?

`DefaultTableModel` é a implementação mais comum de `TableModel`, permitindo adicionar, remover e editar linhas e colunas dinamicamente.

### Exemplo de uso:

```java
DefaultTableModel modelo = new DefaultTableModel();
modelo.addColumn("Nome");
modelo.addColumn("Idade");
modelo.addRow(new Object[]{"Ana", 25});
tabela.setModel(modelo);
```

---

## Principais Operações com JTable

### Adicionar Linha à Tabela

```java
modelo.addRow(new Object[]{txtNome.getText(), txtIdade.getText()});
```

### Remover Linha Selecionada

```java
int linha = tabela.getSelectedRow();
if (linha != -1) {
    modelo.removeRow(linha);
}
```

### Obter Dados da Linha Selecionada

```java
int linha = tabela.getSelectedRow();
String nome = modelo.getValueAt(linha, 0).toString();
String idade = modelo.getValueAt(linha, 1).toString();
```

### Atualizar Célula da Tabela

```java
modelo.setValueAt("Novo Nome", 0, 0); // linha 0, coluna 0
```

### Limpar Tabela

```java
modelo.setRowCount(0);
```

---

## Criando um JTable no NetBeans

### Passos:

1. **Abra o NetBeans e crie um novo projeto Java com GUI (Swing).**
2. **Adicione um JFrame Form ao projeto.**
3. **Arraste os seguintes componentes para o formulário:**

   * `JTable` (Tabela)
   * `JScrollPane` (a `JTable` deve estar dentro dele)
   * Dois `JTextField` (por exemplo: `txtNome`, `txtIdade`)
   * Três `JButton` (`Adicionar`, `Remover`, `Limpar`)

---

## Configurando os Componentes no NetBeans

1. **Clique na `JTable` e defina colunas iniciais** (ex.: "Nome", "Idade") pelo modelo na aba "Properties".
2. **Renomeie os componentes:**

   * `JTable`: **tabelaDados**
   * `JTextField`s: **txtNome**, **txtIdade**
   * `JButtons`: **btnAdicionar**, **btnRemover**, **btnLimpar**

---

## Criando a Lógica no Código

### 1. Declarar o Modelo

No início da classe (fora dos métodos), declare:

```java
private DefaultTableModel modeloTabela;
```

No construtor, após `initComponents();`, inicialize o modelo:

```java
modeloTabela = (DefaultTableModel) tabelaDados.getModel();
```

### 2. Botão Adicionar

Clique duas vezes no botão **Adicionar** e adicione:

```java
private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {
    String nome = txtNome.getText().trim();
    String idade = txtIdade.getText().trim();

    if (!nome.isEmpty() && !idade.isEmpty()) {
        modeloTabela.addRow(new Object[]{nome, idade});
        txtNome.setText("");
        txtIdade.setText("");
    }
}
```

### 3. Botão Remover

```java
private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {
    int linhaSelecionada = tabelaDados.getSelectedRow();
    if (linhaSelecionada != -1) {
        modeloTabela.removeRow(linhaSelecionada);
    }
}
```

### 4. Botão Limpar

```java
private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {
    modeloTabela.setRowCount(0); // Remove todas as linhas
}
```
