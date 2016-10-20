package br.com.treinar.caixa.visao;

import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;

import br.com.treinar.caixa.util.Constante;
import swing2swt.layout.BorderLayout;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Table;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.layout.TableColumnLayout;

public class TelaContaPoupanca extends Composite {
	private Table table;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public TelaContaPoupanca(Composite parent, int style) {
		super(parent, style);
		setLayout(new BorderLayout(0, 0));
		
		Composite titulo = new CompositeTitle(this, SWT.NONE, Constante.TituloTela.TITULO_CONTA_POUPANCA);

		Composite actions = new Composite(this, SWT.NONE);
		actions.setLayoutData(BorderLayout.SOUTH);
		actions.setLayout(new RowLayout(SWT.HORIZONTAL));
		
		
		Composite main = new Composite(this, SWT.NONE);
		main.setLayoutData(BorderLayout.CENTER);
		main.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Composite composite = new Composite(main, SWT.NONE);
		composite.setLayout(new TableColumnLayout());
		
		TableViewer tableViewer = new TableViewer(composite, SWT.BORDER | SWT.FULL_SELECTION);
		table = tableViewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		loadDataTable(table);
	}

	private void loadDataTable(Table table) {
		table.setData("A", "teste");
		String[] i = {"a", "b"};
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
