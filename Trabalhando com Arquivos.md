# Criando um Bloco de Notas com Java Swing

## Introdução
Neste material, vamos explorar os conceitos e classes utilizadas para criar um bloco de notas simples usando Java Swing. 
Vamos entender cada uma das classes e métodos importantes envolvidos no processo de abrir, editar e salvar arquivos `.txt`.

## Conceitos e Classes Utilizadas

### `JFileChooser`
O `JFileChooser` é um componente gráfico do Swing que permite ao usuário selecionar arquivos e diretórios de maneira visual.

- **Métodos principais:**
  - `showOpenDialog(Component parent)`: abre uma janela para o usuário escolher um arquivo para abrir.
  - `showSaveDialog(Component parent)`: abre uma janela para escolher onde salvar um arquivo.
  - `getSelectedFile()`: retorna o arquivo escolhido pelo usuário.
  
Esse componente facilita a navegação e escolha de arquivos sem precisar digitar o caminho manualmente.

### `File`
A classe `File` representa arquivos e diretórios no sistema de arquivos.

- **Principais métodos:**
  - `getName()`: retorna o nome do arquivo.
  - `getAbsolutePath()`: retorna o caminho completo do arquivo.
  - `exists()`: verifica se o arquivo existe.
  - `createNewFile()`: cria um novo arquivo se ele não existir.
  
Essa classe é essencial para manipular arquivos no Java.

### `IOException`
A `IOException` é uma exceção que ocorre quando há um problema ao trabalhar com entrada e saída de dados (I/O), como abrir ou salvar arquivos.

- **Por que ela ocorre?**
  - O arquivo pode não existir.
  - O programa pode não ter permissão para acessar o arquivo.
  - O sistema pode estar sem espaço para salvar dados.

Quando lidamos com operações de leitura e escrita de arquivos, é fundamental tratar essa exceção com `try-catch` para evitar que o programa pare de funcionar abruptamente.

### `BufferedWriter`
A classe `BufferedWriter` é usada para escrever texto em um arquivo de forma eficiente.

- **Como funciona?**
  - Ela escreve dados em um buffer antes de salvar no arquivo, o que melhora o desempenho.
  - Precisamos chamar `flush()` ou `close()` para garantir que os dados sejam realmente gravados no arquivo.

- **Principais métodos:**
  - `write(String texto)`: escreve uma string no arquivo.
  - `newLine()`: adiciona uma nova linha no arquivo.
  - `close()`: fecha o fluxo de escrita.

### `FileWriter`
O `FileWriter` é responsável por escrever caracteres em arquivos.

- **Diferença entre `FileWriter` e `BufferedWriter`?**
  - O `FileWriter` escreve diretamente no arquivo, enquanto o `BufferedWriter` usa um buffer para otimizar o desempenho.

- **Principais métodos:**
  - `FileWriter(String nomeDoArquivo)`: cria um `FileWriter` para um arquivo específico.
  - `write(String texto)`: escreve uma string no arquivo.
  - `close()`: fecha o fluxo de escrita.

O `FileWriter` pode ser usado sozinho, mas combiná-lo com `BufferedWriter` melhora a eficiência da escrita.


Claro! Vamos explorar esses conceitos de forma mais didática.

### O que é um **buffer**?

Imagine que você tem uma máquina de escrever (o arquivo) e um cesto de papel (o buffer). Sempre que você digita algo na máquina, você poderia imediatamente levar o papel até a impressora (o arquivo), mas isso seria ineficiente, pois cada vez que você digita uma palavra, você teria que sair da sua mesa e ir até a impressora.

Em vez disso, você coloca o papel no cesto (o buffer). Quando o cesto estiver cheio ou quando for necessário, você leva todo o conteúdo do cesto de uma vez para a impressora. Isso economiza tempo e esforço, porque você só faz uma viagem para a impressora, em vez de várias.

O **buffer** é uma área de armazenamento temporário onde os dados ficam armazenados antes de serem realmente gravados no arquivo ou enviados para o dispositivo de saída (como a tela, por exemplo). 
O **BufferedWriter** usa esse cesto de papel para acumular os dados e só os escreve no arquivo quando o buffer estiver cheio ou quando você pedir explicitamente.

### Como o **BufferedWriter** funciona?

Quando você usa o `BufferedWriter`, ele coloca os dados em um "cesto de papel" (o buffer) e só escreve no arquivo quando o buffer estiver cheio ou quando você chamar o método `flush()` ou `close()`. 
Isso faz com que a escrita seja mais eficiente, pois você está escrevendo menos vezes no arquivo, o que reduz o tempo gasto em operações de entrada/saída (I/O).

#### Exemplo com `BufferedWriter`:
```java
BufferedWriter bw = new BufferedWriter(new FileWriter("exemplo.txt"));
bw.write("Olá, mundo!");
bw.newLine();  // Nova linha
bw.write("Segunda linha.");
bw.close();  // Garantimos que o conteúdo foi gravado no arquivo
```

### O que é um **FileWriter**?

Agora, o `FileWriter` é uma ferramenta mais simples. Quando você usa o `FileWriter`, ele escreve diretamente no arquivo sem usar o buffer. Isso significa que, sempre que você escrever algo, ele será imediatamente enviado para o arquivo, o que pode ser mais lento, pois a operação de escrita no disco é mais demorada do que escrever na memória (onde o buffer armazena os dados temporariamente).

#### Exemplo com `FileWriter`:
```java
FileWriter fw = new FileWriter("exemplo.txt");
fw.write("Olá, mundo!");
fw.write("Segunda linha.");
fw.close();  // Dados são gravados diretamente no arquivo
```

### **Diferença entre `FileWriter` e `BufferedWriter`**

A principal diferença entre `FileWriter` e `BufferedWriter` está no desempenho.

- **`FileWriter`**: Escreve diretamente no arquivo. Ele é simples, mas pode ser mais lento porque cada chamada ao `write()` significa que ele vai escrever no arquivo.
  
- **`BufferedWriter`**: Usa um buffer (ou "cesto de papel"), ou seja, ele acumula os dados na memória primeiro e só depois grava tudo de uma vez no arquivo. Isso é mais rápido, pois ele minimiza o número de vezes que precisa acessar o disco (o arquivo).

### Quando usar **BufferedWriter**?

- Se você está escrevendo grandes quantidades de dados em um arquivo, o uso do **BufferedWriter** será mais eficiente.
- Se você está escrevendo apenas algumas linhas ou um arquivo pequeno, o **FileWriter** pode ser suficiente.

### Metáfora para entender a diferença:

- **`FileWriter`** é como se você fosse até a impressora sempre que digitasse algo na máquina de escrever. Se você digitar 10 páginas, vai ter que ir até a impressora 10 vezes, o que é ineficiente.
  
- **`BufferedWriter`** é como se você colocasse tudo no cesto de papel e só fosse até a impressora quando o cesto estivesse cheio ou quando você já tivesse terminado de escrever todas as 10 páginas. Isso economiza tempo e esforço.

Em resumo:
- **`FileWriter`**: Simples, escreve diretamente no arquivo.
- **`BufferedWriter`**: Usa um buffer, mais eficiente para grandes volumes de dados.

---

