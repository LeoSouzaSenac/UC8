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

### 1. Exceções Verificadas (Checked)
Essas exceções devem ser tratadas obrigatoriamente pelo programa, caso contrário, ele nem vai rodar. Exemplo:

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExemploCheckedException {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("arquivo.txt")); // Pode gerar FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.println("Erro: Arquivo não encontrado!");
        }
    }
}
```

### 2. Exceções Não Verificadas (Unchecked)
Essas exceções são do tipo **RuntimeException** e não precisam ser tratadas obrigatoriamente.

Exemplo de **NullPointerException**:
```java
public class ExemploUncheckedException {
    public static void main(String[] args) {
        String texto = null;
        System.out.println(texto.length()); // Isso gera uma NullPointerException
    }
}
```

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
O tratamento de exceções é essencial para construir programas robustos e confiáveis. Ele deve ser usado para lidar com situações inesperadas, enquanto `if` deve ser usado para verificar condições normais do código. Ao dominar essa técnica, seus alunos estarão preparados para desenvolver sistemas mais seguros e profissionais!

