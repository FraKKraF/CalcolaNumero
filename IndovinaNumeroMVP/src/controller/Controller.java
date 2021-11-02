package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.Numeri;
import view.View;

public class Controller implements ActionListener {
	private Numeri n;
	private View v;
	private Logger l;
	private int num;

	public Controller(Numeri n, View v, Logger l) {
		v.registraActionListener(this);
		this.n = n;
		this.v = v;
		this.l = l;
		l.creaLog("" + n.getOra() + "\nInizio del gioco\n");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		v.getLblTentativi().setText("Tentativi: " + n.getTentativi());
		// n.diminuisciTentativi();
		if (arg0.getActionCommand().equalsIgnoreCase("Invia")) {
			String n1 = v.insNumero.getText();
			l.creaLog("" + n.getOra() + "L'utente ha provato ad indovinare il numero, inserendo il "+ v.insNumero.getText()+"\n");
			try {
				num = Integer.parseInt(n1);	
				if (num < n.getNumero() && v.insNumero.getText() != "") {
					v.getLblTentativi().setText("Tentativi: " + n.diminuisciTentativi());
					JOptionPane.showMessageDialog(null, "Il numero è più grande");
					v.insNumero.setText("");
					l.creaLog("" + n.getOra() + "L'utente ha inserito un numero più piccolo rispetto a quello da indvinare\n");

				} else if (num > n.getNumero() && v.insNumero.getText() != "") {
					v.getLblTentativi().setText("Tentativi: " + n.diminuisciTentativi());
					JOptionPane.showMessageDialog(null, "Il numero è più piccolo");
					l.creaLog("" + n.getOra() + "L'utente ha inserito un numero più grande rispetto a quello da indovinare\n");
					v.insNumero.setText("");
				} else {
					JOptionPane.showMessageDialog(null, "Hai vinto!!");
					l.creaLog("" + n.getOra() + "L'utente ha indovinato il numero, l'utente ha vinto\n\n");
					l.creaLog("" + "----------------------------------------------------------------------------------------------------\n");

					System.exit(0);
				}
				if (n.getTentativi() != 0) {
					System.out.println("");
				} else {
					JOptionPane.showMessageDialog(null, "Hai finito i tentativi");
					l.creaLog("" + n.getOra() + "L'utente ha finito tutti i tentativi, l'utente ha perso\n\n");
					l.creaLog("" + "----------------------------------------------------------------------------------------------------\n");

					System.exit(0);
				}
			} catch (Exception e) {
				System.out.println("Devi inserire un numero!");
				l.creaLog("" + n.getOra() + "L'utente non ha inserito nessun numero\n");
			}

		}else if(arg0.getActionCommand().equalsIgnoreCase("Mostra log")) {
		 l.mostraLog(); 
		}

	}
}
