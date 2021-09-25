package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.Numeri;
import view.View;

public class Controller implements ActionListener {
	private Numeri n;
	private View v;

	public Controller(Numeri n, View v) {
		v.registraActionListener(this);
		this.n = n;
		this.v = v;
	}
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		v.getLblTentativi().setText( "Tentativi: " + n.getTentativi());
		// n.diminuisciTentativi();
		if (arg0.getActionCommand().equalsIgnoreCase("Invia")) {
			String n1 = v.insNumero.getText();
			int num = Integer.parseInt(n1);
			if (num < n.getNumero()) {
				v.getLblTentativi().setText( "Tentativi: " + n.diminuisciTentativi());
				JOptionPane.showMessageDialog(null, "Il numero è più grande");
				v.insNumero.setText("");

			} else if (num > n.getNumero()) {
				v.getLblTentativi().setText("Tentativi: "+ n.diminuisciTentativi());
				JOptionPane.showMessageDialog(null, "Il numero è più piccolo");
				v.insNumero.setText("");
			} else {
				JOptionPane.showMessageDialog(null, "Hai vinto!!");
				System.exit(0);
			}
			if (n.getTentativi() != 0){
				System.out.println("");
			} else {
				JOptionPane.showMessageDialog(null,"Hai finito i tentativi");
				System.exit(0);
			}
			
		}

	}
}
