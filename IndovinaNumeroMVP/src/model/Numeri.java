package model;

import java.util.Random;

public class Numeri {
	private int numero;
	private int min = 0;
	private int max = 50;
	private int tentativi;

	public Numeri() {
		numero=(int)Math.floor(Math.random()*(max-min+1)+min);
		tentativi=5;
	}
	public int getNumero() {
		return numero;
	}
	public int getTentativi() {
		return tentativi;
	}
	
	public int diminuisciTentativi() {
		return tentativi --;
	}
}


