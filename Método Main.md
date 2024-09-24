# O que é Obrigatório no Método `main` em Java?

O método `main` é essencial para o funcionamento de um programa Java, pois é o ponto de entrada da aplicação. Há algumas características que **sempre** devem estar presentes para que o método funcione corretamente. Vamos explorar o que é **obrigatório** em todo método `main`.

## Estrutura Obrigatória do Método `main`

A assinatura padrão do método `main` que a JVM (Java Virtual Machine) espera é:

```java
public static void main(String[] args)
```

### O que é Obrigatório?

1. **public**
   - O método `main` deve ser **público**. Isso é necessário porque a JVM precisa ter acesso ao método para iniciar o programa. Se ele não for público, o programa não rodará, pois a JVM não conseguiria "enxergar" o método.

2. **static**
   - O método `main` deve ser **estático**. Isso é obrigatório porque a JVM chama o método sem criar um objeto da classe que contém o `main`. Sendo estático, ele pode ser chamado diretamente através do nome da classe, sem necessidade de instanciar a classe.

3. **void**
   - O método `main` **não pode retornar nenhum valor**. O tipo de retorno deve ser `void`. Isso significa que, após executar o método `main`, o programa não devolve nenhuma informação diretamente à JVM.

4. **main**
   - O nome do método **deve ser exatamente** `main`. Esse é o nome específico que a JVM procura ao iniciar o programa. Qualquer outro nome resultaria em erro ou o programa não rodaria.

5. **String[] args**
   - O método `main` precisa aceitar um parâmetro do tipo `array de Strings`, ou seja, `String[]`. Esse parâmetro é usado para passar argumentos para o programa quando ele é executado. Embora você possa não usar os argumentos, o parâmetro precisa estar lá para que o programa seja considerado válido.

### Exemplo Correto:

Aqui está o formato correto e obrigatório de um método `main`:

```java
public class Exemplo {
    public static void main(String[] args) {
        System.out.println("Programa rodando corretamente!");
    }
}
```

- **`public`**: A JVM pode acessar o método.
- **`static`**: Pode ser executado sem criar uma instância da classe.
- **`void`**: Não retorna nada.
- **`main`**: Nome fixo que a JVM reconhece.
- **`String[] args`**: Parâmetro obrigatório, mesmo que não seja utilizado no código.

## Exemplo Incorreto:

Aqui estão exemplos de métodos `main` incorretos e o motivo pelo qual não funcionariam:

### 1. Faltando `public`:
```java
static void main(String[] args) {
    System.out.println("Erro! O método precisa ser público.");
}
```
**Erro**: A JVM não pode acessar o método se ele não for público.

### 2. Faltando `static`:
```java
public void main(String[] args) {
    System.out.println("Erro! O método precisa ser estático.");
}
```
**Erro**: A JVM não pode executar o método sem criar um objeto da classe, o que quebra o fluxo de execução esperado.

### 3. Nome errado:
```java
public static void principal(String[] args) {
    System.out.println("Erro! O nome do método precisa ser 'main'.");
}
```
**Erro**: A JVM só reconhece o método com o nome `main`.

### 4. Parâmetro errado:
```java
public static void main(int[] args) {
    System.out.println("Erro! O parâmetro precisa ser 'String[]'.");
}
```
**Erro**: O tipo de parâmetro deve ser um array de `String`, não de `int` ou outro tipo.

---

## Resumo

Os elementos obrigatórios do método `main` em Java são:
- **`public`**: Acessível pela JVM.
- **`static`**: Executado sem instância de classe.
- **`void`**: Não retorna valor.
- **`main`**: Nome específico do método.
- **`String[] args`**: Parâmetro de array de Strings.
