# JDBC: Métodos, Classes e Interfaces Essenciais

## 1. O que é JDBC?
JDBC (**Java Database Connectivity**) é uma API do Java que permite a comunicação entre aplicações Java e bancos de dados relacionais. Ele fornece um conjunto de classes e interfaces para conectar-se a um banco, executar consultas e manipular dados.

---

## 2. Passo a Passo para Usar JDBC

### **1. Criar a conexão com o banco de dados**
A primeira coisa a se fazer é estabelecer uma conexão com o banco. Para isso, utilizamos o `DriverManager` para obter um objeto `Connection`.

### **2. Criar o banco de dados e tabelas (se não existirem)**
Antes de inserir ou consultar dados, é necessário garantir que o banco de dados e as tabelas existam. Isso pode ser feito com um `Statement` executando comandos `CREATE DATABASE` e `CREATE TABLE`.

### **3. Executar operações no banco**
Após estabelecer a conexão e criar as tabelas, podemos executar operações como inserção, atualização e consulta de dados utilizando `Statement` ou `PreparedStatement`.

### **4. Fechar os recursos**
Após finalizar as operações, devemos sempre fechar `Connection`, `Statement` e `ResultSet` para evitar vazamento de recursos.

---

## 3. Diferença entre `DriverManager` e `Connection`

### **`DriverManager` (Gerenciador de Drivers)**
- Responsável por localizar e carregar o driver adequado para o banco de dados.
- Atua como uma ponte entre a aplicação Java e o banco.
- Fornece o método `getConnection()`, que retorna um objeto `Connection`.

### **`Connection` (Conexão com o Banco de Dados)**
- Representa uma conexão ativa com o banco.
- Usado para criar `Statement`, `PreparedStatement` e executar transações.
- Deve ser fechado após o uso para evitar desperdício de recursos.

---

## 4. Interfaces Principais e Seus Métodos Importantes

### **4.1. `DriverManager`**
- `getConnection(String url, String user, String password)`: Estabelece uma conexão com o banco.
- `getDrivers()`: Retorna os drivers registrados no sistema.

### **4.2. `Connection`**
- `createStatement()`: Cria um objeto `Statement` para executar consultas SQL simples.
- `prepareStatement(String sql)`: Cria um `PreparedStatement` para consultas parametrizadas.
- `setAutoCommit(boolean status)`: Define se as transações serão automáticas.
- `commit()`: Confirma as alterações no banco.
- `rollback()`: Reverte alterações em caso de erro.
- `close()`: Fecha a conexão com o banco.

### **4.3. `Statement`**
- `executeQuery(String sql)`: Executa um `SELECT` e retorna um `ResultSet`.
- `executeUpdate(String sql)`: Executa `INSERT`, `UPDATE` ou `DELETE`, retornando o número de linhas afetadas.
- `close()`: Fecha o objeto `Statement`.

### **4.4. `PreparedStatement`** (Recomendado para consultas seguras)
- `setString(int index, String value)`: Define um parâmetro `String` na consulta.
- `setInt(int index, int value)`: Define um parâmetro `int`.
- `executeQuery()`: Executa um `SELECT`.
- `executeUpdate()`: Executa `INSERT`, `UPDATE` ou `DELETE`.
- `close()`: Fecha o objeto `PreparedStatement`.

### **4.5. `ResultSet`** (Resultados das Consultas)
- `next()`: Move para a próxima linha do resultado.
- `getString(String columnLabel)`: Obtém o valor de uma coluna como `String`.
- `getInt(String columnLabel)`: Obtém o valor de uma coluna como `int`.
- `close()`: Fecha o `ResultSet`.

### **4.6. `ResultSetMetaData`** (Metadados sobre as colunas de um `ResultSet`)
- `getColumnCount()`: Retorna o número de colunas.
- `getColumnName(int column)`: Retorna o nome da coluna.

### **4.7. `DatabaseMetaData`** (Informações sobre o Banco de Dados)
- `getTables(null, null, "%", new String[]{"TABLE"})`: Retorna as tabelas do banco.
- `getDatabaseProductName()`: Retorna o nome do banco de dados.

---

## 5. Boas Práticas no Uso do JDBC
- **Fechar Recursos**: Sempre feche `Connection`, `Statement` e `ResultSet` após o uso.
- **Usar `PreparedStatement`**: Evita SQL Injection e melhora o desempenho.
- **Habilitar Transações**: Use `setAutoCommit(false)`, `commit()` e `rollback()` para garantir a integridade dos dados.
- **Usar `try-with-resources`**: Para fechamento automático de conexões e consultas.

