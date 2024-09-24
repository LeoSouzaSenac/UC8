# Variáveis em Java

## Como Criar Variáveis em Java

Para criar uma variável em Java, basta seguir a seguinte estrutura:

```java
tipo nomeDaVariável = valorInicial;
```

### Exemplo:

```java
int idade = 25;
String nome = "Ana";
boolean ativo = true;
```

Aqui, estamos declarando três variáveis:
- `idade` do tipo `int` (número inteiro),
- `nome` do tipo `String` (texto),
- `ativo` do tipo `boolean` (verdadeiro ou falso).

## Tipos de Variáveis em Java

### Tipos Primitivos

1. **int** (número inteiro)
   - Usado para números inteiros, sem parte decimal.
   - Exemplo:
     ```java
     int idade = 30;
     ```

2. **double** (número com ponto flutuante)
   - Usado para números com parte decimal.
   - Exemplo:
     ```java
     double preco = 19.99;
     ```

3. **boolean** (verdadeiro/falso)
   - Usado para valores lógicos: `true` ou `false`.
   - Exemplo:
     ```java
     boolean ativo = false;
     ```

4. **char** (caractere)
   - Usado para armazenar um único caractere.
   - Exemplo:
     ```java
     char inicial = 'A';
     ```

### Tipo por Referência

1. **String** (cadeia de caracteres)
   - Usado para armazenar texto (mais de um caractere).
   - Exemplo:
     ```java
     String nome = "João";
     ```

### Resumo dos Tipos Primitivos

| Tipo    | Descrição                 | Exemplo         |
|---------|---------------------------|-----------------|
| `int`   | Números inteiros           | `int idade = 20;`|
| `double`| Números decimais           | `double altura = 1.75;`|
| `boolean`| Valores verdadeiros/falsos | `boolean ativo = true;`|
| `char`  | Um único caractere         | `char letra = 'A';`|

### Manipulando Variáveis

Depois de declarar uma variável, você pode alterar o seu valor:

```java
int contador = 10;
contador = 20;  // Alterando o valor de 'contador' para 20
```

### Importante:

- As variáveis em Java são **case-sensitive**, ou seja, `nome` e `Nome` são variáveis diferentes.
- Java é uma linguagem **fortemente tipada**, o que significa que você deve especificar o tipo da variável e ele não pode mudar ao longo do programa.
