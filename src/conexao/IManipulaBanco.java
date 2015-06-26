package conexao;

import java.sql.SQLException;
import java.util.ArrayList;


public interface IManipulaBanco {
	
	
	public String logar(String cpf, String senha) throws SQLException;
	public void inserirPessoa(String nome, String cpf, String senha) throws SQLException;
        public void inserirCargo(String cargo) throws SQLException;
        public void inserirCurso(String curso) throws SQLException;
        public void inserirLaboratório(String nome) throws SQLException;
        public void reservarHorario(String lab, String cpf, String data, String horaInicial, String horaFinal) throws SQLException;
        public String retornarCodPessoa(String cpf) throws SQLException;
        public void alterarReserva() throws SQLException;
        public void excluirReserva() throws SQLException;
 	public ArrayList<modelo.entidade.Pessoa> retornarPessoa() throws SQLException;
        public ArrayList<String> retornarDadosPessoa() throws SQLException;
        public ArrayList<modelo.Reserva> retornarReserva() throws SQLException;
        public ArrayList<modelo.Reserva> retornarReservaLab(String lab) throws SQLException;
        public ArrayList<String> retornarLabDisponivel() throws SQLException;

}
