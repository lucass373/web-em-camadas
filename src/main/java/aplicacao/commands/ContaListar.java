package aplicacao.commands;



import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dominio.business.Contas;

public class ContaListar extends AbstractCommand {

	public void processarComando(HttpServletRequest request, HttpServletResponse response) throws IOException {

		
		ServletOutputStream out = response.getOutputStream();
		
		ArrayList<Contas> contas = new ArrayList<Contas>();
		
		Contas c1 = new Contas();
		c1.setNumero(1);
		c1.setSaldo(10);
		c1.setNomeTitular("Joao");
		c1.setCpfTitular("111.111.111-11");
		
		Contas c2 = new Contas();
		c2.setNumero(2);
		c2.setSaldo(1900);
		c2.setNomeTitular("Pedro augusto");
		c2.setCpfTitular("222.222.222-22");
		
		Contas c3 = new Contas();
		c3.setNumero(3);
		c3.setSaldo(-1000);
		c3.setNomeTitular("zezinho");
		c3.setCpfTitular("333.333.333-33");
		
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);


		
		out.println("<P ALIGN='center'><TABLE BORDER=1>");

		out.println("<TR>");
		out.println("<TH>NUMERO</TH>");
		out.println("<TH>NOME TITULAR</TH>");
		out.println("<TH>SALDO</TH>");
		out.println("<TH>CPF TITULAR</TH>");
		
			
		out.println("</TR>"); // colocando os dados na tabela
		
		Iterator<Contas> itContas= contas.iterator();
		
		while (itContas.hasNext()) {

			Contas umaConta= itContas.next();
			
			out.println("<TR>");

				out.println("<TD>" + umaConta.getNumero() + "</TD>");
				out.println("<TD>" + umaConta.getNomeTitular() + "</TD>");
				out.println("<TD>" + umaConta.getSaldo() + "</TD>");
				out.println("<TD>" + umaConta.getCpfTitular() + "</TD>");
				
			out.println("</TR>");

		}
		
		out.println("</TABLE></P>");
	
	
	}

}

