import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConexaoSQLite {
    private static final String URL = "jdbc:sqlite:biblioteca.db";
    private static Connection conexao = null;

    // Método para conectar ao banco de dados
    public static Connection conectar() {
        try {
            // Se a conexão não existir ainda
            if (conexao == null || conexao.isClosed()) {
                // Então ele inicia a conexão
                conexao = DriverManager.getConnection(URL);
            }
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco: " + e.getMessage());
        }
        return conexao;
    }

    // Método para fechar a conexão
    public static void desconectar() {
        try {
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao desconectar do banco: " + e.getMessage());
        }
    }
}
