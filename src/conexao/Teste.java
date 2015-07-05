package conexao;

import java.sql.SQLException;

/**
 * Classeresponsavel por efetuar a conexãocom o banco de dados
 * @author Jailson José dos Santos Silva
 * @version 1.0
 * @since realese 01 da aplicação
 */
public class Teste {

	
    private Conexao conexao;
	
    /**
     * Método principal main para execução para teste
     * @param args String[] - possibilita receber varios paramentros
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	Teste t = new Teste();
		
	t.setConexao(new Conexao()); // seta a conexao com valores predeterminados
	t.getConexao().conectar(); // conecta ao banco
	
    }

    /**
     * Método que recebe os paramentros da conexção do banco de dados
     * @author Jailson josé dos Santos Silva
     * @return the conexao
     */
    public Conexao getConexao() {
    	return conexao;
    }

    /**
     * Método que informa os paramentros para conexão com o banco de dados
     * @author Jailson José dos Santos Silva
     * @param conexao Conexao - informa a nova conexão
     */
    public void setConexao(Conexao conexao) {
	this.conexao = conexao;
    }
}
