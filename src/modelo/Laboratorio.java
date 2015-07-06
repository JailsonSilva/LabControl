package modelo;

/**
 * Classe para criação de um objeto do tipo laboratorio
 * @author Danilo Bion
 * @version 1.0
 * @since realese 01 da aplicação
 */
public class Laboratorio {
	
	private int id;
	private int numero;
	private int capacidade;
	
	/**
         * Contrutor da classe Laboratorio
         * @author Danilo Bion
         * @param id int - indice do objeto
         * @param numero int - numero de identificação
         * @param capacidade - informa a capacidade do laboratorio
         */
	public Laboratorio(int id, int numero, int capacidade){
		this.id = id;
		this.numero = numero;
		this.capacidade = capacidade;
	}
        
        /**
         * Método para captura do atributo id
         * @author Danilo Bion
         * @return int - retorna o valor do atributo id
         */
        public int getId(){
		return id;
	}
        
        /**
         * Método para captura do atributo numero
         * @author Danilo Bion
         * @return int - retorna o valor do atributo numero
         */
	public int getNumero(){
		return numero;
	}
        
        /**
         * Método para captura do atributo capacidade
         * @author Danilo Bion
         * @return int - retorna o valor do atributo capacidade
         */
	public int getCapacidade(){
		return capacidade;
	}
	
}
