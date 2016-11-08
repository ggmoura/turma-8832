package br.com.treinar.agenda.validator;

import java.util.Arrays;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import br.com.treinar.agenda.modelo.Telefone;

@FacesValidator("br.com.treinar.agenda.validator.TelefoneValidator")
public class TelefoneValidator implements Validator {

	private List<Integer> dddsValidos;

	public TelefoneValidator() {
		dddsValidos = Arrays.asList(11, 21, 31, 41, 51);

		// dddsValidos = new ArrayList<Integer>();
		// dddsValidos.add(11);
		// dddsValidos.add(21);
		// dddsValidos.add(31);
		// dddsValidos.add(41);
		// dddsValidos.add(51);
	}

	@Override
	public void validate(FacesContext context, UIComponent component,
			Object value) throws ValidatorException {
		if (value != null) {
			Telefone telefone = (Telefone) value;
			if (!dddsValidos.contains(telefone.getDdd())) {
				FacesMessage msg = new FacesMessage("DDD Inválido",
						"DDD informado nao pertence ao dominio da aplicação");
				msg.setSeverity(FacesMessage.SEVERITY_ERROR);
				throw new ValidatorException(msg);
			}
		}
	}

}
