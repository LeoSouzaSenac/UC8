/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioMVC.model;

/**
 *
 * @author Aluno
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

// Definição da classe LivroDAO, que é responsável pelas operações no banco de dados relacionadas aos livros
public class LivroDAO {
    
    // Atributo para armazenar a conexão com o banco de dados
    private Connection conexao;

    // Construtor da classe, responsável por estabelecer a conexão com o banco de dados
    public LivroDAO() {
        conectar();
    }

    // Método privado para estabelecer a conexão com o banco de dados
    private void conectar() {
        try {
            // Estabelece a conexão com o banco de dados SQLite
            conexao = DriverManager.getConnection("jdbc:sqlite:biblioteca.db");
        } catch (SQLException e) {
            // Se ocorrer um erro na conexão, exibe uma mensagem de erro
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco: " + e.getMessage());
        }
    }

    // Método público para adicionar um novo livro ao banco de dados
    public void adicionarLivro(Livro livro) {
        // Comando SQL para inserir um novo livro na tabela 'livros'
        String sql = "INSERT INTO livros (titulo, autor, ano) VALUES (?, ?, ?)";
        
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            // Definindo os parâmetros do comando SQL com os dados do livro
            stmt.setString(1, livro.getTitulo());
            stmt.setString(2, livro.getAutor());
            stmt.setInt(3, livro.getAno());
            
            // Executa a atualização no banco de dados
            stmt.executeUpdate();
            
            // Exibe uma mensagem de sucesso
            JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!");
        } catch (SQLException e) {
            // Se ocorrer um erro durante a inserção, exibe uma mensagem de erro
            JOptionPane.showMessageDialog(null, "Erro ao adicionar livro: " + e.getMessage());
        }
    }


}


/*
A classe LivroDAO é uma implementação da camada de Data Access Object (DAO), 
que gerencia a interação entre a aplicação e o banco de dados, nesse caso, 
para a manipulação de dados relacionados a livros.

*/
