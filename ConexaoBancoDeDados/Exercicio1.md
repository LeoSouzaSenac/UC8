## **Enunciado: Sistema de Gerenciamento de Usuários com SQLite**

---

### **Objetivo**
Desenvolver uma aplicação em **Java** utilizando o **GUI Builder do NetBeans** para criar uma interface gráfica que permita gerenciar usuários no banco de dados SQLite, realizando operações **CRUD**.

---

### **Requisitos Funcionais**
- **Inserir Usuários**: Adicionar novos registros (nome e email).  
- **Listar Usuários**: Exibir os registros da tabela `usuarios`.  
- **Atualizar Usuários**: Atualizar dados existentes pelo **ID**.  
- **Excluir Usuários**: Deletar registros pelo **ID**.

---

### **Componentes e Métodos do Swing**

#### **Componentes Principais**
1. **JTextField**:  
   - Usado para **entrada de texto**: ID, Nome e Email.

2. **JButton**:  
   - Usado para criar os **botões de ação**:
     - **Inserir**  
     - **Atualizar**  
     - **Excluir**  
     - **Listar**

3. **JTable** (ou **JTextArea**):  
   - Exibe os dados listados da tabela **usuarios**.

---

### **Métodos Úteis no Swing**
Os seguintes métodos podem ser utilizados ao implementar a interface gráfica:

1. **Obter o texto de um JTextField**:
   ```java
   String nome = nomeTextField.getText();
   String email = emailTextField.getText();
   String idTexto = idTextField.getText();
   ```

2. **Converter String para int** (para o ID):  
   ```java
   int id = Integer.parseInt(idTexto);
   ```
   - **Explicação**: `getText()` retorna uma **String**, então usamos `Integer.parseInt()` para convertê-la em um número inteiro.
   - **Cuidados**: Adicione tratamento de erro caso o campo **ID** esteja vazio ou tenha texto inválido:
     ```java
     try {
         int id = Integer.parseInt(idTextField.getText());
     } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(null, "ID deve ser um número inteiro!");
     }
     ```

3. **Definir texto em um JTextField** (exemplo ao selecionar um item para atualizar):
   ```java
   nomeTextField.setText("Novo Nome");
   emailTextField.setText("novo@email.com");
   ```
---

### **Fluxo Geral**
1. **Botão Inserir**:
   - Capturar texto dos campos `nome` e `email` usando `getText()`.
   - Chamar o método **InserirUsuario.inserirUsuario()**.

2. **Botão Atualizar**:
   - Capturar `ID`, `nome` e `email` dos campos.  
   - Converter o campo **ID** usando `Integer.parseInt()` para um inteiro.  
   - Chamar o método **AtualizarUsuario.atualizarUsuario()**.

3. **Botão Excluir**:
   - Capturar o campo **ID**.
   - Converter para **int**.
   - Chamar o método **DeletarUsuario.deletarUsuario()**.

4. **Botão Listar**:
   - Chamar o método **ListarUsuarios.listarUsuarios()**.
   - Popular uma **JTextArea** ou exibir os dados no console.

---

### **Dicas Finais**
- Valide os campos antes de executar as operações.  
- Use `try-catch` para tratar erros, especialmente ao converter **String** para **int**.  
- Teste cada botão individualmente para garantir o funcionamento correto.


