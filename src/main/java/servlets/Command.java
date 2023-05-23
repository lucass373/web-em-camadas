package servlets;

import java.io.IOException;
import java.util.Hashtable;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aplicacao.commands.AbstractCommand;
import aplicacao.commands.ContaListar;

/**
 * Servlet implementation class for Servlet: Command
 *
 */
public class Command extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {

	private Hashtable comandos = new Hashtable();

	public Command() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Recebe o nome do comando a ser executado na Camada de Aplicação !!!
		String comando = request.getParameter("comando");

		AbstractCommand command = (AbstractCommand) comandos.get(comando);
		System.out.println("Vou chamar:" + command.getClass());
		command.processarComando(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	
	public void init() throws ServletException {
		super.init();

		ContaListar comandoContaListar = new ContaListar();
		comandos.put("ContaListar", comandoContaListar);

	}
}