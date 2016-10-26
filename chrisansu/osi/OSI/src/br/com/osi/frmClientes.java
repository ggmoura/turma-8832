package br.com.osi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmClientes extends JFrame {

	private JPanel contentPane;
	private JTextField textRazao;
	private JTextField textField;
	private JTextField textCEP;
	private JTextField textEndereco;
	private JTextField textNumero;
	private JTextField textBairro;
	private JTextField textCidade;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmClientes frame = new frmClientes();
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
	public frmClientes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 513);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		menuBar.add(mnArquivo);
		
		JMenuItem mntmSalvar = new JMenuItem("Salvar");
		mnArquivo.add(mntmSalvar);
		
		JMenuItem mntmGerarTxt = new JMenuItem("Gerar TXT");
		mnArquivo.add(mntmGerarTxt);
		
		JMenuItem mntmFechar = new JMenuItem("Fechar");
		mnArquivo.add(mntmFechar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRazaoSocial = new JLabel("Razao Social:");
		lblRazaoSocial.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRazaoSocial.setBounds(23, 35, 104, 16);
		contentPane.add(lblRazaoSocial);
		
		textRazao = new JTextField();
		textRazao.setBounds(135, 30, 294, 26);
		contentPane.add(textRazao);
		textRazao.setColumns(10);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(135, 60, 239, 26);
		contentPane.add(textField);
		
		JLabel lblFantasia = new JLabel("Fantasia:");
		lblFantasia.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFantasia.setBounds(23, 65, 104, 16);
		contentPane.add(lblFantasia);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(23, 90, 406, 12);
		contentPane.add(separator);
		
		textCEP = new JTextField();
		textCEP.setColumns(10);
		textCEP.setBounds(135, 104, 152, 26);
		contentPane.add(textCEP);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCep.setBounds(23, 109, 104, 16);
		contentPane.add(lblCep);
		
		textEndereco = new JTextField();
		textEndereco.setColumns(10);
		textEndereco.setBounds(135, 130, 294, 26);
		contentPane.add(textEndereco);
		
		JLabel lblEndereco = new JLabel("Endereco:");
		lblEndereco.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEndereco.setBounds(23, 135, 104, 16);
		contentPane.add(lblEndereco);
		
		textNumero = new JTextField();
		textNumero.setColumns(10);
		textNumero.setBounds(135, 163, 90, 26);
		contentPane.add(textNumero);
		
		JLabel lblNmero = new JLabel("Número:");
		lblNmero.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNmero.setBounds(23, 168, 104, 16);
		contentPane.add(lblNmero);
		
		textBairro = new JTextField();
		textBairro.setColumns(10);
		textBairro.setBounds(135, 192, 294, 26);
		contentPane.add(textBairro);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBairro.setBounds(23, 197, 104, 16);
		contentPane.add(lblBairro);
		
		textCidade = new JTextField();
		textCidade.setColumns(10);
		textCidade.setBounds(135, 220, 176, 26);
		contentPane.add(textCidade);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCidade.setBounds(23, 225, 104, 16);
		contentPane.add(lblCidade);
		
		JLabel lblUf = new JLabel("UF:");
		lblUf.setBounds(323, 225, 51, 16);
		contentPane.add(lblUf);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(312, 429, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(194, 429, 117, 29);
		contentPane.add(btnSalvar);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(23, 414, 406, 12);
		contentPane.add(separator_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(135, 258, 162, 26);
		contentPane.add(textField_1);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelefone.setBounds(23, 265, 104, 16);
		contentPane.add(lblTelefone);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(135, 291, 162, 26);
		contentPane.add(textField_2);
		
		JLabel lblCelular = new JLabel("Celular");
		lblCelular.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCelular.setBounds(23, 296, 104, 16);
		contentPane.add(lblCelular);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(23, 250, 406, 12);
		contentPane.add(separator_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"AC", "AL\t ", "AP\t ", "AM\t ", "BA\t ", "CE\t ", "DF\t ", "ES\t ", "GO\t ", "MA\t ", "MT\t ", "MS\t ", "MG\t ", "PA\t ", "PB\t ", "PR\t ", "PE\t ", "PI\t ", "RJ\t ", "RN\t ", "RS\t ", "RO", "RR\t ", "SC\t ", "SP\t ", "SE\t ", "TO"}));
		comboBox.setBounds(345, 221, 84, 27);
		contentPane.add(comboBox);
	}
}
