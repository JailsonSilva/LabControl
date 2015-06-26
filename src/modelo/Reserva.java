package modelo;

public class Reserva {
    
    private String laboratorio;
    private String idPessoa;
    private String horaInicial;
    private String horaFinal;
    private String data;
    
    public Reserva(String laboratorio, String idPessoa, String horaInicial, String horaFinal, String data){
        this.laboratorio = laboratorio;
        this.idPessoa = idPessoa;
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
        this.data = data;
    }
    
    // geters
    public String getLaboratorio(){
        return laboratorio;
    }
    public String getIdPessoa(){
        return idPessoa;
    }
    public String getHoraInicial(){
        return horaInicial;
    }
    public String getHoraFinal(){
        return horaFinal;
    }
    public String getData(){
        return data;
    }
}
