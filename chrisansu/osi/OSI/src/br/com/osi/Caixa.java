package br.com.osi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.UIManager;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import java.awt.Window.Type;

public class Caixa extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Caixa frame = new Caixa();
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
	public Caixa() {
		setTitle("Caixa");
		setType(Type.POPUP);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 827, 438);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArquivo = new JMenu("Arquivo");
		menuBar.add(mnArquivo);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(23, 154, 118, 41);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setEnabled(false);
		textField_1.setColumns(10);
		textField_1.setBounds(19, 15, 788, 41);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(153, 154, 118, 41);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(23, 92, 322, 41);
		contentPane.add(textField_3);
		
		JLabel lblDescrio = new JLabel("Descrição / Código barrra");
		lblDescrio.setBounds(28, 75, 317, 16);
		contentPane.add(lblDescrio);
		
		JLabel lblQtde = new JLabel("Qtde");
		lblQtde.setBounds(27, 136, 109, 16);
		contentPane.add(lblQtde);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setBounds(157, 136, 109, 16);
		contentPane.add(lblValor);
		
		Object[] colunas = new Object[] { "#", "Cod", "Descricao", "Qtde", "Unit", "Total" };

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
		model.addColumn("Cod"); 
		model.addColumn("Desc"); 
		model.addColumn("Qtde"); 
		model.addColumn("Unit"); 
		model.addColumn("Total"); 
		

		table_1.setBackground(UIManager.getColor("CheckBox.background"));
		table_1.setBounds(6, 18, 719, 352);
		contentPane.add(table_1);
		
		table_1.getColumnModel().getColumn(0).setPreferredWidth(5);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(5);
		table_1.getColumnModel().getColumn(2).setPreferredWidth(100);
		table_1.getColumnModel().getColumn(3).setPreferredWidth(10);
		table_1.getColumnModel().getColumn(4).setPreferredWidth(10);
		table_1.getColumnModel().getColumn(4).setPreferredWidth(10);
		
		//cria o scroll da tabela
		JScrollPane scrollBar = new JScrollPane(table_1);
		scrollBar.setToolTipText("Lista de alunos");
		scrollBar.setBounds(353, 68, 454, 260);
		contentPane.add(scrollBar, BorderLayout.CENTER);
	}
}
