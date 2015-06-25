package modelo.entidade;

public class Aluno extends Pessoa {
	
	private String curso;
	
	public String getCurso(){
		return curso;
	}
	
	public Aluno(String nome, String senha, String cpf, String curso){
		super(nome, senha, cpf);
		this.curso = curso;
		
	}

    @Override
    public void acesso() {
        
    }
}
