/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexaoBanco;

/**
 *
 * @author Aluno
 */
import java.sql.Connection;        // A classe Connection é usada para estabelecer uma conexão com o banco de dados.
import java.sql.PreparedStatement; // A classe PreparedStatement é usada para executar uma consulta SQL com parâmetros substituíveis.

public class InserirUsuario {  

    // Definimos o método inserirUsuario, que recebe uma conexão com o banco de dados (conexao),
    // um nome de usuário (nome) e um email de usuário (email).
    public static void inserirUsuario(Connection conexao, String nome, String email) {

        // A string sql contém o comando SQL que será executado no banco de dados. 
        // O comando INSERT INTO vai inserir um novo registro na tabela "usuarios" com os valores de "nome" e "email".
        String sql = "INSERT INTO usuarios (nome, email) VALUES (?, ?)"; 
        
        // O bloco try é utilizado para garantir que o recurso (PreparedStatement) 
        // seja fechado automaticamente após o uso.
        try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            
            // O método setString substitui os "?" no comando SQL pelos valores passados como parâmetros para o método.
            // O primeiro parâmetro é a posição do "?", e o segundo é o valor a ser atribuído.
            pstmt.setString(1, nome); // Substitui o primeiro ? por 'nome'
            pstmt.setString(2, email); // Substitui o segundo ? por 'email'

            // O método executeUpdate executa o comando SQL no banco de dados. 
            // No caso, ele insere o usuário na tabela.
            pstmt.executeUpdate();
            
            System.out.println("Usuário inserido com sucesso!");

        // O bloco catch captura qualquer exceção que ocorra durante a execução do código dentro do try.
        // Se algo der errado (por exemplo, erro de conexão ou comando SQL inválido), a mensagem de erro será exibida.
        } catch (Exception e) {
            System.out.println("Erro ao inserir usuário: " + e.getMessage());  // Exibe a mensagem de erro.
        }
    }
}
