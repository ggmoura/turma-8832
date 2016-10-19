package br.com.treinar.caixa.visao;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.wb.swt.SWTResourceManager;

public class TelaCadastroContaCorrente extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public TelaCadastroContaCorrente(Composite parent, int style) {
		super(parent, style);
		setLayout(new FillLayout(SWT.VERTICAL));
		
		Composite titulo = new Composite(this, SWT.BORDER);
		titulo.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Label lblCadastroContaCorrente = new Label(titulo, SWT.CENTER);
		lblCadastroContaCorrente.setFont(SWTResourceManager.getFont("Segoe UI", 14, SWT.NORMAL));
		lblCadastroContaCorrente.setText("Cadastro Conta Corrente");
		
		Composite main = new Composite(this, SWT.NONE);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
