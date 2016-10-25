package br.com.treinar.caixa.visao;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import swing2swt.layout.BorderLayout;
import br.com.treinar.caixa.modelo.ContaCorrente;
import br.com.treinar.caixa.modelo.Pessoa;
import br.com.treinar.caixa.modelo.exception.AppException;
import br.com.treinar.caixa.service.IPersistencia;
import br.com.treinar.caixa.service.StorageMemoria;

public class TelaContaCorrente extends Composite {
	private Text numeroConta;
	private Text agencia;
	private Text saldo;
	private Text nomeTitular;
	private Text cpfTitular;
	private Text taxaManutencao;
	private Text limiteCredito;
	private IPersistencia persistencia;
	
	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public TelaContaCorrente(Composite parent, int style) {
		super(parent, style);
		persistencia = StorageMemoria.getInstance();
		setLayout(new BorderLayout(0, 0));
		
		Composite titulo = new CompositeTitle(this, SWT.NONE, "Cadastro de Conta Corrente");

		Composite actions = new Composite(this, SWT.NONE);
		actions.setLayoutData(BorderLayout.SOUTH);
		actions.setLayout(new RowLayout(SWT.HORIZONTAL));
		
		Button btnNewButton = new Button(actions, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ContaCorrente contaCorrente = new ContaCorrente();
				contaCorrente.setNumeroConta(Integer.parseInt(numeroConta.getText()));
				contaCorrente.setAgencia(Integer.parseInt(agencia.getText()));
				try {
					contaCorrente.depositar(Double.parseDouble(saldo.getText()));
				} catch (AppException e1) {
					System.out.println("Erro ao depositar...");
				}
				contaCorrente.setPessoa(new Pessoa());
				contaCorrente.getPessoa().setNome(nomeTitular.getText());
				contaCorrente.getPessoa().setCpf(Long.parseLong(cpfTitular.getText()));
				contaCorrente.setTaxaManutencao(Double.valueOf(taxaManutencao.getText()));
				contaCorrente.setLimiteCredito(Double.parseDouble(limiteCredito.getText()));
				persistencia.salvar(contaCorrente);
			}
		});
		btnNewButton.setText("Salvar");
		
		Button btnLimpar = new Button(actions, SWT.NONE);
		btnLimpar.setText("Limpar");
		btnLimpar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				numeroConta.setText("");
				agencia.setText("");
				saldo.setText("");
				nomeTitular.setText("");
				cpfTitular.setText("");
				taxaManutencao.setText("");
				limiteCredito.setText("");
				numeroConta.forceFocus();
			}
		});
		
		Composite main = new Composite(this, SWT.NONE);
		main.setLayoutData(BorderLayout.CENTER);
		main.setLayout(new GridLayout(2, false));
		new Label(main, SWT.NONE);
		new Label(main, SWT.NONE);
		
		Label lblNumero = new Label(main, SWT.NONE);
		lblNumero.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNumero.setText("Numero");
		
		numeroConta = new Text(main, SWT.BORDER);
		numeroConta.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblAgencia = new Label(main, SWT.NONE);
		lblAgencia.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblAgencia.setText("Agencia");
		
		agencia = new Text(main, SWT.BORDER);
		agencia.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_1 = new Label(main, SWT.NONE);
		lblNewLabel_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_1.setText("Saldo");
		
		saldo = new Text(main, SWT.BORDER);
		saldo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblTitular = new Label(main, SWT.NONE);
		lblTitular.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblTitular.setText("Titular");
		
		nomeTitular = new Text(main, SWT.BORDER);
		nomeTitular.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblCpf = new Label(main, SWT.NONE);
		lblCpf.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblCpf.setText("CPF");
		
		cpfTitular = new Text(main, SWT.BORDER);
		cpfTitular.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyReleased(KeyEvent e) {
				int qtdCaracteres = cpfTitular.getText().length();
				try {
					Long.parseLong(String.valueOf(e.character));
				} catch (Exception e2) {
					if (qtdCaracteres >= 1) {
						String novoCPF = cpfTitular.getText().substring(0, qtdCaracteres - 1);
						cpfTitular.setText(novoCPF);						
					} else {
						cpfTitular.setText("");
					}
				}
				qtdCaracteres = cpfTitular.getText().length();
				switch (qtdCaracteres) {
				case 3:
					cpfTitular.setText(cpfTitular.getText() + ".");
					break;
				case 7:
					cpfTitular.setText(cpfTitular.getText() + ".");
					break;
				case 11:
					cpfTitular.setText(cpfTitular.getText() + "-");
					break;
				default:
					break;
				}
				if (qtdCaracteres > 14) {
					cpfTitular.setText(cpfTitular.getText().substring(0, 14));
				}
			}
		});
		cpfTitular.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblTaxaDeManuteno = new Label(main, SWT.NONE);
		lblTaxaDeManuteno.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblTaxaDeManuteno.setText("Taxa de Manutenção");
		
		taxaManutencao = new Text(main, SWT.BORDER);
		taxaManutencao.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel = new Label(main, SWT.NONE);
		lblNewLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel.setText("Limite de Crédito");
		
		limiteCredito = new Text(main, SWT.BORDER);
		limiteCredito.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
