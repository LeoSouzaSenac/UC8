## O que é Build?

Vocês, que já têm experiência com **JavaScript** e **TypeScript** no desenvolvimento web, talvez nunca tenham se deparado com o conceito de "build". Em linguagens como Java, o processo de build é uma parte fundamental do desenvolvimento de software.

### Definição

O **build** é o processo de **compilar** (compilar é o processo de transformar o código-fonte que você escreveu em um formato que o computador pode entender e executar) o código-fonte que você escreveu (no caso de Java, os arquivos `.java`) para transformá-lo em um formato que o computador consiga entender e executar, normalmente um **arquivo executável** ou **bytecode** (no caso de Java, os arquivos `.class`). Esse processo pode incluir várias etapas, como:

- **Compilação**: O código Java é transformado em bytecode que roda na JVM (Máquina Virtual Java).
- **Linkagem** (se necessário): Combina diferentes partes do código em um único arquivo executável.
- **Pacote (Packaging)**: Coloca todos os arquivos necessários em um arquivo compactado, como um `.jar` (Java ARchive) para distribuição.
- **Testes**: Roda testes automáticos para verificar se o código funciona corretamente.
- **Otimização**: Faz ajustes no código para melhorar o desempenho.

### Por Que o Build é Necessário?

Em desenvolvimento web, vocês estão acostumados a escrever JavaScript e já ver o código sendo executado diretamente no navegador. No caso de Java (e outras linguagens compiladas), o computador não consegue ler o código diretamente. Ele precisa ser transformado em um **formato intermediário** (bytecode), que a JVM consegue entender e executar.

### Exemplo Simplificado do Processo de Build em Java

1. **Escrita do código**: Você escreve um arquivo `Main.java`.
   
   ```java
   public class Main {
       public static void main(String[] args) {
           System.out.println("Hello, World!");
       }
   }
   ```

2. **Compilação**: O build transforma esse arquivo `.java` em bytecode, resultando em um arquivo `.class` (por exemplo, `Main.class`).
   
   - **Antes do build**: Código-fonte em `.java`.
   - **Após o build**: Arquivos `.class`, que podem ser executados na JVM.

3. **Execução**: A JVM lê o bytecode e executa seu programa.

### Ferramentas de Build

Algumas ferramentas ajudam a automatizar esse processo de build em projetos Java. Exemplos incluem:
- **Maven**
- **Gradle**
- **Ant**

Essas ferramentas permitem compilar, testar, empacotar e até mesmo enviar seu código para produção automaticamente.



Em Java, o build é necessário para garantir que o código funcione corretamente na JVM e esteja pronto para ser distribuído e executado em diferentes ambientes.

