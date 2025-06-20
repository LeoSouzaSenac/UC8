### 🧙‍♂️ Exercício **Simulador do Chapéu Seletor de Hogwarts**

### **Descrição:**

Você foi encarregado de desenvolver uma aplicação de desktop em **Java Swing** que simula a cerimônia de seleção dos alunos para as casas de **Hogwarts**, utilizando uma interface gráfica com **JTable**.

A aplicação terá uma lista de alunos recém-chegados à escola e um botão para o Chapéu Seletor atribuir automaticamente uma casa a cada aluno com base em características ou aleatoriedade.

---

### **Objetivo:**

Criar um sistema em Java Swing que utilize **JTables** para exibir e organizar os alunos **ainda não selecionados** e os alunos **já alocados em suas casas**: **Grifinória**, **Sonserina**, **Corvinal** e **Lufa-Lufa**.

---

### **Funcionalidades do Sistema:**

1. **Lista de Alunos a Serem Selecionados:**

   * Cada aluno tem:

     * **Nome**
     * **Personalidade** (por exemplo: Corajoso, Astuto, Leal, Inteligente)

2. **Tabela de Alunos Selecionados:**

   * Após o uso do chapéu seletor, o aluno é movido da lista de espera para a tabela de sua casa correspondente.
   * A interface exibe os alunos de cada casa em **JTables separadas**.

3. **Seleção Manual**

   * O usuário pode:

     * Selecionar um aluno e clicar em "Selecionar Casa" para que o chapéu decida a casa automaticamente com base na personalidade.
    

4. **Remoção de Alunos:**

   * Possibilidade de remover um aluno da casa, devolvendo-o para a lista inicial de espera.

---

### **Requisitos:**

1. **Classe Aluno:**

   ```java
   public class Aluno {
       private String nome;
       private String personalidade; // Ex: Corajoso, Astuto, Leal, Inteligente

       // Construtor, getters e setters
   }
   ```

2. **Interface Gráfica (Swing):**

   * **JTable** para exibir:

     * Alunos não selecionados.
     * Alunos de cada casa.
   * Botões:

     * “Selecionar Casa”
     * “Remover da Casa”
   * Label informando quantos alunos estão em cada casa.

3. **Regra de Distribuição (opcional):**

   * Corajoso → Grifinória
   * Astuto → Sonserina
   * Leal → Lufa-Lufa
   * Inteligente → Corvinal
   

---

### **Fluxo do Usuário:**

1. O programa exibe a lista inicial de alunos não alocados em uma **JTable**.
2. O usuário seleciona um aluno e clica em "Selecionar Casa".

   * O aluno é movido para a **JTable** da casa correspondente.
3. O usuário pode selecionar alunos em uma das casas e clicar em "Remover da Casa" para retorná-los à lista de espera.

---

Botões:

* \[Selecionar Casa]
* \[Remover da Casa]
