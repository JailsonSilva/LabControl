package conexao;

import java.sql.SQLException;
import java.util.ArrayList;


public class Teste {

	
	private Conexao conexao;
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		Teste t = new Teste();
		
		
		t.setConexao(new Conexao());
		t.getConexao().conectar();
		
                t.getConexao().inserirPessoa("'root'");
		
		ArrayList<modelo.entidade.Pessoa> dados = new ArrayList<>();
		
		dados = t.getConexao().retornarPessoa();
		
	    for(int i=0;i<dados.size();i++){  
	        System.out.println(dados.get(i).getNome());    
	      }  
		

	}

	//get e set
	/**
	 * @return the conexao
	 */
	public Conexao getConexao() {
		return conexao;
	}

	/**
	 * @param conexao the conexao to set
	 */
	public void setConexao(Conexao conexao) {
		this.conexao = conexao;
	}

	
}
