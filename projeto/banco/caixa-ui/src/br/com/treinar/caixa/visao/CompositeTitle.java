package br.com.treinar.caixa.visao;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;

import swing2swt.layout.BorderLayout;

public class CompositeTitle extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public CompositeTitle(Composite parent, int style, String titulo) {
		super(parent, style);
		this.setFont(SWTResourceManager.getFont("Segoe UI", 15, SWT.NORMAL));
		this.setLayoutData(BorderLayout.NORTH);
		this.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Label lblNewLabel = new Label(this, SWT.NONE);
		lblNewLabel.setFont(SWTResourceManager.getFont("Segoe UI", 15, SWT.NORMAL));
		lblNewLabel.setAlignment(SWT.CENTER);
		lblNewLabel.setText(titulo);
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
