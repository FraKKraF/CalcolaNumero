package main;

import controller.Controller;
import model.Numeri;
import view.View;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numeri n = new Numeri();
		View v = new View();
		Controller c = new Controller(n,v);
		v.setVisible(true);
	}

}
