package modelo.entidade;

public class Funcionario extends Pessoa {
	
	private String cargo;
	
	public String getCargo(){
		return cargo;
	}
	public Funcionario(String nome, String senha, String cpf, String cargo){
		super(nome, senha, cpf);
		this.cargo = cargo;
	}

    @Override
    public void acesso() {
        
    }
}
