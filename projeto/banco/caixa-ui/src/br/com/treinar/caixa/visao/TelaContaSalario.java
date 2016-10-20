package br.com.treinar.caixa.visao;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;

import swing2swt.layout.BorderLayout;
import br.com.treinar.caixa.util.Constante;

public class TelaContaSalario extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public TelaContaSalario(Composite parent, int style) {
		super(parent, style);
		setLayout(new BorderLayout(0, 0));
		
		Composite titulo = new CompositeTitle(this, SWT.NONE, Constante.TituloTela.TITULO_CONTA_SALARIO);

		Composite actions = new Composite(this, SWT.NONE);
		actions.setLayoutData(BorderLayout.SOUTH);
		actions.setLayout(new RowLayout(SWT.HORIZONTAL));
		
		
		Composite main = new Composite(this, SWT.NONE);
		main.setLayoutData(BorderLayout.CENTER);
		main.setLayout(new GridLayout(2, false));

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
