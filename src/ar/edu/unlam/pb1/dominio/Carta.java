package ar.edu.unlam.pb1.dominio;

public class Carta {
	String color;
	int numero;
	
	public Carta(String color, int numero) {
		this.color=color;
		this.numero=numero;
	}
	
	public String getColor() {
		return this.color;
	}
	public int getNumero() {
		return this.numero;
	}
}
