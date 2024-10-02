# Condicionais em Java

Em Java, **estruturas condicionais** são usadas para executar blocos de código de acordo com certas condições. As duas principais estruturas condicionais em Java são: **`if-else`** e **`switch`**.

## 1. Condicional `if-else`

A estrutura `if` executa um bloco de código apenas se a condição for **verdadeira**. O bloco `else` (opcional) pode ser usado para executar outro bloco de código se a condição for **falsa**.

### Sintaxe básica

```java
if (condição) {
    // Código a ser executado se a condição for verdadeira
} else {
    // Código a ser executado se a condição for falsa
}
```

### Exemplo 1: Verificar se um número é positivo

```java
public class Main {
    public static void main(String[] args) {
        int numero = 5;

        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else {
            System.out.println("O número é negativo ou zero.");
        }
    }
}
```

### Exemplo 2: Usando `else if`

```java
public class Main {
    public static void main(String[] args) {
        int numero = 0;

        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
    }
}
```

## 2. Condicional `switch`

A estrutura `switch` é usada quando se deseja verificar uma variável contra múltiplos valores. É uma alternativa para quando temos muitos `else if`.

### Sintaxe básica

```java
switch (variavel) {
    case valor1:
        // Código a ser executado se variavel == valor1
        break;
    case valor2:
        // Código a ser executado se variavel == valor2
        break;
    // Outros casos
    default:
        // Código a ser executado se nenhum dos casos anteriores for atendido
        break;
}
```

### Exemplo 3: Verificar dia da semana

```java
public class Main {
    public static void main(String[] args) {
        int diaSemana = 3;

        switch (diaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido.");
                break;
        }
    }
}
```

### Notas importantes sobre `switch`
- O `break` é necessário para impedir que os blocos de código dos casos seguintes sejam executados.
- O `default` é opcional e será executado se nenhum dos casos corresponder ao valor da variável.

## 3. Operador Ternário

O operador ternário é uma maneira curta de escrever uma condição simples `if-else`.

### Sintaxe básica

```java
variavel = (condição) ? valor_se_verdadeiro : valor_se_falso;
```

### Exemplo 4: Verificar se um número é par ou ímpar

```java
public class Main {
    public static void main(String[] args) {
        int numero = 4;

        String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";
        System.out.println("O número é " + resultado);
    }
}
```

## 4. Conclusão

As estruturas condicionais permitem que seu programa tome decisões com base em condições dinâmicas. O `if-else` é mais flexível e pode lidar com condições complexas, enquanto o `switch` é uma maneira mais limpa de lidar com múltiplos valores de uma única variável. O operador ternário é uma forma compacta de escrever condicionais simples.
