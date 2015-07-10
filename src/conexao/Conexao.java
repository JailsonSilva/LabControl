package conexao;

import interfaces.IManipulaBanco;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Aluno;
import modelo.Funcionario;
import modelo.Pessoa;
import modelo.Reserva;
import visual.*;

/**
 * Classe com os métodos a serem utilizados para captura e alteração de dados
 * contidos no banco de dados 
 * @author Jailson José dos Santos Silva
 * @version 1.0
 * @since realeise 01 da aplicação
 */
public class Conexao extends JDBconexao implements IManipulaBanco {
        
    TelaAdministracao administracao;
    TelaAjuda ajuda;
    TelaCadastro cadastro;
    TelaEmpresa empresa;
    TelaInicio inicio;
    TelaLogin login;
    TelaPesquisa pesquisa = new TelaPesquisa();
    Reserva reserva;
    
    /*
     * Sobrescrita do contrato logar da interface IManipulacaoBanco
    */
    @Override
    public String logar(String cpf, String senha) throws SQLException{
        
       //executando a consulta
	setConfirmacao(getConexao().createStatement());
        
        setRetorno(getConfirmacao().executeQuery("select nome from pessoa where cpf = " + cpf + " and senha = '" + senha + "';"));
        
        if(getRetorno().next()){
            String nome = getRetorno().getString("nome");
            return nome;
        }
        else{
            return null;
        }
        
    }// fim do metodo logar()
    
    /*
     * Sobrescrita do contrato inseriPessoa da interface IManipulacaoBanco
    */
    @Override
    public void inserirPessoa(String nome, String cpf, String senha) throws SQLException {
        
	setConfirmacao(getConexao().createStatement());
            String sql = "insert into pessoa(nome, cpf, senha, usuario) values ('"+nome+"', '"+cpf+"', '"+senha+"', 0);";
            getConfirmacao().executeUpdate(sql);
    } // fim do metodo inserirPessoa()
    
    /*
     * Sobrescrita do contrato inserirCargo da interface IManipulacaoBanco
    */
    @Override
    public void inserirCargo(String cargo) throws SQLException {
	
	setConfirmacao(getConexao().createStatement());
        String sql = "insert into funcionario(cargo) value ('"+cargo+"');";
        getConfirmacao().executeUpdate(sql);
    } // fim do metodo inserirCargo()
    
    /*
     * Sobrescrita do contrato inserirCurso da interface IManipulacaoBanco
    */
    @Override
    public void inserirCurso(String curso) throws SQLException {
	
	setConfirmacao(getConexao().createStatement());
        String sql = "insert into aluno(curso) value ('"+curso+"');";
        getConfirmacao().executeUpdate(sql);
    } // fim do metodo inserirCurso()
    
    /*
     * Sobrescrita do contrato retornarPessoa da interface IManipulacaoBanco
    */
    @Override
    public ArrayList<modelo.Pessoa> retornarPessoa() throws SQLException {
		
	//array list dos dados
	ArrayList<modelo.Pessoa> dados = new ArrayList<>();
	Pessoa pessoa;
		
	//executando a consulta
	setConfirmacao(getConexao().createStatement());

    	setRetorno(getConfirmacao().executeQuery("select * from pessoa"));
		
		
	//testando se houve retorno
	if (getRetorno().next()) {
			
            //colocando no primeiro registro
            getRetorno().previous();
			
            //recuperando todos os dados
            while (getRetorno().next()){
                
                String nome = getRetorno().getString("nome");
                String cpf = getRetorno().getString("cpf");
                String senha = getRetorno().getString("senha");
                String curso = getRetorno().getString("curso");
                String cargo = getRetorno().getString("cargo");
                String categoria = getRetorno().getString("categoria");
                
                switch (categoria) { // checa a categoria da pessoa
                    case "1": // categoria 1 é do tipo aluno
                        pessoa = new Aluno(nome, cpf, senha, curso);
                        //gravando no arraylista
                        dados.add(pessoa);
                        break;
                    case "2": // categoria 2 é do tipo funcionario
                        pessoa = new Funcionario(nome, senha, cpf, cargo);
                        //gravando no arraylista
                        dados.add(pessoa);
                        break;
                }
            }
        }		
            //retornando
            return dados;
    } // fim do método retornarPessoa()
    
    /*
     * Sobrescrita do contrato retornarDadosPessoa da interface IManipulacaoBanco
    */
    @Override
    public ArrayList<String> retornarDadosPessoa() throws SQLException {
		
	//array list dos dados
	ArrayList<String> dados = new ArrayList<>();
	Pessoa pessoa;
		
	//executando a consulta
	setConfirmacao(getConexao().createStatement());

    	setRetorno(getConfirmacao().executeQuery("select nome, cpf from pessoa"));
		
		
	//testando se houve retorno
	if (getRetorno().next()) {
			
            //colocando no primeiro registro
            getRetorno().previous();
			
            //recuperando todos os dados
            while (getRetorno().next()){
                
                String nome = getRetorno().getString("nome");
                String cpf = getRetorno().getString("cpf");
                
                dados.add(nome);
                dados.add(cpf + "\n");
            }
        }		
            //retornando
            return dados;
    } // fim do método retornarDadosPessoa()
    
