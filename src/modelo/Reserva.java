package modelo;

/**
 * Classe para criação de um objeto reserva
 * @author Jailson José dos Santos Silva
 * @version 1.0
 * @since realese 01 da aplicação
 */
public class Reserva {
    
    private String laboratorio;
    private String idPessoa;
    private String horaInicial;
    private String horaFinal;
    private String data;
    
    /**
     * Contrutor da classe Reserva
     * @author Jailson José dos Santos Silva
     * @param laboratorio String - informa o numero do laboratorio
     * @param idPessoa String - informa o indice da pessoa para identificar no banco de ados
     * @param horaInicial String - informa a hora de inicio da reserva
     * @param horaFinal String - informa a hor final da reserva
     * @param data String - informa a data da reserva
     */
    public Reserva(String laboratorio, String idPessoa, String horaInicial, String horaFinal, String data){
        this.laboratorio = laboratorio;
        this.idPessoa = idPessoa;
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
        this.data = data;
    }
    
    /**
    * Método para captura do atributo laboratorio
    * @author Jailson José dos Santos Silva
    * @return String - retorna o valor do atributo laboratorio
    */
    public String getLaboratorio(){
        return laboratorio;
    }
    
    /**
    * Método para captura do atributo idPessoa
    * @author Jailson José dos Santos Silva
    * @return String - retorna o valor do atributo idPessoa
    */
    public String getIdPessoa(){
        return idPessoa;
    }
    
    /**
    * Método para captura do atributo horaInicial
    * @author Jailson José dos Santos Silva
    * @return String - retorna o valor do atributo horaInicial
    */
    public String getHoraInicial(){
        return horaInicial;
    }
    
    /**
    * Método para captura do atributo horaFinal
    * @author Jailson José dos Santos Silva
    * @return String - retorna o valor do atributo horaFinal
    */
    public String getHoraFinal(){
        return horaFinal;
    }
    
    /**
    * Método para captura do atributo data
    * @author Jailson José dos Santos Silva
    * @return String - retorna o valor do atributo data
    */
    public String getData(){
        return data;
    }
}
