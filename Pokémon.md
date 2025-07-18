### Exercício de Java com Swing: Gerenciador de Pokémons

### **Descrição:**
Você foi designado para criar uma aplicação de desktop utilizando **Java Swing** que simula um sistema de gerenciamento de Pokémons. O objetivo é implementar um programa que permita ao treinador organizar sua mochila com até 6 Pokémons e visualizar os Pokémons disponíveis em diferentes categorias.

### **Objetivo:**
Criar uma interface gráfica com Java Swing para gerenciar os Pokémons disponíveis no "computador" e os Pokémons que o treinador carrega em sua mochila.

### **Funcionalidades do Sistema:**

1. **Adicionar Pokémon à Mochila do Treinador:**
   - O treinador poderá adicionar Pokémons da lista de disponíveis para sua mochila.
   - Cada Pokémon será representado por um objeto com **nome**, **tipo**, e **nível**.
   - O treinador pode carregar no máximo **6 Pokémons** em sua mochila.

2. **Remover Pokémon da Mochila:**
   - O treinador poderá remover um Pokémon da mochila para liberar espaço.



---

### **Requisitos:**

1. **Computador**
   - O computador é uma lista com vários pokémons. Cada pokémon é um objeto da classe Pokémon, e tem as seguintes propriedades:
     - **Nome:** Nome do Pokémon (ex.: Pikachu, Charmander).
     - **Tipo:** Tipo do Pokémon (ex.: Elétrico, Fogo).
     - **Nível:** Nível inicial do Pokémon.

2. **Interface Gráfica:**
   - Criar uma interface gráfica amigável utilizando **Java Swing**.
   - O programa deve conter botões, menus, e exibir informações dos Pokémons em **JLists**.

3. **Menu Principal:**
   - O menu principal deverá conter as seguintes opções:
     1. **Adicionar Pokémon à Mochila**
     2. **Remover Pokémon da Mochila**

4. **Limitações:**
   - A mochila do treinador não pode conter mais de 6 Pokémons.
   - Ao remover um Pokémon da mochila, ele volta a estar disponível na lista geral.


---

### **Exemplo de Fluxo de Uso:**

1. **Adicionar Pokémon à Mochila:**
   - O treinador clica na opção "Adicionar Pokémon".
   - A lista de Pokémons disponíveis é exibida.
   - O treinador seleciona um Pokémon para adicionar (respeitando o limite de 6 Pokémons).

2. **Visualizar Mochila (não precisa de botões, ocorre de forma automática ao adicionar ou remover pokemóns)**
   - Exibe uma lista dos Pokémons que estão atualmente na mochila com informações detalhadas (nome, tipo, nível).

3. **Remover Pokémon da Mochila:**
   - Exibe uma lista dos Pokémons na mochila.
   - O treinador seleciona um Pokémon para remover.
