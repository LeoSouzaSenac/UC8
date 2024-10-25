# Arrays em Java

## O que é um Array?

Um array é uma estrutura de dados que permite armazenar múltiplos valores do mesmo tipo em uma única variável. Em Java, os arrays são objetos e podem ser de qualquer tipo de dado, como inteiros, strings, ou objetos personalizados.

## Criando um Array

Para criar um array em Java, você deve declarar o tipo do array seguido de colchetes. Veja a sintaxe básica:

```java
tipo[] nomeDoArray;
```

### Exemplo:

```java
int[] numeros; // Declaração de um array de inteiros
```

## Inicializando um Array

Você pode inicializar um array de duas maneiras:

1. **Usando o operador `new`:**

```java
numeros = new int[5]; // Cria um array de inteiros com 5 elementos
```

2. **Usando uma lista de valores:**

```java
int[] numeros = {1, 2, 3, 4, 5}; // Inicializa o array com valores
```

## Acessando Elementos do Array

Os elementos do array podem ser acessados usando o índice. O índice em Java começa em 0. Por exemplo:

```java
int primeiroNumero = numeros[0]; // Acessa o primeiro elemento do array
int segundoNumero = numeros[1]; // Acessa o segundo elemento do array
```

## Modificando Elementos do Array

Você pode modificar um elemento do array atribuindo um novo valor ao índice correspondente:

```java
numeros[0] = 10; // Altera o primeiro elemento para 10
```

## Comprimento do Array

O comprimento de um array pode ser obtido usando a propriedade `length`:

```java
int tamanho = numeros.length; // Obtém o comprimento do array
```

## Iterando sobre um Array

Para percorrer todos os elementos de um array, você pode usar um loop `for`:

```java
for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros[i]); // Imprime cada elemento do array
}
```

### Usando o Loop `for-each`

Outra maneira de iterar sobre um array é usando o loop `for-each`:

```java
for (int numero : numeros) {
    System.out.println(numero); // Imprime cada elemento do array
}
```

## Exemplo Completo

Aqui está um exemplo completo que demonstra a criação, modificação e iteração de um array:

```java
public class ExemploArray {
    public static void main(String[] args) {
        // Criação e inicialização do array
        int[] numeros = {1, 2, 3, 4, 5};

        // Modificando um elemento
        numeros[2] = 10; // O terceiro elemento agora é 10

        // Imprimindo o comprimento do array
        System.out.println("Comprimento do array: " + numeros.length);

        // Iterando sobre o array
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
```

## Adicionando e Removendo Itens de um Array

Os arrays têm um tamanho fixo após a sua criação, o que significa que você não pode adicionar ou remover elementos diretamente de um array existente. Para adicionar ou remover elementos, você deve criar um novo array e copiar os elementos desejados. No entanto, uma maneira mais eficiente de lidar com a adição e remoção de itens é usar a classe `ArrayList`.

### Usando Arrays e Reatribuição

#### Adicionando Elementos

Para adicionar um elemento, você pode criar um novo array com um tamanho maior e copiar os elementos existentes:

```java
public class AdicionarElemento {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3}; // Array original
        int novoNumero = 4; // Número a ser adicionado

        // Criar um novo array com um tamanho maior
        int[] novoArray = new int[numeros.length + 1];

        // Copiar elementos existentes
        for (int i = 0; i < numeros.length; i++) {
            novoArray[i] = numeros[i];
        }

        // Adicionar o novo elemento
        novoArray[numeros.length] = novoNumero;

        // Atualizar a referência do array
        numeros = novoArray;

        // Imprimir o novo array
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
```

#### Removendo Elementos

Para remover um elemento, você pode criar um novo array com um tamanho menor e copiar os elementos, excluindo o que você deseja remover:

```java
public class RemoverElemento {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4}; // Array original
        int indiceParaRemover = 2; // Índice do elemento a ser removido

        // Criar um novo array com um tamanho menor
        int[] novoArray = new int[numeros.length - 1];

        // Copiar elementos, excluindo o desejado
        for (int i = 0, j = 0; i < numeros.length; i++) {
            if (i != indiceParaRemover) {
                novoArray[j++] = numeros[i];
            }
        }

        // Atualizar a referência do array
        numeros = novoArray;

        // Imprimir o novo array
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
```

### Usando `ArrayList`

Uma abordagem mais comum e prática para manipulação dinâmica de arrays em Java é o uso da classe `ArrayList`, que faz parte da coleção do Java. `ArrayList` permite adicionar, remover e acessar elementos de maneira mais flexível.

#### Adicionando Elementos

```java
import java.util.ArrayList;

public class AdicionarComArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(); // Criar um ArrayList

        // Adicionar elementos
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        // Imprimir o ArrayList
        System.out.println(numeros);
    }
}
```

#### Removendo Elementos

```java
import java.util.ArrayList;

public class RemoverComArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(); // Criar um ArrayList

        // Adicionar elementos
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        // Remover um elemento pelo índice
        numeros.remove(2); // Remove o elemento no índice 2

        // Imprimir o ArrayList
        System.out.println(numeros);
    }
}



## Exercício
### Usando Java e Scanner, elabore um sistema simples de compras (com uma classe abstrata produtos e pelo menos 5 subclasses de tipos de produtos diferentes).
Para fazer as compras, deve haver um menu com switch, onde você deve poder adicionar e remover itens do carrinho e fazer o pagamento.
