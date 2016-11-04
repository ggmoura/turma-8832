package br.com.treinar.agenda.util;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import br.com.treinar.agenda.modelo.TipoTelefone;


public class MensagemTLD extends SimpleTagSupport {

	private String texto;
	
	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		out.println("<h1>");
		out.println(texto);
		out.println("</h1>");
		
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}



}
