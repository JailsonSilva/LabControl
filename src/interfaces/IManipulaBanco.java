package interfaces;

import java.sql.SQLException;
import java.util.ArrayList;


public interface IManipulaBanco {
	
	
	String logar(String cpf, String senha) throws SQLException;
	void inserirPessoa(String nome, String cpf, String senha) throws SQLException;
        void inserirCargo(String cargo) throws SQLException;
        void inserirCurso(String curso) throws SQLException;
        void inserirLaboratório(String nome) throws SQLException;
        void reservarHorario(String lab, String cpf, String data, String horaInicial, String horaFinal) throws SQLException;
        String retornarCodPessoa(String cpf) throws SQLException;
        void alterarReserva() throws SQLException;
        void excluirReserva() throws SQLException;
 	ArrayList<modelo.entidade.Pessoa> retornarPessoa() throws SQLException;
        ArrayList<String> retornarDadosPessoa() throws SQLException;
        ArrayList<modelo.Reserva> retornarReserva() throws SQLException;
        ArrayList<modelo.Reserva> retornarReservaLab(String lab) throws SQLException;
        ArrayList<String> retornarLabDisponivel() throws SQLException;

}
