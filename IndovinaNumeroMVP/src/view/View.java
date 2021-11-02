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
	public JTextField insNumero;
	private JButton btnInvia;
	public JLabel lblTentativi;
	public JButton btnLog;

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
		setTitle("Indovina numero\r\n");
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

		lblTentativi = new JLabel(" Tentativi");
		lblTentativi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTentativi.setBounds(158, 77, 103, 23);
		contentPane.add(lblTentativi);

		insNumero = new JTextField();
		insNumero.setBounds(145, 113, 116, 22);
		contentPane.add(insNumero);
		insNumero.setColumns(10);

		btnInvia = new JButton("Invia");
		btnInvia.setBounds(94, 172, 97, 25);
		contentPane.add(btnInvia);
		
		JLabel lblNewLabel = new JLabel("Da 1 a 50");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(158, 47, 91, 17);
		contentPane.add(lblNewLabel);
		
		btnLog = new JButton("Mostra log");
		btnLog.setBounds(227, 172, 97, 25);
		contentPane.add(btnLog);
	}
	
	public JLabel getLblTentativi() {
		return lblTentativi;
	}
	
	public JTextField getTextField() {
		return insNumero;
	}
}
