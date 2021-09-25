package model;

public class Numeri {
	private int numero;
	private int tentativi;
	private int min = 1;
	private int max = 50;
	int range = max-min;

	public Numeri() {
		numero = (int)Math.floor(Math.random()*range)-min;
		tentativi=5;
	}
	public int getNumero() {
		return numero;
	}
	public int getTentativi() {
		return tentativi;
	}
	
	public int diminuisciTentativi() {
		return --tentativi;
	}
	
}


