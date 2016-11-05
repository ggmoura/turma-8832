package br.com.treinar.agenda.listener;

import java.util.Arrays;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import br.com.treinar.agenda.modelo.Sexo;
import br.com.treinar.agenda.modelo.TipoTelefone;

/**
 * Application Lifecycle Listener implementation class AgendaListener
 *
 */
@WebListener
public class AgendaListener implements ServletContextListener {

	/**
	 * Default constructor.
	 */
	public AgendaListener() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 */
	public void contextDestroyed(ServletContextEvent sce) {
		System.err.println("O projeto agenda-web está sendo finalizado...");
	}

	/**
	 * @see ServletContextListener#contextInitialized(ServletContextEvent)
	 */
	public void contextInitialized(ServletContextEvent sce) {
		sce.getServletContext().setAttribute("tiposTelefone", Arrays.asList(TipoTelefone.values()));
		sce.getServletContext().setAttribute("sexos", Arrays.asList(Sexo.values()));
		System.err.println("O projeto agenda-web está sendo inicializado...");
	}

}
