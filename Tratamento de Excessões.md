# Tratamento de Exceções em Java

## O que é uma exceção?
Em Java, uma **exceção** é um evento inesperado que ocorre durante a execução do programa e interrompe seu fluxo normal. 
Por exemplo, imagine que você escreveu um código e, de repente, ele gera um erro, mas você não sabe exatamente o que causou esse problema. 
Um código pode exibir um erro por inúmeros motivos (como dados de entrada inválidos - o usuário inseriu um número quando deveria ser uma palavra - ou tentou acessar um elemento que não existe em uma lista - por exemplo, um índice que não existe, ou mesmo falhas para se conectar com um banco de dados) 
e não temos como tratar todos estes erros possíveis apenas com um if/else, pois para isso teríamos que antecipar TODOS os problemas possíveis, o que não é lá muito intuitivo e seria bem trabalhoso de fazer, concorda? Para isso, existe o tratamento de excessões.
As exceções podem ser causadas por diversos motivos, como entrada de dados inválida, tentativas de acessar elementos inexistentes em uma lista ou erros de conexão com um banco de dados.

## Por que usar tratamento de exceções?
Ao invés de simplesmente usar **if** para verificar erros, Java permite usar um mecanismo mais eficiente: o **tratamento de exceções**. Algumas vantagens de usar exceções são:

- **Melhor organização do código**: O código fica mais limpo e legível, separando a lógica normal do programa dos casos de erro.
- **Reutilização**: Métodos podem tratar exceções sem precisar sempre verificar cada possibilidade de erro com **if**.
- **Recuperação de erros**: O programa pode lidar com erros sem simplesmente travar, mostrando mensagens amigáveis ao usuário ou tentando outra abordagem.

## Como tratar exceções em Java
Em Java, o tratamento de exceções é feito usando os blocos **try**, **catch**, **finally** e **throw**.

### 1. Bloco `try` e `catch`
O bloco `try` contém o código que pode gerar uma exceção. O bloco `catch` é responsável por capturar e tratar essa exceção.

```java
public class ExemploTryCatch {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0; // Isso gera uma exceção: divisão por zero
        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é possível dividir por zero!");
        }
    }
}
```

### 2. Bloco `finally`
O bloco `finally` é opcional e é usado para executar código que deve rodar independentemente de uma exceção ter ocorrido ou não. Isso é útil, por exemplo, para fechar conexões com banco de dados ou liberar recursos.

```java
public class ExemploFinally {
    public static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]); // Erro: índice fora do limite
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Tentativa de acessar índice inválido!");
        } finally {
            System.out.println("Este bloco sempre será executado.");
        }
    }
}
```

### 3. Lançando exceções com `throw`
Se quisermos forçar uma exceção personalizada, podemos usar `throw`.

```java
public class ExemploThrow {
    static void verificarIdade(int idade) {
        if (idade < 18) {
            throw new IllegalArgumentException("A idade deve ser maior ou igual a 18!");
        }
        System.out.println("Acesso permitido.");
    }

    public static void main(String[] args) {
        verificarIdade(16); // Vai lançar uma exceção
    }
}
```

## Tipos de Exceções
As exceções em Java podem ser divididas em **verificadas (checked)** e **não verificadas (unchecked)**.

### 1. **Exceções Verificadas (Checked Exceptions)**

São aquelas que você é obrigado a tratar. Ou seja, quando você escreve um código que pode gerar esse tipo de exceção, você tem **que** informar ao compilador o que fazer se esse erro acontecer, ou então seu código não vai funcionar.

Essas exceções são **mais previsíveis** e geralmente ocorrem por situações que você consegue antecipar, como **problemas ao ler um arquivo** ou **erro de conexão com o banco de dados**.

- **Como lidar:** Você deve capturá-las com um bloco `try-catch` ou então **declarar que o método pode lançar essa exceção** com a palavra-chave `throws`.
- **Exemplo de exceção verificada:** `IOException`, `SQLException`.

**Exemplo de código com exceção verificada:**

```java
import java.io.*;

public class ExemploChecked {
    public static void main(String[] args) {
        try {
            // O código abaixo pode lançar uma IOException, então precisa ser tratado
            FileReader arquivo = new FileReader("arquivo.txt");
        } catch (IOException e) {
            System.out.println("Erro ao tentar abrir o arquivo: " + e.getMessage());
        }
    }
}
```

