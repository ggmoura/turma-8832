package br.com.osi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JPasswordField;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtEmail;
	private final JPasswordField Senha = new JPasswordField();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	
		txtEmail = new JTextField();
		txtEmail.setText("adm@treinar");
		txtEmail.setBounds(75, 138, 299, 29);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("/Users/Chrisansu/Documents/treinar.png"));
		lblNewLabel.setBounds(116, 20, 218, 65);
		contentPane.add(lblNewLabel);
		
		JLabel lblEmailLogin = new JLabel("Email");
		lblEmailLogin.setBounds(79, 122, 167, 16);
		contentPane.add(lblEmailLogin);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(79, 171, 167, 16);
		contentPane.add(lblSenha);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int retorno = JOptionPane.showConfirmDialog(null, "Deseja sair ?", "Atenção", JOptionPane.YES_NO_OPTION);
				if(retorno == JOptionPane.YES_OPTION){
					System.exit(0);
				}
			}
		});
		
		btnSair.setBackground(Color.GRAY);
		btnSair.setBounds(257, 224, 117, 29);
		contentPane.add(btnSair);
		
		Senha.setBounds(75, 188, 299, 29);
		contentPane.add(Senha);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
								
				if(txtEmail.getText().equals("") && Senha.getPassword().equals("")){
					JOptionPane.showMessageDialog(null, "Usuário ou Senha inválidos");
					txtEmail.grabFocus();
				}
				else if(txtEmail.getText().equals("adm@treinar") && Senha.getText().equals("adm@treinar")){
					
					Principal acesso = new Principal();
					acesso.setVisible(true);
					
				}
				else{
				
					JOptionPane.showMessageDialog(null, "Usuário ou Senha inválidos");
					txtEmail.grabFocus();
				}
			
			}
		});
		btnNewButton.setBounds(139, 224, 117, 29);
		contentPane.add(btnNewButton);
	}

}
