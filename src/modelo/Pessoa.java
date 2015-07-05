package modelo;

/**
 * Classe para criação de um objeto Pessoa
 * @author Jailson José dos Santos Silva
 * @version 1.0
 * @since realese 01 da aplicação
 */
public abstract class Pessoa{
	
	private String nome;
	private String senha;
	private String cpf;
	
        /**
         * Contrutor da Classe Pessoa
         * @author Jailson Jo´se dos Santos Silva
         * @param nome String - informa o nome do objeto Pessoa
         * @param senha String - infora a senha do objeto Pessoa
         * @param cpf String - informa o cpf do objeto Pessoa
         */
	public Pessoa(String nome, String senha, String cpf){
		
		this.nome = nome;
		this.senha = senha;
		this.cpf = cpf;
	}
	
        /**
         * Método para retornar o atributo nome
         * @author Jailson José dos Santos Silva
         * @return String - retorna o valor contido no atributo nome
         */
        public String getNome(){
            return nome;
        }
        
        /**
         * Método para retornar o atributo senha
         * @authos Jailson José dos Santos Silca
         * @return String - retorna o valor contido no atributo senha
         */
        public String getSenha(){
            return senha;
        }
        
        /**
         * Método para retornar o atributo cpf
         * @author Jailson José dos Santos Silva
         * @return String - retorna o valor contido no atributo cpf
         */
        public String getCpf(){
            return cpf;
        }
        
        /**
         * Método para alteração do atriburo nome
         * @author Jailson José dos Satos Silva
         * @param nome String - informa o novo valor do atributo nome
         */
        public void setNome(String nome){
            this.nome = nome;
        }
        
        /**
         * Método para alteração do atributo senha
         * @author Jailson José dos Santos Silva
         * @param senha String - informa o novo valor do atributo senha
         */
        public void setSenha(String senha){
            this.senha = senha;
        }
        
        /**
         * Método para alteração do atributo cpf
         * @author  jailsonJosé dos Santos Silva
         * @param cpf String - informa o novo vlor do atributo cpf
         */
        public void setCpf(String cpf){
            this.cpf = cpf;
        }
}
