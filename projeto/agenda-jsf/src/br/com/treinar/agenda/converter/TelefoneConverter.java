package br.com.treinar.agenda.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.treinar.agenda.modelo.Telefone;

@FacesConverter("br.com.treinar.agenda.converter.TelefoneConverter")
public class TelefoneConverter implements Converter {
	
	@Override
	public Object getAsObject(FacesContext facesContext, UIComponent component,
			String value) {
		Telefone t = new Telefone();
		if (value != null && !value.isEmpty()) {
			String dddStr = value.substring(0, 2);
			String numStr = value.substring(2, 11);
			t.setDdd(Integer.parseInt(dddStr));
			t.setNumero(Integer.parseInt(numStr));
		}
		return t;
	}

	@Override
	public String getAsString(FacesContext facesContext, UIComponent component,
			Object value) {
		Telefone t = (Telefone) value;
		String telefoneStr = "";
		if (t.getNumero() != null && t.getDdd() != null) {
			telefoneStr = new StringBuilder().append(t.getDdd()).append(t.getNumero()).toString();
		}
		return telefoneStr;
	}
}