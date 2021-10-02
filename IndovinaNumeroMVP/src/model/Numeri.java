package model;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Numeri {
	private int numero;
	private int tentativi;
	private int min = 1;
	private int max = 50;
	private int range = max-min;
	private String messaggio;
	private String ora;
	
	DateFormat df = new SimpleDateFormat("yyyy/MM/dd - HH.mm.ss.SSS ");
	Date data = new Date();

	public Numeri() {
		numero = (int)Math.floor(Math.random()*range)-min;
		//numero = 0;
		//numero = 51;
		if(numero == 0) {
			numero = (int)Math.floor(Math.random()*range)-min;
		}else if(numero > 50) {
			numero = (int)Math.floor(Math.random()*range)-min;
		}
		
		tentativi=5;
	}
	public int getNumero() {
		return numero;
	}
	public int getTentativi() {
		return tentativi;
	}
	
	public String getMessaggio() {
		return messaggio;
	}
	
	public int diminuisciTentativi() {
		return --tentativi;
	}
	
	public String getOra() {
		return ora = df.format(data); 
	}
}


