package main;

import controller.Controller;
import model.Numeri;
import view.View;
import controller.Logger;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numeri n = new Numeri();
		View v = new View();
		Logger l = new Logger();
		Controller c = new Controller(n,v,l);
		v.setVisible(true);
	}

}