Neste exemplo, **IOException** é uma exceção verificada, e precisamos tratá-la para que o código funcione corretamente.

### 2. **Exceções Não Verificadas (Unchecked Exceptions)**

Essas exceções são **menos previsíveis** e ocorrem **por erros de programação**, como tentar acessar um índice que não existe em um array ou tentar dividir por zero.

O compilador **não obriga** você a tratá-las, mas é recomendado que você o faça. Elas geralmente indicam que algo deu errado no seu código de uma forma que não poderia ser facilmente antecipada.

- **Como lidar:** Embora você não precise tratá-las obrigatoriamente, é uma boa prática tentar evitar que elas aconteçam com verificações no seu código.
- **Exemplo de exceção não verificada:** `NullPointerException`, `ArrayIndexOutOfBoundsException`, `ArithmeticException`.

**Exemplo de código com exceção não verificada:**

```java
public class ExemploUnchecked {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3};
        
        // Aqui, tentamos acessar um índice que não existe no array, causando uma ArrayIndexOutOfBoundsException
        System.out.println(numeros[5]);  // Lança ArrayIndexOutOfBoundsException
    }
}
```

Neste caso, a **ArrayIndexOutOfBoundsException** é uma exceção não verificada. Não precisamos obrigatoriamente tratá-la, mas podemos prever esse erro antes de tentar acessar índices inválidos no array.

### Resumo simples:

- **Exceções verificadas:** O compilador obriga você a tratar (geralmente erros previsíveis, como problemas ao acessar arquivos ou redes).
- **Exceções não verificadas:** Não há obrigatoriedade de tratamento (geralmente erros de lógica, como divisão por zero ou índice de array fora do limite).

**Exemplo prático:**
- **Exceção verificada**: Tentativa de abrir um arquivo que não existe. (Você precisa avisar o compilador que está lidando com isso.)
- **Exceção não verificada**: Tentativa de dividir um número por zero. (Erro de lógica no seu código, não é algo que o compilador obrigue a tratar.)


## Quando usar exceções em vez de `if`?
Nem sempre devemos substituir um `if` por tratamento de exceções. A escolha depende da situação:

✅ **Use `if` para validações previsíveis**:
- Se um campo do formulário está vazio.
- Se um número é negativo antes de uma operação.

✅ **Use exceções para erros inesperados**:
- Falha na leitura de um arquivo.
- Falha na conexão com o banco de dados.
- Divisão por zero em uma operação matemática.

Exemplo de uso incorreto de exceções:
```java
// Errado: exceção usada como controle de fluxo
try {
    int[] numeros = new int[5];
    System.out.println(numeros[10]);
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Índice inválido!");
}
```

Em vez disso, use um **if** para prevenir o erro:
```java
if (indice >= 0 && indice < numeros.length) {
    System.out.println(numeros[indice]);
} else {
    System.out.println("Índice inválido!");
}
```

## Conclusão
O tratamento de exceções é essencial para construir programas robustos e confiáveis. Ele deve ser usado para lidar com situações inesperadas, enquanto `if` deve ser usado para verificar condições normais do código. 


## Exercícios:

### 1. **Exceção de Divisão por Zero**
- **Objetivo:** Criar um programa que pede ao usuário dois números e faz uma divisão. Se o usuário tentar dividir por zero, o programa deve mostrar uma mensagem de erro.
  
**Instruções:**
- Peça dois números inteiros ao usuário.
- Realize a divisão e trate a exceção de divisão por zero.
  
---

### 2. **Acesso a Índice Inválido**
- **Objetivo:** Criar um programa que tenta acessar um índice em um array e trata a exceção caso o índice esteja fora do limite do array.

**Instruções:**
- Crie um array com 3 números.
- Tente acessar um índice fora do tamanho do array (por exemplo, 5) e trate a exceção.

---

### 3. **Verificação de Idade**
- **Objetivo:** Criar um programa que verifica a idade de uma pessoa. Se a idade for menor que 18, o programa deve lançar uma exceção personalizada.

**Instruções:**
- Crie um método que verifica se a idade é maior ou igual a 18.
- Se for menor, lance uma exceção personalizada com a mensagem "A idade deve ser maior ou igual a 18!".





