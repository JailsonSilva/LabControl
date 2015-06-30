package modelo.entidade;

import interfaces.IManipulacaoVisual;

public abstract class Pessoa implements IManipulacaoVisual{
	
	private String nome;
	private String senha;
	private String cpf;
	
	public Pessoa(String nome, String senha, String cpf){
		
		this.nome = nome;
		this.senha = senha;
		this.cpf = cpf;
	}
	
        // geters
        public String getNome(){
            return nome;
        }
        public String getSenha(){
            return senha;
        }
        public String getCpf(){
            return cpf;
        }
        
        // seters
        public void setNome(String nome){
            this.nome = nome;
        }
        public void setSenha(String senha){
            this.senha = senha;
        }
        public void setCpf(String cpf){
            this.cpf = cpf;
        }
}