    /*
     * Sobrescrita do contrato reservarHorario da interface IManipulacaoBanco
    */
    @Override
    public void reservarHorario(String lab, String cpf, String data, String horaInicial, String horaFinal) throws SQLException {
        setConfirmacao(getConexao().createStatement());
        String codPessoa = retornarCodPessoa(cpf);
        String sql = "insert into reserva(laboratorio, idPessoa, data, horaInicial, horaFinal) values ('"+lab+"', '"+codPessoa+"', '"+data+"', '"+horaInicial+"', '"+horaFinal+"');";
        getConfirmacao().executeUpdate(sql);
    } // fim de reservarHorario()
    
    /*
     * Sobrescrita do contrato listarReservaIndividual da interface IManipulacaoBanco
    */
    @Override
    public ArrayList<modelo.Reserva> listarReservaIndividual(String cpf) throws SQLException{
    
    	ArrayList<modelo.Reserva> dados = new ArrayList<>();
    	setConfirmacao(getConexao().createStatement());
    	Reserva mReserva;
    	String codPessoa = retornarCodPessoa(cpf);	
    	
        setRetorno(getConfirmacao().executeQuery("select * from reserva,pessoa  where idPessoa=codPessoa"));
    		
    	if (getRetorno().next()) {
    			
            getRetorno().previous();
    		
            while (getRetorno().next()){
                    
                String laboratorio = getRetorno().getString("laboratorio");
                String idPessoa = getRetorno().getString("idPessoa");
                String horaInicial = getRetorno().getString("horaInicial");
                String horaFinal = getRetorno().getString("horaFinal");
                String data = getRetorno().getString("data");
                String idReserva = getRetorno().getString("idReserva");//para pegar o id das reservas
                    
                mReserva = new Reserva(laboratorio, idPessoa, horaInicial, horaFinal, data);//tem q mostra o id da reserva pra poder chamar o metodo de alterar
                    
                dados.add(mReserva);                    
            }
        }		
        //retornando
        return dados;
    } // fim do método listarReservaIndividual()
    
    
    
    /*
     * Sobrescrita do contrato retornarCodPessoa da interface IManipulacaoBanco
    */
    @Override
    public String retornarCodPessoa(String cpf) throws SQLException{
        
        
        setConfirmacao(getConexao().createStatement());
        setRetorno(getConfirmacao().executeQuery("select codPessoa from labcontrol.pessoa where cpf = " + cpf + ";"));
        
        if(getRetorno().next()){
            String codPessoa = getRetorno().getString("CodPessoa");
            return codPessoa;
        }
        else{
            return null;
        }
    } // fim do método retornarCodPessoa()
    
    /*
     * Sobrescrita do contrato retornarReserva da interface IManipulacaoBanco
    */
    @Override
    public ArrayList<modelo.Reserva> retornarReserva() throws SQLException {
		
	//array list dos dados
	ArrayList<modelo.Reserva> dados = new ArrayList<>();
	Reserva mReserva;
		
	//executando a consulta
	setConfirmacao(getConexao().createStatement());

    	setRetorno(getConfirmacao().executeQuery("select * from reserva"));
		
	//testando se houve retorno
	if (getRetorno().next()) {
			
            //colocando no primeiro registro
            getRetorno().previous();
			
            //recuperando todos os dados
            while (getRetorno().next()){
                
                String laboratorio = getRetorno().getString("laboratorio");
                String idPessoa = getRetorno().getString("idPessoa");
                String horaInicial = getRetorno().getString("horaInicial");
                String horaFinal = getRetorno().getString("horaFinal");
                String data = getRetorno().getString("data");
                
                mReserva = new Reserva(laboratorio, idPessoa, horaInicial, horaFinal, data);
                
                dados.add(mReserva);
            }
        }		
            //retornando
            return dados;
    } // fim do método retornarReserva()
    
    /*
     * Sobrescrita do contrato retornarReservaLab da interface IManipulacaoBanco
    */
    @Override
    public ArrayList<modelo.Reserva> retornarReservaLab(String lab) throws SQLException {
		
	//array list dos dados
	ArrayList<modelo.Reserva> dados = new ArrayList<>();
	Reserva mReserva;
		
	//executando a consulta
	setConfirmacao(getConexao().createStatement());

    	setRetorno(getConfirmacao().executeQuery("select * from reserva where laboratorio = " + lab));
		
	//testando se houve retorno
	if (getRetorno().next()) {
			
            //colocando no primeiro registro
            getRetorno().previous();
			
            //recuperando todos os dados
            while (getRetorno().next()){
                
                String laboratorio = getRetorno().getString("laboratorio");
                String idPessoa = getRetorno().getString("idPessoa");
                String horaInicial = getRetorno().getString("horaInicial");
                String horaFinal = getRetorno().getString("horaFinal");
                String data = getRetorno().getString("data");
                
                mReserva = new Reserva(laboratorio, idPessoa, horaInicial, horaFinal, data);
                
                dados.add(mReserva);
            }
        }		
            //retornando
            return dados;
    } // fim do método retornarReservaLab()
    
