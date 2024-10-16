# Aula de Classes em Java

## 1. O que é uma Classe?

Uma classe é a estrutura que define os atributos (variáveis) e comportamentos (métodos) de um objeto. Em termos simples, uma classe é como um molde para criar objetos.

## 2. Construtor

O **construtor** é um método especial da classe que é chamado quando criamos um novo objeto. Ele é utilizado para inicializar os atributos do objeto.

### Estrutura de uma Classe

```java
public class NomeDaClasse {
    // Atributos
    private TipoDoAtributo nomeDoAtributo;

    // Construtor
    public NomeDaClasse(TipoDoAtributo nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    // Métodos
    public void metodoExemplo() {
        System.out.println("Este é um método de exemplo.");
    }
}
```

## 3. Exemplo de Classes

Vamos criar três classes: `Pessoa`, `Carro`, e `Animal`.

### 3.1. Arquivo `Pessoa.java`

```java
public class Pessoa {
    private String nome;
    private int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos
    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}
```

### 3.2. Arquivo `Carro.java`

```java
public class Carro {
    private String modelo;
    private int ano;

    // Construtor
    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    // Métodos
    public void exibirDetalhes() {
        System.out.println("Modelo: " + modelo + ", Ano: " + ano);
    }
}
```

### 3.3. Arquivo `Animal.java`

```java
public class Animal {
    private String tipo;
    private int idade;

    // Construtor
    public Animal(String tipo, int idade) {
        this.tipo = tipo;
        this.idade = idade;
    }

    // Métodos
    public void fazerSom() {
        System.out.println("O " + tipo + " está fazendo som.");
    }
}
```

## 4. Usando as Classes no Arquivo `App.java`

Agora, vamos utilizar as classes `Pessoa`, `Carro` e `Animal` no arquivo principal `App.java`, que contém o método `main`.

### 4.1. Arquivo `App.java`

```java
public class App {
    public static void main(String[] args) {
        // Criando objetos de Pessoa, Carro e Animal
        Pessoa pessoa = new Pessoa("Carlos", 30);
        Carro carro = new Carro("Civic", 2020);
        Animal animal = new Animal("Cachorro", 5);

        // Chamando métodos
        pessoa.apresentar();
        carro.exibirDetalhes();
        animal.fazerSom();
    }
}
```

## 5. Exercícios

### Exercício 1: Criar a Classe `Livro`
Crie uma classe `Livro` com os seguintes atributos: `titulo`, `autor`, e `paginas`. Crie um método para exibir as informações do livro. Utilize a classe no `App.java` para instanciar um objeto de `Livro` e exibir suas informações.

### Exercício 2: Criar a Classe `Aluno`
Crie uma classe `Aluno` com os atributos `nome`, `matricula`, e `curso`. Crie um método para mostrar os dados do aluno. Instancie um objeto no `App.java` e exiba suas informações.

### Exercício 3: Criar a Classe `Produto`
Crie uma classe `Produto` com os atributos `nome`, `preco`, e `quantidade`. Crie um método para calcular o valor total em estoque (preço * quantidade). No `App.java`, instancie um objeto de `Produto` e exiba o valor total em estoque.
