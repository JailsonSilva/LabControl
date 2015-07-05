package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Classe com os dados para conexão com um banco de dados do tipo JDBC
 * @author Jailson José dos Santos Silva
 * @version 1.0
 * @since realise 01 da aplicação
 */
public class JDBconexao {

	//atributos para conexão
    private String url;
    private String usuario;
    private String senha;
    private String db;
    private String porta;
    private String driver;
    private String servername;
    private String escopo;
	
    //atributos de retorno do banco
    private ResultSet retorno;
    private Statement confirmacao;
    private Connection conexao; //armazena a conexao real com o banco
    
    /**
     * Método que faz a conexão com o banco de dados
     * @author Jailson José dos Santos Silva
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
    public void conectar() throws ClassNotFoundException, SQLException{

        //setando os valores
	setarValores();
		
	Class.forName(getDriver());
		
	//setando os valores da url para conexao
	setUrl(getEscopo()+getServername()+":"+getPorta()+"/"+getDb());
		
	//estabelecendo a conexão
	setConexao(DriverManager.getConnection(getUrl(),getUsuario(),getSenha()));
    }
	
    /**
     * Método que seta os valores para a conexão com o banco de dados
     * @author Jailson José dos Santos Silva
     */
    public void setarValores(){
	setServername("localhost");
	setUsuario("root");
	setSenha("leonus777");
	setDb("labcontrol");
	setPorta("3306");
	setDriver("com.mysql.jdbc.Driver");
	setEscopo("jdbc:mysql://");
    }
    
    //métodos get e set
    /**
     * Método para captura da url do banco de dados
     * @author Jailson José dos Santos Silva
     * @return String - retorna uma String com a url do banco de dados
     */
    public String getUrl() {
    	return url;
    }
    
    /**
     * Método para alterar a url do banco de daods
     * @author Jailson José dos Santos Silva
     * @param url String - informa a nova url do banco de dados
     */
    public void setUrl(String url) {
    	this.url = url;
    }
    
    /**
     * Método para captura do usuario do banco de dados
     * @author Jailson José dos Santos Silva
     * @return String - retorna uma String com o usuario do banco de dados
     */
    public String getUsuario() {
	return usuario;
    }
    
    /**
     * Método para alterar o usuario do banco de dados
     * @author Jailso José dos Santos Silva
     * @param usuario String - informa o novo usuario do banco de dados
     */
    public void setUsuario(String usuario) {
    	this.usuario = usuario;
    }
    
    /**
     * Método para captura da senha do banco de dados
     * @author Jailson José dos Santos Silva
     * @return String retorna uma String com a senha do usuario do banco de dados
     */
    public String getSenha() {
    	return senha;
    }
    
    /**
     * Método para alterar a senha do usuario do banco de dados
     * @author Jailson José dos Santos silva
     * @param senha String - informa a senha do usuario do banco de dados
     */
    public void setSenha(String senha) {
    	this.senha = senha;
    }
    
    /**
     * Método para captura do nome do banco de dados
     * @author Jailson José dos Santos Silva
     * @return String - retorna uma String com o nome do banco de dados
     */
    public String getDb() {
    	return db;
    }
    
    /**
     * Método para alterar o banco de dados
     * @author Jailson José dos Santos Silva
     * @param db String - informa o banco de dados a ser utilizado
     */
    public void setDb(String db) {
    	this.db = db;
    }
    
    /**
     * Método para captura da porta utilizada pelo banco de dados
     * @author Jailson José dos Santos Silva
     * @return String - retorna uma String com a porta utilizada pelo banco de daods
     */
    public String getPorta() {
    	return porta;
    }
    
    /**
     * Método para alterar a porta utilizada pelo banco de daods
     * @author jailson José dos Santos Silva
     * @param porta String - informa a porta que sera utilizada
     */
    public void setPorta(String porta) {
    	this.porta = porta;
    }
    
    /**
     * Método para captura do driver utilizado pelo banco de daods
     * @author Jailson José dos Santos Silva
     * @return String - retorna uma String com o nome do driver utilizado
     */
    public String getDriver() {
    	return driver;
    }
    
    /**
     * Método para alterar o driver utilizado
     * @author Jailson José dos Santos Silva
     * @param driver String - informa o nome do driver que sera utilizado
     */
    public void setDriver(String driver) {
    	this.driver = driver;
    }
    
    /**
     * Método para captura do nome do servidor
     * @author jailson José dos Santos Silva
     * @return String - retrna uma string com o nome do servidor
     */
    public String getServername() {
    	return servername;
    }
    
    /**
     * Método para alterar o nome do Servidor a ser utilizado
     * @author Jailson José dos Santos Silva
     * @param servername String - informa o nome do novo servidor
     */
    public void setServername(String servername) {
    	this.servername = servername;
    }
    
    /**
     * Método para captura do escopo utilizado
     * @author Jailson José dos Santos Silva
     * @return String - retorna uma String com o escopo
     */
    public String getEscopo() {
    	return escopo;
    }
    
    /**
     * Método para alterar o escopo utilizado
     * @author Jailson josé dos Santos Silva
     * @param escopo String - informa o o escopo a ser utilizado
     */
    public void setEscopo(String escopo) {
    	this.escopo = escopo;
    }
    
    /**
     * Método para captura das informações contidas no atributo retorno
     * @author Jailson José dos Santos Silva
     * @return ResultSet - retorna o conteudo de retorno
     */
    public ResultSet getRetorno() {
    	return retorno;
    }
    
    /**
     * Método para alterar o atributo retorno
     * @author Jailson José dos Santos Silva
     * @param retorno ResultSet - passa o novo valor a ser atribuido ao atributo retorno
     */
    public void setRetorno(ResultSet retorno) {
    	this.retorno = retorno;
    }
    
    /**
     * Método para captura do atributo confirmacao
     * @author Jailson José dos Santos Silva
     * @return Statment - retorna o valor contido no atributo confirmacao
     */
    public Statement getConfirmacao() {
    	return confirmacao;
    }
    
    /**
     * Método para alterar o valor contido no atributo confirmacao
     * @author Jailson José dos Santos Silva
     * @param confirmacao Statment - passa o novo valor a ser atribuido ao atributo confirmacao
     */
    public void setConfirmacao(Statement confirmacao) {
    	this.confirmacao = confirmacao;
    }
    
    /**
     * Método para capturar o valor contido no atributo conexao
     * @author Jailson José dos Santos Silva
     * @return Connection - retorna o conteudo contido no atributo conexao
     */
    public Connection getConexao() {
	return conexao;
    }
    
    /**
     * Método para alterar o valor contido no atributo conexao
     * @author Jailson José dos Santos Silva
     * @param conexao Connection - passa o novo valor a ser atribuido ao atributo conexao
     */
    public void setConexao(Connection conexao) {
    	this.conexao = conexao;
    }
    
}
