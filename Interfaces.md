# Interfaces

Imagine que uma **interface** em programação é como um **contrato** ou **manual de instruções** que várias pessoas (ou classes) devem seguir para poderem "trabalhar" em um mesmo projeto.

Pense numa **banda de música**. Para que a banda toque uma música de forma harmoniosa, todos os músicos precisam seguir as mesmas **regras básicas**: 
saber o ritmo, a melodia e quando começar a tocar. 
Cada músico (que pode ser de instrumentos diferentes como violão, bateria, ou piano) segue essas regras, mas eles podem tocar de maneiras diferentes. 

Na programação, uma interface funciona assim:
- Ela define **o que** os músicos (ou classes) devem fazer (os métodos).
- Mas ela **não diz como** fazer (não fornece a implementação, apenas a assinatura do método).
  
Por exemplo, a interface "InstrumentoMusical" poderia ser assim:

```java
interface InstrumentoMusical {
    void tocar();    // Todo músico deve saber como "tocar".
    void afinar();   // Todo músico deve saber como "afinar" seu instrumento.
}
```

Agora, cada músico (classe) vai implementar sua própria maneira de tocar e afinar, mas **todos têm que seguir as regras** do contrato (interface).

#### Exemplo:
```java
// Interface: O contrato que todo instrumento musical deve seguir
interface InstrumentoMusical {
    void tocar();
    void afinar();
}

// Implementação do violão
class Violao implements InstrumentoMusical {
    @Override
    public void tocar() {
        System.out.println("O violão está tocando acordes.");
    }
    
    @Override
    public void afinar() {
        System.out.println("Afinando o violão.");
    }
}

// Implementação do piano
class Piano implements InstrumentoMusical {
    @Override
    public void tocar() {
        System.out.println("O piano está tocando uma melodia.");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando o piano.");
    }
}

public class Banda {
    public static void main(String[] args) {
        InstrumentoMusical violao = new Violao();
        InstrumentoMusical piano = new Piano();
        
        violao.afinar();  // Saída: Afinando o violão.
        piano.afinar();   // Saída: Afinando o piano.
        violao.tocar();   // Saída: O violão está tocando acordes.
        piano.tocar();    // Saída: O piano está tocando uma melodia.
    }
}
```

### Resumo:
- Uma interface é um conjunto de **regras** (métodos) que outras classes devem seguir.
- As classes que "assinam o contrato" precisam **implementar esses métodos**, mas podem fazer isso de forma diferente.
- É como garantir que todos os instrumentos da banda toquem no mesmo ritmo, mas cada um faz isso de maneira única!

---

### Exercício: Sistema de Pagamento

#### Objetivo
Criar um sistema simples que simule diferentes métodos de pagamento utilizando interfaces.

#### Instruções

1. **Criar a Interface `Pagamento`**
   - Defina uma interface chamada `Pagamento` que contém os seguintes métodos/funções:
     - `void processarPagamento(double valor);`
     - `String obterDetalhes();`

2. **Implementar as Classes de Pagamento**
   - Crie duas classes que implementam a interface `Pagamento`:
     - `CartaoCredito`: 
       - Adicione um **atributo** `numeroCartao` (String) e um `codigoSeguranca` (int).
       - Implemente os métodos da interface. Por exemplo:
         - `processarPagamento`: exiba uma mensagem como "Pagamento de R$ valor processado via Cartão de Crédito".
         - `obterDetalhes`: retorne os detalhes do cartão de crédito (mas não exiba o número completo do cartão, apenas os últimos 4 dígitos). Use numeroCartao.substring(numeroCartao.length() - 4) para isso.
           
     - `PayPal`: 
       - Adicione um atributo `email` (String).
       - Implemente os métodos da interface. Por exemplo:
         - `processarPagamento`: exiba uma mensagem como "Pagamento de R$ valor processado via PayPal".
         - `obterDetalhes`: retorne o email associado à conta do PayPal.

3. **Criar a Classe Principal**
   - Crie uma classe chamada `Main` com um método `main` para testar suas classes.
   - No método `main`, faça o seguinte:
     
     - Adicione instâncias de `CartaoCredito` e `PayPal` à lista.
     - Para cada pagamento, chame o método `processarPagamento` com um valor de sua escolha e, em seguida, chame `obterDetalhes` para exibir os detalhes do pagamento.


