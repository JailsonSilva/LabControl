package conexao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import modelo.entidade.Aluno;
import modelo.entidade.Funcionario;
import modelo.entidade.Pessoa;
import modelo.Reserva;
import visual.*;

public class Conexao extends JDBconexao implements IManipulaBanco {
        
    Administracao administracao;
    Ajuda ajuda;
    Cadastro cadastro;
    Empresa empresa;
    Inicio inicio;
    Login login;
    Pesquisa pesquisa = new Pesquisa();
    Reserva reserva;
    
    /*
        Logar no programa
    */
    @Override
    public String logar(String cpf, String senha) throws SQLException{
        
        setConfirmacao(getConexao().createStatement());
        String sql = "select nome from pessoa where cpf = " + cpf + " and senha = '" + senha + "';";
        getConfirmacao().executeQuery(sql);
                
        
            String nome = getRetorno().getString("nome");
            return nome;
        
    }// fim do metodo logar()
    /*
        Inserir pessoa no banco
    */
    @Override
    public void inserirPessoa(String nome, String cpf, String senha) throws SQLException {
        
	setConfirmacao(getConexao().createStatement());
            String sql = "insert into pessoa(nome, cpf, senha, usuario) values ('"+nome+"', '"+cpf+"', '"+senha+"', 0);";
            getConfirmacao().executeUpdate(sql);
    } // fim do metodo inserirPessoa()
    
    /*
        Inserir cargo de funcionario no banco
    */
    @Override
    public void inserirCargo(String cargo) throws SQLException {
	
	setConfirmacao(getConexao().createStatement());
        String sql = "insert into funcionario(cargo) value ('"+cargo+"');";
        getConfirmacao().executeUpdate(sql);
    } // fim do metodo inserirCargo()
    
    /*
        Inserir curso de aluno no banco
    */
    @Override
    public void inserirCurso(String curso) throws SQLException {
	
	setConfirmacao(getConexao().createStatement());
        String sql = "insert into aluno(curso) value ('"+curso+"');";
        getConfirmacao().executeUpdate(sql);
    } // fim do metodo inserirCurso()
    
    /*
        Retorna todos os dados da tabela pessoa
    */
    @Override
    public ArrayList<modelo.entidade.Pessoa> retornarPessoa() throws SQLException {
		
	//array list dos dados
	ArrayList<modelo.entidade.Pessoa> dados = new ArrayList<>();
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
    
    @Override
    public void reservarHorario(String lab, String nome, String data, String horaInicial, String horaFinal) throws SQLException {
        setConfirmacao(getConexao().createStatement());
        String sql = "insert into reserva(laboratorio, nome, data, horaInicial, horaFinal) values ('"+lab+"', '"+nome+"', '"+data+"', '"+horaInicial+"', '"+horaFinal+"');";
        getConfirmacao().executeUpdate(sql);
    }
    
    /*
        Restorna todas as reservas
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
                String nome = getRetorno().getString("nome");
                String horaInicial = getRetorno().getString("horaInicial");
                String horaFinal = getRetorno().getString("horaFinal");
                String data = getRetorno().getString("data");
                
                mReserva = new Reserva(laboratorio, nome, horaInicial, horaFinal, data);
                
                dados.add(mReserva);
            }
        }		
            //retornando
            return dados;
    } // fim do método retornarReserva()
    
    /*
        Restorna do laboratorio escolhido
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
                String nome = getRetorno().getString("nome");
                String horaInicial = getRetorno().getString("horaInicial");
                String horaFinal = getRetorno().getString("horaFinal");
                String data = getRetorno().getString("data");
                
                mReserva = new Reserva(laboratorio, nome, horaInicial, horaFinal, data);
                
                dados.add(mReserva);
            }
        }		
            //retornando
            return dados;
    } // fim do método retornarReservaLab()
    
    /*
        Retorna laboratorios disponiveis
    */
    @Override
    public ArrayList<modelo.Reserva> retornarLabDisponivel(String hora) throws SQLException {
		
	//array list dos dados
	ArrayList<modelo.Reserva> dados = new ArrayList<>();
	Reserva mReserva;
		
	//executando a consulta
	setConfirmacao(getConexao().createStatement());

    	setRetorno(getConfirmacao().executeQuery("select L.numero from L.laboratorio, R.reserva where L.numero = R.laboratorio and"
                + " and " + hora ));
		
	//testando se houve retorno
	if (getRetorno().next()) {
			
            //colocando no primeiro registro
            getRetorno().previous();
			
            //recuperando todos os dados
            while (getRetorno().next()){
                
                String laboratorio = getRetorno().getString("laboratorio");
                String nome = getRetorno().getString("nome");
                String horaInicial = getRetorno().getString("horaInicial");
                String horaFinal = getRetorno().getString("horaFinal");
                String data = getRetorno().getString("data");
                
                mReserva = new Reserva(laboratorio, nome, horaInicial, horaFinal, data);
                
                dados.add(mReserva);
            }
        }		
            //retornando
            return dados;
    } // fim do método retornarLabDisponivel()
    
    @Override
    public void inserirLaboratório(String nome) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterarReserva() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluirReserva() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
