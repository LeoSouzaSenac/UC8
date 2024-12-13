# Criando uma Aplicação Java com Conexão ao Banco de Dados SQLite

Este guia irá ensinar como criar uma aplicação simples em Java que se conecta a um banco de dados SQLite. Vamos aprender a criar a tabela no banco de dados, inserir dados e listar os dados. Tudo será explicado passo a passo para garantir que você entenda o que está acontecendo em cada parte.

## Estrutura do Projeto

1. **Main.java**: O ponto de entrada da aplicação. Conecta-se ao banco de dados e chama os métodos para manipular a tabela e dados.
2. **CriarTabela.java**: Método responsável por criar a tabela no banco de dados.
3. **InserirUsuario.java**: Método para inserir novos usuários na tabela.
4. **ListarUsuarios.java**: Método para listar todos os usuários cadastrados na tabela.

---

## 1. **Main.java**

### O que é o `Main.java`?

O `Main.java` é o arquivo principal que vai executar a aplicação. Aqui, o banco de dados é acessado e os outros métodos são chamados para realizar as operações no banco (como criar tabela, inserir e listar usuários).

```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // A URL do banco de dados SQLite
        String url = "jdbc:sqlite:meubanco.db";

        // A tentativa de se conectar ao banco de dados
        try (Connection conn = DriverManager.getConnection(url)) {
            // Se a conexão for bem-sucedida, mostramos uma mensagem
            System.out.println("Conexão com o banco de dados estabelecida!");

            // Chamando o método para criar a tabela
            CriarTabela.criarTabela(conn);

            // Chamando o método para inserir um usuário
            InserirUsuario.inserirUsuario(conn, "João", 25);

            // Chamando o método para listar os usuários
            ListarUsuarios.listarUsuarios(conn);
            
        } catch (SQLException e) {
            // Se houver um erro de conexão, mostramos a mensagem de erro
            System.out.println("Erro na conexão: " + e.getMessage());
        }
    }
}
```

### O que está acontecendo no código?

1. **Estabelecer conexão com o banco de dados**:
   - `String url = "jdbc:sqlite:meubanco.db";` define o caminho para o banco de dados SQLite. Aqui, estamos dizendo que o banco de dados será salvo no arquivo `meubanco.db`.
   - `Connection conn = DriverManager.getConnection(url);` tenta abrir uma conexão com o banco de dados usando a URL fornecida.

2. **`try-with-resources`**:
   - O comando `try (Connection conn = DriverManager.getConnection(url))` é um exemplo de **try-with-resources**, o que significa que, ao final do bloco de código, a conexão será automaticamente fechada, evitando que o banco de dados fique aberto por tempo indeterminado.

3. **Chamando os métodos**:
   - **`CriarTabela.criarTabela(conn)`** cria a tabela no banco de dados.
   - **`InserirUsuario.inserirUsuario(conn, "João", 25)`** insere um usuário chamado "João" de 25 anos.
   - **`ListarUsuarios.listarUsuarios(conn)`** lista todos os usuários cadastrados.

---

## 2. **CriarTabela.java**

### O que é o `CriarTabela.java`?

Este arquivo contém o método responsável por criar a tabela no banco de dados caso ela não exista.

```java
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class CriarTabela {

    public static void criarTabela(Connection conn) {
        String sql = "CREATE TABLE IF NOT EXISTS usuarios (" +
                     "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                     "nome TEXT NOT NULL," +
                     "idade INTEGER NOT NULL);";

        try (Statement stmt = conn.createStatement()) {
            stmt.execute(sql); // Executa o SQL para criar a tabela
            System.out.println("Tabela criada com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao criar a tabela: " + e.getMessage());
        }
    }
}
```

### O que acontece aqui?

1. **Definir o comando SQL para criar a tabela**:
   - A string `sql` contém a instrução SQL que cria uma tabela chamada `usuarios` com três colunas: `id` (que é o identificador único para cada usuário), `nome` e `idade`.

2. **Executar o comando SQL**:
   - O comando `conn.createStatement()` cria um objeto `Statement` para executar o SQL.
   - `stmt.execute(sql)` executa o comando para criar a tabela.

3. **Tratamento de erro**:
   - Caso ocorra algum erro, o `catch` captura a exceção e exibe a mensagem de erro.

---

## 3. **InserirUsuario.java**

### O que é o `InserirUsuario.java`?

Este arquivo contém o método responsável por inserir dados na tabela de usuários.

```java
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InserirUsuario {

    public static void inserirUsuario(Connection conn, String nome, int idade) {
        String sql = "INSERT INTO usuarios(nome, idade) VALUES(?, ?)";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nome); // Define o nome do usuário
            pstmt.setInt(2, idade);   // Define a idade do usuário
            pstmt.executeUpdate();    // Executa a inserção dos dados
            System.out.println("Usuário inserido com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir usuário: " + e.getMessage());
        }
    }
}
```

### O que acontece aqui?

1. **Definir o comando SQL para inserir dados**:
   - A string `sql` contém o comando SQL para inserir um novo usuário na tabela `usuarios`, onde os valores de `nome` e `idade` são passados como parâmetros.

2. **Preparar e executar o comando**:
   - O **`PreparedStatement`** é usado para evitar problemas de segurança (como ataques de injeção de SQL). Ele prepara a consulta SQL, substituindo os valores `?` pelos dados fornecidos.
   - `pstmt.setString(1, nome)` e `pstmt.setInt(2, idade)` definem os valores para o nome e idade.
   - `pstmt.executeUpdate()` executa a inserção.

3. **Tratamento de erro**:
   - O `catch` captura erros e exibe uma mensagem de erro.

---

## 4. **ListarUsuarios.java**

### O que é o `ListarUsuarios.java`?

Este arquivo contém o método responsável por listar todos os usuários cadastrados no banco de dados.

```java
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class ListarUsuarios {

    public static void listarUsuarios(Connection conn) {
        String sql = "SELECT id, nome, idade FROM usuarios";

        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                int idade = rs.getInt("idade");
                System.out.println("ID: " + id + ", Nome: " + nome + ", Idade: " + idade);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar usuários: " + e.getMessage());
        }
    }
}
```

### O que acontece aqui?

1. **Definir o comando SQL para listar dados**:
   - A string `sql` contém o comando SQL para selecionar os dados de todos os usuários da tabela `usuarios`.

2. **Executar o comando e obter os resultados**:
   - O **`Statement`** é usado para executar a consulta SQL.
   - **`ResultSet rs = stmt.executeQuery(sql)`** executa a consulta e armazena os resultados em um objeto `ResultSet`.

3. **Exibir os resultados**:
   - O `while (rs.next())` percorre todos os resultados, e os métodos `rs.getInt()` e `rs.getString()` são usados para obter os valores de cada coluna.

4. **Tratamento de erro**:
   - Se ocorrer algum erro durante a execução, ele é capturado e exibido.