    /*
     * Sobrescrita do contrato retornarLabDisponivel da interface IManipulacaoBanco
    */
    @Override
    public ArrayList<String> retornarLabDisponivel() throws SQLException {
		
	//array list dos dados
	ArrayList<String> dados = new ArrayList<>();
	Reserva mReserva;
		
	//executando a consulta
	setConfirmacao(getConexao().createStatement());

    	setRetorno(getConfirmacao().executeQuery("select numero from laboratorio where not exists(select laboratorio from reserva "
                + "where reserva.horaFinal >= current_time() and reserva.data = current_date() and reserva.laboratorio = laboratorio.numero)"));
		
	//testando se houve retorno
	if (getRetorno().next()) {
			
            //colocando no primeiro registro
            getRetorno().previous();
			
            //recuperando todos os dados
            while (getRetorno().next()){
                
                String dado = getRetorno().getString("numero");
                dados.add(dado + "\n");
                
            }
        }		
            //retornando
            return dados;
    } // fim do método retornarLabDisponivel()
    
    /*
     * Sobrescrita do contrato inserirLaboratorio da interface IManipulacaoBanco
    */
    @Override
    public void inserirLaboratório(String nome) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /*
     * Sobrescrita do contrato alterarReserva da interface IManipulacaoBanco
    */
    @Override
    public void alterarReserva(String cpf,String idReserva,String lab,String data,String horaInicial,String horaFinal) throws SQLException{
    	
		listarReservaIndividual(cpf);//so pra mostrar as reservas dele mais eh melhor ser chamado antes por um botao
    								  // na tela pra ele poder ver o idReserva e colocar nos dados
    		setRetorno(getConfirmacao().executeQuery("" +"select idpessoa from labcontrol.pessoa,laboratorio.reserva "
    			+"where select codPessoa from labcontrol.pessoa where cpf = " + cpf + ";"));
    		String codPessoa= getRetorno().getString("codPessoa");
    		String idPessoa = getRetorno().getString("idPessoa");
		String idR = getRetorno().getString("idREserva");
    
    		String sql = "update into reserva(laboratorio, idPessoa, data, horaInicial, horaFinal) values ('"+lab+"', '"+codPessoa+"', '"+data+"', '"+horaInicial+"', '"+horaFinal+"'); " 
    			+"Where "+codPessoa+"="+idPessoa+" and "+idR+"= idReserva";
        	getConfirmacao().executeUpdate(sql);
    	
	}
    
    /*
     * Sobrescrita do contrato excluirReserva da interface IManipulacaoBanco
    */
    @Override
    public void excluirReserva() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public ArrayList<String> labsMaisUsados()throws SQLException{
        
        ArrayList<String> dados = new ArrayList<>();
	Reserva mReserva;
		
	//executando a consulta
	setConfirmacao(getConexao().createStatement());

    	setRetorno(getConfirmacao().executeQuery("Limit 03" +"Select numero.L, count(*)\n" +"From Laboratorio L, Reserva R\n" +"Where L.numero = R. laboratorio\n" +"Group by numero.l\n" +
                "Order by count desc"));
		
	//testando se houve retorno
	if (getRetorno().next()) {
			
            //colocando no primeiro registro
            getRetorno().previous();
			
            //recuperando todos os dados
            while (getRetorno().next()){
                
                String dado = getRetorno().getString("numero");
                dados.add(dado + "\n");
                
                
            }
        
    }
        return dados;
}

    @Override
    public ArrayList<String> reservaCurso()throws SQLException{
        
        ArrayList<String> dados = new ArrayList<>();
	Reserva mReserva;
		
	//executando a consulta
	setConfirmacao(getConexao().createStatement());

    	setRetorno(getConfirmacao().executeQuery("Select curso.A, nome.A, cont(idReserva.R)"+"From Aluno A, Reserva R\n" +"Where A.codPessoa = R. Reserva\n" +"Group by curso.A\n" ));
                
          
		
	//testando se houve retorno
	if (getRetorno().next()) {
			
            //colocando no primeiro registro
            getRetorno().previous();
			
            //recuperando todos os dados
            while (getRetorno().next()){
                
                String dado = getRetorno().getString("curso");
                dados.add(dado + "\n");
                
                
            }
        
    }
        return dados;

}}