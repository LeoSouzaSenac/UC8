/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexaoBanco;

/**
 *
 * @author Aluno
 */
/*Representa uma conexão ativa com um banco de dados.
Usada para criar Statement e PreparedStatement para executar consultas SQL*/
import java.sql.Connection;
//Responsável por estabelecer a conexão com o banco de dados usando getConnection()
import java.sql.DriverManager;

/*Representa erros que ocorrem durante operações com o banco de dados.
Útil para tratar falhas de conexão ou comandos SQL inválidos.*/
import java.sql.SQLException;

public class ConexaoSQLite { // Declaração da classe que gerencia a conexão com o SQLite
    
    // Método para conectar ao banco de dados
    public Connection conectar() {
        Connection conexao = null; // Declara uma variável para armazenar a conexão
        String url = "jdbc:sqlite:usuariosNovo.db"; // Define o caminho do banco de dados SQLite
        
        try {
            // Tenta estabelecer a conexão com o banco de dados usando a URL fornecida
            conexao = DriverManager.getConnection(url);
            System.out.println("Conexão com SQLite estabelecida!"); // Mensagem de sucesso
        } catch (SQLException e) {
            // Caso ocorra um erro, ele será capturado e exibido
            System.out.println("Erro ao conectar ao banco: " + e.getMessage());
        }
        
        return conexao; // Retorna a conexão estabelecida (ou null se falhou)
    }

    // Método para fechar a conexão com o banco de dados
    public void desconectar(Connection conexao) {
        try {
            // Verifica se a conexão não é nula (ou seja, se está aberta)
            if (conexao != null) {
                conexao.close(); // Fecha a conexão
                System.out.println("Conexão fechada."); // Mensagem de sucesso
            }
        } catch (SQLException e) {
            // Captura e exibe qualquer erro ao tentar fechar a conexão
            System.out.println("Erro ao fechar a conexão: " + e.getMessage());
        }
    }
}
