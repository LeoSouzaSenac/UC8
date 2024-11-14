# Trabalho: Jogo de Aventuras em Java

## Objetivo

Desenvolver um mini-jogo de aventuras em Java, inspirado nos livros-jogos, utilizando conceitos de **herança**, **interface** e **orientação a objetos**. O jogo deve contar uma história interativa, onde o jogador faz escolhas e enfrenta desafios que impactam o desenrolar da trama.

## Descrição do Jogo

O jogo é ambientado em um mundo de fantasia, onde o jogador assume o papel de um personagem com uma classe específica. O jogador tomará decisões que o levarão a diferentes cenários e combates, utilizando um sistema de atributos e um mecanismo de rolagem de dados para ações e lutas. 

### Requisitos do Jogo

1. **Nome do Personagem**: O jogo deve começar perguntando ao jogador qual será o nome do personagem.
  
2. **Escolha da Classe**:
   - O jogador deve escolher uma entre três classes: **Guerreiro**, **Mago** ou **Arqueiro**.
   - Cada classe tem habilidades específicas e valores iniciais para os atributos **força**, **vida**, **mana** e **agilidade**:
     - **Força**: Representa o dano físico causado.
     - **Vida**: Determina quanto dano o personagem pode suportar.
     - **Mana**: Controla quantas magias o personagem pode lançar.
     - **Agilidade**: Influencia a chance de acerto dos ataques e pode permitir feitos ágeis durante a aventura.

3. **Atributos por Rolagem de Dados**:
   - Os valores dos atributos devem ser determinados pela rolagem de dados, com cada classe ganhando um número diferente de dados para cada atributo.
   - O jogador deverá escolher a opção "Rolar Dados" sempre que for necessário definir ou verificar atributos.

4. **Sistema de Combate**:
   - Quando o personagem encontra um monstro, uma batalha começa.
   - Durante a batalha, o jogador terá um menu de ações com opções para **atacar**, **lançar magia**, **usar item** ou **fugir**.
   - O monstro apenas ataca (sempre).
   - Após a batalha, o jogo continua com novas escolhas para avançar na história.

5. **Interface de Dados**:
   - Crie uma interface chamada `Personagem` com os métodos necessários para definir e manipular as ações e atributos dos personagens.
   - Toda classe de personagem (Guerreiro, Mago, Arqueiro) deve implementar essa interface em seu próprio arquivo Java, com métodos específicos para ataque, uso de habilidades, itens e fuga.

6. **Classe de Dados**:
   - Implemente uma classe chamada `Dados` para gerenciar as rolagens de dados em momentos essenciais do jogo.
   - Sempre que os dados forem necessários, o jogador deve ver a opção "Rolar Dados" no menu.

7. **Escolhas e História**:
   - O jogo deve apresentar uma narrativa com escolhas que impactam o progresso do personagem, semelhante aos livros-jogos.
   - Cada cenário deve oferecer pelo menos duas opções ao jogador (exemplo: "Você está em uma encruzilhada. Deseja ir para: 1) Esquerda 2) Direita"), levando a caminhos e resultados diferentes.

---

## Estrutura do Projeto

- O projeto deve incluir classes separadas para cada tipo de personagem, uma interface `Personagem` para definir as habilidades, e a classe `Dados` para simular rolagem de dados.
- O jogo deve ser executado no console, com uma interface de menu para facilitar as escolhas do jogador e a rolagem de dados.

## Entrega

- Organize seu código em um projeto Java, com cada classe em seu próprio arquivo.
- Certifique-se de que o jogo permite ao jogador navegar pela história, participar de batalhas e utilizar todos os atributos e habilidades de forma interativa.

---

**Boa sorte e boa aventura!**
