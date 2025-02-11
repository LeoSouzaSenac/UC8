/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexaoBanco;

/**
 *
 * @author Aluno
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ListarUsuarios {
    public static String listarUsuarios(Connection conexao) {
        
        // Criação de uma String para armazenar os resultados
        String textoUsuarios = "";
        
        // SQL para selecionar todos os registros
        String sql = "SELECT * FROM usuarios";

        // Tentando executar a consulta SQL
        try (Statement stmt = conexao.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            // Cabeçalho da tabela
            textoUsuarios += "ID | Nome | Email\n";
            textoUsuarios += "----------------------\n";

            // Loop para percorrer todos os registros retornados
            while (rs.next()) {
                // Pega os dados de cada usuário do banco
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                
                // Concatena os dados na String
                textoUsuarios += id + " | " + nome + " | " + email + "\n";
            }
        } catch (Exception e) {
            // Caso ocorra algum erro, adiciona a mensagem de erro na String
            textoUsuarios += "Erro ao listar usuários: " + e.getMessage();
        }
        
        // Retorna o texto com os dados dos usuários
        return textoUsuarios;
    }
}

