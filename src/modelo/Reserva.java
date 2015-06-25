package modelo;

public class Reserva {
    
    private String laboratorio;
    private String nome;
    private String horaInicial;
    private String horaFinal;
    private String data;
    
    public Reserva(String laboratorio, String nome, String horaInicial, String horaFinal, String data){
        this.laboratorio = laboratorio;
        this.nome = nome;
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
        this.data = data;
    }
    
    // geters
    public String getLaboratorio(){
        return laboratorio;
    }
    public String getNome(){
        return nome;
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
