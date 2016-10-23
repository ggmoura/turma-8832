package br.com.osi;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textEmail;
	private JTable table_1;
	private JScrollPane scrollPane;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setTitle("OSI - SGO");
		setResizable(false);
		setAutoRequestFocus(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 766, 441);
		setVisible(false);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu File = new JMenu("File");
		menuBar.add(File);

		JMenuItem About = new JMenuItem("About");
		About.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String info = "Desenvolvido por: Chrisansu\r\nTodos os direitos reservados\r\nCopyright 2016."; 
				
				JOptionPane.showMessageDialog(null, info);
			}
		});
		File.add(About);

		JMenuItem Sair = new JMenuItem("Sair");
		Sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (javax.swing.JOptionPane.showConfirmDialog(null, "Deseja sair ?", "ATENÇÂO ",
						javax.swing.JOptionPane.YES_NO_OPTION) == 0) {
					System.exit(EXIT_ON_CLOSE);
				}
			}
		});
		File.add(Sair);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textNome = new JTextField();
		textNome.setBounds(16, 69, 232, 26);
		contentPane.add(textNome);
		textNome.setColumns(10);
		textNome.grabFocus();

		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBackground(new Color(0, 153, 51));
		btnNewButton.setForeground(new Color(0, 0, 0));

		btnNewButton.setBounds(637, 70, 111, 26);
		contentPane.add(btnNewButton);

		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(260, 69, 232, 26);
		contentPane.add(textEmail);
		

		JLabel lblNomeCompleto = new JLabel("Nome completo");
		lblNomeCompleto.setBounds(16, 47, 224, 16);
		contentPane.add(lblNomeCompleto);

		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(260, 47, 224, 16);
		contentPane.add(lblEmail);

		JComboBox comboBoxSexo = new JComboBox();
		comboBoxSexo.setModel(new DefaultComboBoxModel(new String[] { "Masculino", "Feminino" }));
		comboBoxSexo.setBounds(491, 70, 153, 27);
		contentPane.add(comboBoxSexo);

		Object[] colunas = new Object[] { "#", "Nome", "Email", "Telefone", "Sexo", "Turno" };

		// Cria os dados, array com 3 linha e 3 colunas

		Object[][] valores = new Object[2][6];
		for (int i = 0; i < valores.length; i++) {
			
			valores[i][0] =  i + 0;
			valores[i][1] = "linha" + i + " coluna" + 1;
			valores[i][2] = "linha" + i + " coluna" + 2;
			valores[i][3] = "linha" + i + " coluna" + 3;
			valores[i][4] = "linha" + i + " coluna" + 4;
			valores[i][5] = "linha" + i + " coluna" + 5;

		}

		// Cria o JTable
		//table_1 = new JTable(valores, colunas);
		DefaultTableModel model = new DefaultTableModel();
		JTable table_1 = new JTable(model);
		model.addColumn("#");		
		model.addColumn("L"); 
		model.addColumn("Nome"); 
		model.addColumn("Email"); 
		model.addColumn("Sexo"); 
		

		table_1.setBackground(UIManager.getColor("CheckBox.background"));
		table_1.setBounds(6, 18, 719, 352);
		contentPane.add(table_1);
		
		table_1.getColumnModel().getColumn(0).setPreferredWidth(5);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(5);
		table_1.getColumnModel().getColumn(2).setPreferredWidth(100);
		table_1.getColumnModel().getColumn(3).setPreferredWidth(200);
		table_1.getColumnModel().getColumn(4).setPreferredWidth(60);
		
		//cria o scroll da tabela
		JScrollPane scrollBar = new JScrollPane(table_1);
		scrollBar.setToolTipText("Lista de alunos");
		scrollBar.setBounds(16, 116, 732, 233);
		contentPane.add(scrollBar, BorderLayout.CENTER);
		
		

		// contentPane.add(table_1);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 98, 742, 12);
		contentPane.add(separator);

		JLabel lblListaDeAlunos = new JLabel("LISTA DE ALUNOS CADASTRADOS");
		lblListaDeAlunos.setFont(new Font("Lucida Grande", Font.BOLD, 23));
		lblListaDeAlunos.setBounds(6, 8, 518, 26);
		contentPane.add(lblListaDeAlunos);

		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(496, 47, 224, 16);
		contentPane.add(lblSexo);

		JButton btnNewButton_1 = new JButton("Último registro");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JScrollBar vertical = scrollBar.getVerticalScrollBar();  
				vertical.setValue(vertical.getMaximum());  
			}
		});
		btnNewButton_1.setBounds(610, 355, 139, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Abrir TXT");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String comando = "OSI.txt";
				try {
					 Runtime.getRuntime().exec(":c:\\OSI.txt");
				}
				catch (IOException x) {
					//x.printStackTrace();
					JOptionPane.showMessageDialog(null, "Atenção:Erro ao abrir arquvio OSI.txt");
					
				}
			}
		});
		btnNewButton_2.setBounds(16, 355, 117, 29);
		contentPane.add(btnNewButton_2);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textNome.setBackground(Color.WHITE);
				textEmail.setBackground(Color.WHITE);
				
				
				//VALIDA O NOME
				if (textNome.getText().equals("")) {
					textNome.setBackground(Color.YELLOW);
				
					JOptionPane.showMessageDialog(null, "Informe o Nome do aluno");
					textNome.grabFocus();
					return;
				}
				
				//VALIDA O EMAIL
				if (textEmail.getText().equals("")) {
					textEmail.setBackground(Color.YELLOW);
				
					JOptionPane.showMessageDialog(null, "Informe o Email do aluno");
					textEmail.grabFocus();
					return;
				}

				//JOptionPane.showMessageDialog(null, mensagem);
				
				
				
				int contador = table_1.getModel().getRowCount();
				
				//monta os dados digidados no grid
				model.addRow(new Object[]{contador, textNome.getText().toUpperCase().charAt(0), textNome.getText().toUpperCase(), textEmail.getText(), comboBoxSexo.getSelectedItem()});
				
				//string para gravar no txt em formato para exportacao separador CSV = ;
				String mensagem2 = textNome.getText() + ";";
				mensagem2 += textEmail.getText() + ";";
				mensagem2 += comboBoxSexo.getSelectedItem() + ";";
				
				//grava em txt os dados informados
				BufferedWriter escreve;
				try {
					escreve = new BufferedWriter(new FileWriter(":c:\\OSI.txt", true));
					escreve.write(mensagem2);
			 		escreve.newLine();
			  		escreve.flush();
			  		escreve.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "Atenção: Erro ao gravar no txt OSI.txt");
				}
		 		
			 
				
				
				textNome.setText("");
				textEmail.setText("");
				comboBoxSexo.setSelectedIndex(0);
				textNome.grabFocus();
				
				JScrollBar vertical = scrollBar.getVerticalScrollBar();  
				vertical.setValue(vertical.getMaximum());  
			}
		});
	}
}
