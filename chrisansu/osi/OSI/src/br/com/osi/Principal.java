package br.com.osi;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
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
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import javafx.scene.control.ButtonBar;


public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textEmail;
	private JTable table_1;
	private JScrollPane scrollPane;
	private List<String[]>itens;
	private final DefaultTableModel model;
	

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

		final JComboBox comboBoxSexo = new JComboBox();
		comboBoxSexo.setModel(new DefaultComboBoxModel(new String[] { "Masculino", "Feminino" }));
		comboBoxSexo.setBounds(491, 70, 153, 27);
		contentPane.add(comboBoxSexo);

		Object[] colunas = new Object[] { "#", "Nome", "Email", "Button" };

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
		model = new DefaultTableModel();
		final JTable table_1 = new JTable(model);
		model.addColumn("#");		
		model.addColumn("Nome"); 
		model.addColumn("Email"); 
		model.addColumn("Button"); 


		table_1.setBackground(UIManager.getColor("CheckBox.background"));
		table_1.setBounds(6, 18, 719, 352);
		contentPane.add(table_1);
		
		//table_1.getColumnModel().getColumn(0).setPreferredWidth(45);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(45);
		
		//table_1.getColumn("Button").setCellRenderer(new ButtonRenderer());
		table_1.getColumn("Button").setCellEditor(new ButtonEditor(new JCheckBox()));
	
		
		//cria o scroll da tabela
		final JScrollPane scrollBar = new JScrollPane(table_1);
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
		
		JButton btnNewButton_2 = new JButton("Visualizar registros");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FileSystemView system = FileSystemView.getFileSystemView();
				String path = system.getHomeDirectory().getPath() + java.io.File.separator + "OSI.txt";
				
				try {
					
					FileInputStream is = new FileInputStream(path);//informa aonde esta o arquivo
					//int b = is.read();//quantidade de caractere
				    //is.close();
					InputStreamReader isr = new InputStreamReader(is);//abre o arquivo
					BufferedReader br = new BufferedReader(isr);
					String linha  = br.readLine();//le a primeira linha
					
					
					//JOptionPane.showMessageDialog(null, path);
					
					String texto = "";
					while(linha!=null){
						
						linha = br.readLine();
						texto +="\r\n" + linha;//lendo todas as linhas do arquivo
					}
					br.close();//fecha a porta de leitura
					
					JOptionPane.showMessageDialog(null, texto);
					
					Runtime runtime = Runtime.getRuntime();
					Process process = runtime.exec(path);
					
					
				}
				catch(FileNotFoundException i){
					//x.printStackTrace();
					JOptionPane.showMessageDialog(null, "Atenção: arquivo não enconrado" + path);
				}
				catch (IOException x) {
					
					JOptionPane.showMessageDialog(null, "Atenção:Erro ao ler o arquvio" + path);
				}
			}
		});
		btnNewButton_2.setBounds(16, 355, 183, 29);
		contentPane.add(btnNewButton_2);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//retorno				
				model.getDataVector().removeAllElements();
				itens = new GridConsulta().recuperaraTodos();
				
				for (String[] item : itens) {
					model.addRow(new Object[]{item[0],item[1], item[2]});
				}

			}
		});
		btnAtualizar.setBounds(481, 355, 117, 29);
		contentPane.add(btnAtualizar);

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
				//model.addRow(new Object[]{contador, textNome.getText().toUpperCase().charAt(0), textNome.getText().toUpperCase(), textEmail.getText(), comboBoxSexo.getSelectedItem()});
				
				
				
				//string para gravar no txt em formato para exportacao separador CSV = ;
				String mensagem2 = textNome.getText().toUpperCase() + ";";
				mensagem2 += textEmail.getText() + ";";
				mensagem2 += comboBoxSexo.getSelectedItem() + ";";
				
				//grava em txt os dados informados
				BufferedWriter escreve;
				try {
					
					//pego o caminho que quero gravar o arquivo - desktop
					FileSystemView system = FileSystemView.getFileSystemView();
					String path = system.getHomeDirectory().getPath() + java.io.File.separator + "OSI.txt";
					
					//gravar os arquivos em texto
					escreve = new BufferedWriter(new FileWriter(path, true));
					escreve.write(mensagem2);//toda os campos que quero gravar concatenado
			 		escreve.newLine();//proxima linha
			  		escreve.flush();//liberar memoria 
			  		escreve.close();//fecho o arquivo
			  		
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "Atenção: Erro ao gravar no txt OSI.txt");
				}
				
			
				StringBuilder sql = new StringBuilder();
				sql.append("insert into clientes(RAZAO_SOCIAL, EMAIL)value(?,?)");
				Connection conn = ConexaoJDBC.getInstance().getConnection();
				
				try {
					PreparedStatement stmt = conn.prepareStatement(sql.toString(), Statement.RETURN_GENERATED_KEYS);
					stmt.setString(1, textNome.getText());
					stmt.setString(2, textEmail.getText());
					
					stmt.execute();

					ResultSet rs = stmt.getGeneratedKeys();
					if (rs != null && rs.next()) {
						long id = rs.getLong(1);//PEGO O ID DO REGISTRO INSERIDO
					}
					
					textNome.setText("");
					
					stmt.close();//FECHOU A CONEXAO
					conn.close();
					//MENSAGEM PARA O USUARIO
					JOptionPane.showMessageDialog(null, "Registro gravado com sucesso!");
					
					
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Erro ao gravar registro");
				}
				
				
				model.getDataVector().removeAllElements();
				itens = new GridConsulta().recuperaraTodos();
				
				for (String[] item : itens) {
					model.addRow(new Object[]{item[0], item[1], item[2], "Excluir"});
				}
				
				//volta os campos para default
				textNome.setText("");
				textEmail.setText("");
				comboBoxSexo.setSelectedIndex(0);
				textNome.grabFocus();//foco no campo que eu quero inicar
				
				JScrollBar vertical = scrollBar.getVerticalScrollBar();  
				vertical.setValue(vertical.getMaximum());  //pego a ultima linha do jtable
			}
		});
	}
	
	class ButtonEditor extends DefaultCellEditor {
		protected JButton button;

		private String label;

		private boolean isPushed;

		public ButtonEditor(JCheckBox checkBox) {
			super(checkBox);
			button = new JButton();
			button.setOpaque(true);
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					fireEditingStopped();
				}
			});
		}

		public Component getTableCellEditorComponent(JTable table_1, Object value, boolean isSelected, int row, int column) {
			
			if (isSelected) {
				button.setForeground(table_1.getSelectionForeground());
				button.setBackground(table_1.getSelectionBackground());
			} else {
				button.setForeground(table_1.getForeground());
				button.setBackground(table_1.getBackground());
			}
			
			StringBuilder sql = new StringBuilder();
			sql.append("delete from clientes where id = ?");
			Connection conn = ConexaoJDBC.getInstance().getConnection();
			
			try {
				
				int confirma = JOptionPane.showConfirmDialog(null, "Deseja excluir o registro", "Atenção", JOptionPane.YES_NO_OPTION);
				
				if(confirma == JOptionPane.YES_OPTION){
					
					PreparedStatement stmt = conn.prepareStatement(sql.toString(), Statement.RETURN_GENERATED_KEYS);
					stmt.setString(1, itens.get(row)[0]);
					stmt.execute();

					ResultSet rs = stmt.getGeneratedKeys();
					if (rs != null && rs.next()) {
						long id = rs.getLong(1);//PEGO O ID DO REGISTRO INSERIDO
					}
										
					stmt.close();//FECHOU A CONEXAO
					conn.close();
					//MENSAGEM PARA O USUARIO
					JOptionPane.showMessageDialog(null, "Registro excluido com sucesso!");
					
					model.removeRow(row);//remove a linha excluida					
				}
				
			} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Erro ao excluir registro");
			}
				
			JOptionPane.showMessageDialog(null, itens.get(row)[0]);
			label = (value == null) ? "" : value.toString();
			button.setText(label);
			isPushed = true;
			return button;
		}
		
		
		public Object getCellEditorValue() {
			if (isPushed) {
				//
				//
				//JOptionPane.showMessageDialog(button, label + ": Ouch!");
				// System.out.println(label + ": Ouch!");
			}
			isPushed = false;
			return new String(label);
		}

		public boolean stopCellEditing() {
			isPushed = false;
			return super.stopCellEditing();
		}

		protected void fireEditingStopped() {
			super.fireEditingStopped();
		}
	}
}
