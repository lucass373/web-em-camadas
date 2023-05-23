package aplicacao.commands;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class AbstractCommand {

		public abstract void processarComando (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException; 
}
