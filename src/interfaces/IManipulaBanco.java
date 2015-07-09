package interfaces;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Interface com os métodos de manipulação de informações do banco de dados
 * @author Jailson José dos Santos Silva
 * @version 1.0
 * @since realese 01 da aplicação
 */
public interface IManipulaBanco {
	
	/**
         * Contrato que contem as informações para fazer o login
         * @author Jailson José dos Santos Silva
         * @param cpf String - informa o cpf
         * @param senha String - informa a senha
         * @return String - retorna uma String em formato sql
         * @throws SQLException 
         */
	String logar(String cpf, String senha) throws SQLException;
        
        /**
         * Contrato que contem os dados de uma pessoa para ser inserida no banco de dados
         * @author Jailson José dos Santos Silva
         * @param nome String - informa o nme da pessoa
         * @param cpf String - informa o cpf da pessoa
         * @param senha String - informa a senha da pessoa
         * @throws SQLException 
         */
	void inserirPessoa(String nome, String cpf, String senha) throws SQLException;
        
        /**
         * Contrato contendo o cargo da pessoa do funcionario para ser inserido no banco de dados
         * @param cargo String - informa o cargo do funcionario
         * @throws SQLException 
         */
        void inserirCargo(String cargo) throws SQLException;
        
        /**
         * Contrato contendo o curso da pessoa do tipo aluno para ser inserido no banco de dados
         * @author Jailson José dos Santos Silva
         * @param curso String - informa o curso do aluno
         * @throws SQLException 
         */
        void inserirCurso(String curso) throws SQLException;
        
        /**
         * Contrato para inserir um laboratorio no banco de dados
         * @author Jailson José dos Santos Silva
         * @param nome String - informa o numero do laboratorio
         * @throws SQLException 
         */
        void inserirLaboratório(String nome) throws SQLException;
        
        /**
         * Contrato contendo as informação para efetuar uma reserva
         * @author Jailson José dos Santos Silva
         * @param lab String - informa o numero do laboratorio
         * @param cpf String - informa o cpf da pessoa dona da reserva
         * @param data String - informa data da reserva
         * @param horaInicial String - informa a hora inicial da reserva
         * @param horaFinal String - informa a hora final da reserva
         * @throws SQLException 
         */
        void reservarHorario(String lab, String cpf, String data, String horaInicial, String horaFinal) throws SQLException;
        
        /**
         * Contrato para listar as reservas feitas por uma determinada pessoa
         * @author Denney Wesley
         * @param cpf
         * @return
         * @throws SQLException 
         */
        ArrayList<modelo.Reserva> listarReservaIndividual(String cpf) throws SQLException;
        
        /**
         * Contrato contendo para alterar os dados de uma reserva
         * @author Denney Wesley
         * @param cpf
         * @param idReserva
         * @param lab
         * @param data
         * @param horaInicial
         * @param horaFinal
         * @throws SQLException 
         */
        void alterarReserva(String cpf,String idReserva,String lab,String data,String horaInicial,String horaFinal) throws SQLException;
 
        /**
         * Contrato para verificação de cadastro de pessoa
         * @author Jailson José dos Santos Silva
         * @param cpf String - informa o cpf a ser verificado
         * @return String - retorna uma string em formato sql
         * @throws SQLException 
         */
        String retornarCodPessoa(String cpf) throws SQLException;
        
        /**
         * Contrato para excluir uma reserva
         * @author Jailson José dos Santos Silva
         * @throws SQLException 
         */
        void excluirReserva() throws SQLException;
        
        /**
         * Contrato que retorna todas as pessoas cadastradas no banco de dados
         * @author Jailson José dos Santos Silva
         * @return ArrayList - retorna uma SrrayList contendo todas as pessoas cadastradas no banco de dados
         * @throws SQLException 
         */
 	ArrayList<modelo.Pessoa> retornarPessoa() throws SQLException;
        
        /**
         * Contrato que retorna os nomes e cpfs de todas as pessoas cadastradas no banco de dados
         * @author Jailson José dos Santos Silva
         * @return ArrayList - retorna uma ArratList com os nomes cpfs de todas as pessoa cadastradas no banco de dados
         * @throws SQLException 
         */
        ArrayList<String> retornarDadosPessoa() throws SQLException;
        
        /**
         * Contrato que retorna todas as reservas realizadas que estejam cadastradas no banc de dados
         * @author Jailson José dos Santos Silva
         * @return ArrayList - retorna uma ArrayListcontendo todas as reservas salvas no banco de dados
         * @throws SQLException 
         */
        ArrayList<modelo.Reserva> retornarReserva() throws SQLException;
        
        /**
         * Contrato que retorna as reservas de um laboratorio especifico
         * @author Jailson José dos Santos Silva
         * @param lab String - informa o laboratorio a ser pesquisado
         * @return ArrayList - retorna uma ArrayList contendo as reservas do laboratorio expecificado
         * @throws SQLException 
         */
        ArrayList<modelo.Reserva> retornarReservaLab(String lab) throws SQLException;
        
        /**
         * Contrato que retorna os laboratorios disponiveis atualmente
         * @author Jailson José dos Santos Silva
         * @return retorna uma ArrayList contendo os laboratorios que estão disponiveis atualmente
         * @throws SQLException 
         */
        ArrayList<String> retornarLabDisponivel() throws SQLException;

}
