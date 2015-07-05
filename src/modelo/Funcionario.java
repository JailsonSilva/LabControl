package modelo;

/**
 * Classe para criação de um objeto Pessoa do tipo funcionario
 * @author Jailson José dos Santos Silva
 */
public class Funcionario extends Pessoa {
	
	private String cargo;
	
	/**
         * Contrutor da classe Funcionario
         * @param nome String - nome do objeto funcionario
         * @param senha String - senha do objeto funcionario
         * @param cpf String - cpf do objeto funcionario
         * @param cargo String - cargo do objeto funcionario
         */
	public Funcionario(String nome, String senha, String cpf, String cargo){
		super(nome, senha, cpf);
		this.cargo = cargo;
	}
        
        /**
         * Método para captura do atributo cargo
         * @author Jailson José dos Santos Silva
         * @return int - retorna o valor do atributo cargo
         */
        public String getCargo(){
		return cargo;
	}
}
