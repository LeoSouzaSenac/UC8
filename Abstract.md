# Classes Abstratas

## O que são Classes Abstratas?

Classes abstratas em programação são como **modelos** que definem um conjunto de características e comportamentos, mas não podem ser instanciadas diretamente. Elas servem como uma base para outras classes que precisam herdar suas propriedades e métodos.

Pense em uma **fábrica de móveis**. A fábrica pode ter uma classe abstrata chamada `Mobília`, que define características comuns a todos os móveis, como cor, material e métodos como `montar()` e `desmontar()`. No entanto, você não pode criar um objeto da classe `Mobília` diretamente, pois ela não é um móvel específico. Em vez disso, você cria classes concretas, como `Sofa` e `Mesa`, que herdam de `Mobília` e implementam suas particularidades.

### Exemplo de Classe Abstrata

```java
// Classe abstrata
abstract class Mobilia {
    protected String cor;
    protected String material;

    // Construtor
    public Mobilia(String cor, String material) {
        this.cor = cor;
        this.material = material;
    }

    // Método abstrato (sem implementação)
    public abstract void montar();

    // Método concreto (com implementação)
    public void desmontar() {
        System.out.println("Desmontando a mobília.");
    }
}

// Classe concreta que herda de Mobilia
class Sofa extends Mobilia {
    public Sofa(String cor, String material) {
        super(cor, material);
    }

    @Override
    public void montar() {
        System.out.println("Montando o sofá de cor " + cor + " feito de " + material + ".");
    }
}

// Classe concreta que herda de Mobilia
class Mesa extends Mobilia {
    public Mesa(String cor, String material) {
        super(cor, material);
    }

    @Override
    public void montar() {
        System.out.println("Montando a mesa de cor " + cor + " feita de " + material + ".");
    }
}

public class FábricaDeMóveis {
    public static void main(String[] args) {
        Mobilia sofa = new Sofa("azul", "madeira");
        Mobilia mesa = new Mesa("preta", "metal");

        sofa.montar();  // Saída: Montando o sofá de cor azul feito de madeira.
        mesa.montar();  // Saída: Montando a mesa de cor preta feita de metal.
        sofa.desmontar(); // Saída: Desmontando a mobília.
    }
}
```

### Diferenças entre Classes Abstratas e Interfaces

| Característica             | Classes Abstratas                      | Interfaces                          |
|----------------------------|----------------------------------------|-------------------------------------|
| Instanciação               | Não podem ser instanciadas             | Não podem ser instanciadas          |
| Métodos Abstratos          | Podem ter métodos abstratos e concretos | Apenas métodos abstratos            |
| Herança                    | Uma classe pode herdar apenas uma classe abstrata | Uma classe pode implementar várias interfaces |
| Atributos                  | Podem ter atributos                    | Não podem ter atributos              |
| Visibilidade dos Métodos   | Métodos podem ter diferentes modificadores de acesso (public, protected, private) | Todos os métodos são implicitamente public |

### Resumo

- Uma **classe abstrata** é uma classe que não pode ser instanciada diretamente e pode conter métodos abstratos e concretos.
- Uma **interface** define um contrato que as classes devem seguir, contendo apenas a assinatura dos métodos.
- Classes podem herdar de uma única classe abstrata, mas podem implementar várias interfaces.

---

## Exercício: Sistema de Transporte

### Objetivo
Criar um sistema simples que simule diferentes tipos de transporte utilizando classes abstratas.

### Instruções

1. **Criar a Classe Abstrata `Transporte`**
   - Defina uma classe abstrata chamada `Transporte` que contém:
     - Um atributo `capacidade` (int).
     - Um método abstrato `transportar(int passageiros)`.

2. **Implementar as Classes de Transporte**
   - Crie duas classes que herdam de `Transporte`:
     - `Onibus`: 
       - Implemente o método `transportar`, exibindo uma mensagem como "O ônibus transportou X passageiros".
     - `Bicicleta`: 
       - Implemente o método `transportar`, exibindo uma mensagem como "A bicicleta transportou X passageiros".

3. **Criar a Classe Principal**
   - Crie uma classe chamada `Main` com um método `main` para testar suas classes.
   - No método `main`, crie instâncias de `Onibus` e `Bicicleta`, e chame o método `transportar` com um número de passageiros.

### Exemplo de Implementação

```java
// Classe abstrata Transporte
abstract class Transporte {
    protected int capacidade;

    public Transporte(int capacidade) {
        this.capacidade = capacidade;
    }

    public abstract void transportar(int passageiros);
}

// Classe Onibus
class Onibus extends Transporte {
    public Onibus(int capacidade) {
        super(capacidade);
    }

    @Override
    public void transportar(int passageiros) {
        System.out.println("O ônibus transportou " + passageiros + " passageiros.");
    }
}

// Classe Bicicleta
class Bicicleta extends Transporte {
    public Bicicleta(int capacidade) {
        super(capacidade);
    }

    @Override
    public void transportar(int passageiros) {
        System.out.println("A bicicleta transportou " + passageiros + " passageiros.");
    }
}

// Classe principal
public class Main {
    public static void main(String[] args) {
        Transporte onibus = new Onibus(50);
        Transporte bicicleta = new Bicicleta(2);

        onibus.transportar(30);  // Saída: O ônibus transportou 30 passageiros.
        bicicleta.transportar(1); // Saída: A bicicleta transportou 1 passageiros.
    }
}
```
