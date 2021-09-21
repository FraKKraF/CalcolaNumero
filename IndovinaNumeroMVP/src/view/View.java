package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.Controller;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class View extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnInvia;
	private JLabel lblTentativi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View frame = new View();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
 
	public void registraActionListener(Controller c) {
		btnInvia.addActionListener(c);
	}

	/**
	 * Create the frame.
	 */
	public View() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNumero = new JLabel("Indovina Numero");
		lblNumero.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNumero.setBounds(94, 13, 230, 37);
		contentPane.add(lblNumero);

		lblTentativi = new JLabel("Tentativi:");
		lblTentativi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTentativi.setBounds(158, 63, 103, 23);
		contentPane.add(lblTentativi);

		textField = new JTextField();
		textField.setBounds(145, 113, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);

		btnInvia = new JButton("Invia");
		btnInvia.setBounds(152, 172, 97, 25);
		contentPane.add(btnInvia);
	}
	
	public JLabel getLblTentativi() {
		return lblTentativi;
	}
	
	public JTextField getTextField() {
		return textField;
	}
	

}
