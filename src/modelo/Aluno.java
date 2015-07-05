package modelo;

/**
 * Classe para criação de um objeto Pessoa do tipo aluno
 * @author Jailson José dos Santos Silva
 * @version 1.0
 * @since realese 01 da alpicação
 */
public class Aluno extends Pessoa {
	
	private String curso;
	
	/**
         * Contrutor da classe Aluno
         * @param nome String - nome do objeto aluno
         * @param senha String - senha do objeto aluno
         * @param cpf String - cpf do objeto aluno
         * @param curso String - curso do objeto aluno
         */
	public Aluno(String nome, String senha, String cpf, String curso){
		super(nome, senha, cpf);
		this.curso = curso;
		
	}
        
        /**
         * Método para captura do atributo curso
         * @author Jailson José dos Santos Silva
         * @return int - retorna o valor do atributo curso
         */
        public String getCurso(){
		return curso;
	}
}
