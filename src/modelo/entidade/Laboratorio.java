package modelo.entidade;

public class Laboratorio {
	
	private int id;
	private int numero;
	private int capacidade;
	
	public int getId(){
		return id;
	}
	public int getNumero(){
		return numero;
	}
	public int getCapacidade(){
		return capacidade;
	}
	
	public Laboratorio(int id, int numero, int capacidade){
		this.id = id;
		this.numero = numero;
		this.capacidade = capacidade;
	}
}
