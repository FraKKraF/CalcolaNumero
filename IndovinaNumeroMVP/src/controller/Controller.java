package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Numeri;
import view.View;

public class Controller implements ActionListener{
	private Numeri n;
	private View v;
	
	public Controller(Numeri n,View v) {
		v.registraActionListener(this);
		this.n=n;
		this.v=v;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		//n.diminuisciTentativi();
		String n1 = v.getTextField().toString();
		int num = Integer.parseInt(n1);
		if(num > n.getNumero()) {
			v.getLblTentativi().setText(n.diminuisciTentativi()+"Tentativi: "+n.getTentativi());
			System.out.println("Il numero è più grande");
		} else if(num < n.getNumero()) {
			v.getLblTentativi().setText(n.diminuisciTentativi()+"Tentativi: "+n.getTentativi());
			System.out.println("Il numero è più piccolo");
		} else {
			System.out.println("Hai indovinato il numero!!");
		}
	}
}
