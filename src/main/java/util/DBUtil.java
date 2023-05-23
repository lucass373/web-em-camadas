package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBUtil 
{
	private static Connection con;
	
	public static Connection getConnection()
	{
		// Se a conexão existe ainda
		if (con == null)
		{
			try
			{
				// Carrega a classe do driver JDBC   
				Class.forName("org.postgresql.Driver");   
		    
				// Cria uma conex�o atrav�s do Driver   
				con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/academicNet","postgres","adsumus");
			}
			catch(ClassNotFoundException e)
			{
				System.out.println("O driver não foi importado");
				e.printStackTrace();
			}
			catch(SQLException e)
			{
				System.out.println("Erro de conexão com o banco");
				e.printStackTrace();
			}
		}
		
		// Retorna a conexão
		return con;
	}
}