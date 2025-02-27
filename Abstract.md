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


**Exercício: Clãs de Konoha (Naruto)**

Neste exercício, você vai criar um sistema que representa os clãs de Konoha usando classes abstratas em Java. Cada clã terá suas características e especialidades, mas todos herdarão de uma classe abstrata base chamada `Cla`.

### Requisitos:

1. Crie uma **classe abstrata** chamada `Cla` com os seguintes atributos e métodos:
   - Atributos:
     - `String nomeDoCla`: nome do clã.
     - `String lider`: nome do líder atual do clã.
   - Métodos:
     - `public abstract void habilidadeEspecial()`: método abstrato que descreve a habilidade especial de cada clã.
     - `public void exibirDetalhes()`: método concreto que exibe o nome do clã e o nome do líder.

2. Crie as subclasses que herdam de `Cla`, representando diferentes clãs de Konoha:
   - `ClaUchiha`: Implementa o método `habilidadeEspecial()`, que descreve o *Sharingan* como sua habilidade especial. Seu líder atual é Sasuke.
   - `ClaHyuuga`: Implementa o método `habilidadeEspecial()`, que descreve o *Byakugan* como sua habilidade especial. Seu líder atual é Hiashi.
   - `ClaNara`: Implementa o método `habilidadeEspecial()`, que descreve a manipulação de sombras como sua habilidade especial. Seu líder atual é Shikamaru.
   - `ClaAkimichi`: Implementa o método `habilidadeEspecial()`, que descreve a ampliação corporal como sua habilidade especial. Seu líder atual é Chouza.

3. Crie uma classe principal chamada `Konoha` que contenha o método `main`, onde você:
   - Crie instâncias de cada clã (`ClaUchiha`, `ClaHyuga`, `ClaNara`, `ClaAkimichi`).
   - Chame os métodos `habilidadeEspecial()` e `exibirDetalhes()` para cada clã.

### Tarefas Adicionais:
- Adicione mais clãs com suas habilidades especiais.
- Crie um método adicional em `Cla` chamado `ataqueEspecial()` que cada clã pode personalizar para descrever um ataque exclusivo.
