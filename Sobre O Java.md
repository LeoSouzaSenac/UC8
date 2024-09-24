# Introdução ao Java

## O que é o Java?

Java é uma linguagem de programação **orientada a objetos** e uma **plataforma** de desenvolvimento criada pela Sun Microsystems (agora pertencente à Oracle). Foi lançada em 1995 com o objetivo de ser uma linguagem **simples, robusta e de uso geral**. Java é uma das linguagens mais populares do mundo, utilizada para o desenvolvimento de aplicativos desktop, web, mobile e até mesmo sistemas embarcados.

## Surgimento e Origem do Nome

Java foi criada por uma equipe de engenheiros da Sun Microsystems, liderada por James Gosling. Inicialmente, o projeto tinha o codinome *"Oak"*, mas posteriormente foi renomeado para *"Java"* em referência ao café Java, pois a equipe de desenvolvedores costumava consumir muito café enquanto trabalhava no projeto.

## Para que Serve o Java?

Java é uma linguagem **multiplataforma**, o que significa que você pode escrever seu código uma vez e executá-lo em qualquer sistema operacional que tenha uma Máquina Virtual Java (JVM). Essa característica se popularizou com o slogan **"Write Once, Run Anywhere"**.

### Tipos de Desenvolvimento com Java

1. **Desenvolvimento Desktop:**
   - Java é amplamente utilizado para criar **aplicativos de desktop** com interfaces gráficas. A biblioteca **Swing** e o **JavaFX** são populares para esse tipo de aplicação.
   
2. **Desenvolvimento Web:**
   - Java é muito forte no desenvolvimento de **aplicações web**, principalmente com frameworks como **Spring** e **Java EE (Jakarta EE)**. Muitos sistemas empresariais de grande porte usam Java no back-end.
   
3. **Desenvolvimento Mobile:**
   - Java também é usado no desenvolvimento de **aplicativos Android**, sendo a principal linguagem até a chegada do Kotlin.
   
4. **Sistemas Embarcados:**
   - Java é utilizado em dispositivos como smartcards, sistemas embarcados e até em eletrodomésticos, por ser leve e seguro.

## Conceitos Básicos do Java

Como seus alunos já conhecem JavaScript e TypeScript, eles encontrarão algumas semelhanças com o Java, mas também diferenças importantes. Aqui estão os conceitos essenciais do Java.

### 1. **Sintaxe Básica**

A sintaxe do Java é parecida com JavaScript e TypeScript, mas Java é uma **linguagem fortemente tipada**. Isso significa que você precisa declarar o tipo das variáveis de maneira explícita.

Exemplo de código simples em Java:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

Explicando o código:
- `public class HelloWorld`: Declara uma classe pública chamada `HelloWorld`. Em Java, tudo é organizado dentro de classes.
- `public static void main(String[] args)`: Este é o ponto de entrada do programa. Todo programa Java que executa diretamente precisa de um método `main` com essa assinatura.
- `System.out.println("Hello, World!");`: Exibe a mensagem "Hello, World!" no console.

### 2. **Orientação a Objetos**

Java é uma linguagem **100% orientada a objetos**. Isso significa que tudo no Java é baseado em **objetos** e **classes**. Aqui estão alguns conceitos importantes:

- **Classe**: Define o modelo de um objeto (similar a uma `class` no TypeScript).
  
  ```java
  class Pessoa {
      String nome;
      int idade;

      public void apresentar() {
          System.out.println("Meu nome é " + nome + " e tenho " + idade + " anos.");
      }
  }
  ```

- **Objeto**: É uma instância de uma classe.
  
  ```java
  Pessoa pessoa1 = new Pessoa();
  pessoa1.nome = "João";
  pessoa1.idade = 25;
  pessoa1.apresentar();  // Saída: "Meu nome é João e tenho 25 anos."
  ```

### 3. **Tipos de Dados**

Java, diferente de JavaScript e TypeScript, requer que você declare o **tipo** das variáveis de forma explícita. Alguns tipos comuns são:

- **int**: Números inteiros.
- **double**: Números de ponto flutuante.
- **boolean**: Verdadeiro ou falso.
- **String**: Cadeia de caracteres.

Exemplo:

```java
int idade = 30;
double altura = 1.75;
boolean estudante = true;
String nome = "Maria";
```

### 4. **Controle de Fluxo**

Em Java, o controle de fluxo é muito parecido com JavaScript e TypeScript. Você pode usar `if`, `else`, `for`, `while`, etc.

Exemplo de `if`:

```java
if (idade > 18) {
    System.out.println("Você é maior de idade.");
} else {
    System.out.println("Você é menor de idade.");
}
```

### 5. **Métodos**

Métodos em Java são como funções em JavaScript/TypeScript, mas sempre pertencem a uma classe. Eles são definidos com um tipo de retorno e podem receber parâmetros.

```java
public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }
}
```

### 6. **Herança e Polimorfismo**

Assim como no TypeScript, Java suporta **herança**, permitindo que uma classe herde as características de outra.

Exemplo:

```java
class Animal {
    public void fazerSom() {
        System.out.println("O animal faz um som.");
    }
}

class Cachorro extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("O cachorro late.");
    }
}
```

Aqui, `Cachorro` herda da classe `Animal`, mas sobrescreve o método `fazerSom`.

### 7. **Tratamento de Exceções**

Java tem um sistema robusto para lidar com erros através de **exceções**.

Exemplo de tratamento de exceção:

```java
try {
    int resultado = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Erro: Divisão por zero.");
}
```

### 8. **Pacotes (Packages)**

Java organiza classes em **pacotes** (similares aos módulos no TypeScript). Isso ajuda a manter o código organizado.

```java
package com.exemplo;

public class MinhaClasse {
    // código aqui
}
```

---

## Conclusão

Java é uma linguagem poderosa e flexível, ideal para o desenvolvimento de uma ampla gama de aplicações. Embora tenha algumas diferenças em relação ao JavaScript e ao TypeScript, muitos conceitos como controle de fluxo, objetos e herança são semelhantes. A prática será essencial para se familiarizar com a sintaxe e os paradigmas de Java, e em breve vocês estarão confortáveis escrevendo seus próprios programas!

---
