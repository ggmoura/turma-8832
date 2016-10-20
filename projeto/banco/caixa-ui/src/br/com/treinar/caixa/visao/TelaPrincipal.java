package br.com.treinar.caixa.visao;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;

public class TelaPrincipal {

	protected Shell shell;
	private Composite oldView;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			TelaPrincipal window = new TelaPrincipal();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 325);
		shell.setText("Treinar - Banco Caixa");

		buildMenu();

	}

	private void buildMenu() {
		shell.setLayout(new StackLayout());
		Menu menu = new Menu(shell, SWT.BAR);
		shell.setMenuBar(menu);

		Composite viewContaCorrente = new TelaContaCorrente(shell, SWT.NONE);
		oldView = viewContaCorrente;
		Composite viewContaPoupanca = new TelaContaPoupanca(shell, SWT.NONE);

		Composite viewContaSalario = new TelaContaSalario(shell, SWT.NONE);

		Composite viewContaInvestimento = new TelaContaInvestimento(shell, SWT.NONE);

		MenuItem mntmFile = new MenuItem(menu, SWT.CASCADE);
		mntmFile.setText("File");

		Menu menu_1 = new Menu(mntmFile);
		mntmFile.setMenu(menu_1);

		MenuItem mntmSair = new MenuItem(menu_1, SWT.NONE);
		mntmSair.setText("Sair");

		MenuItem mntmBanco = new MenuItem(menu, SWT.CASCADE);
		mntmBanco.setText("Banco");

		Menu menu_2 = new Menu(mntmBanco);
		mntmBanco.setMenu(menu_2);

		MenuItem mntmConta = new MenuItem(menu_2, SWT.CASCADE);
		mntmConta.setText("Conta");

		Menu menu_3 = new Menu(mntmConta);
		mntmConta.setMenu(menu_3);

		MenuItem mntmCorrente = new MenuItem(menu_3, SWT.NONE);
		mntmCorrente.setText("Corrente");
		mntmCorrente.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				showViewConta(viewContaCorrente);
			}
		});
		MenuItem mntmPoupana = new MenuItem(menu_3, SWT.NONE);
		mntmPoupana.setText("Poupança");
		mntmPoupana.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				showViewConta(viewContaPoupanca);
			}
		});

		MenuItem mntmSalrio = new MenuItem(menu_3, SWT.NONE);
		mntmSalrio.setText("Salário");
		mntmSalrio.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				showViewConta(viewContaSalario);
			}
		});

		MenuItem mntmInvestimento = new MenuItem(menu_3, SWT.NONE);
		mntmInvestimento.setText("Investimento");

		mntmInvestimento.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				showViewConta(viewContaInvestimento);
			}
		});
	}

	private void showViewConta(Composite view) {
		oldView.setVisible(Boolean.FALSE);
		view.setVisible(Boolean.TRUE);
		oldView = view;
	}
}
