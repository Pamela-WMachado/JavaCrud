package utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	
	//metodo para retornar a conexao
	public static Connection Conectar() {
		//classe para se conectar com o banco de dados
		Connection con = null;
		
		//inserir dados do db credentials
		//url: jdbc:postgresql:// + host + port + database
		String url = "jdbc:postgresql://ec2-54-164-40-66.compute-1.amazonaws.com:5432/deuf4vuq2pvkp";
		String user = "qtuvnqejcbhrqp";
		String password = "e52bc8ceb7b36e460de273382ea407288fd9c6212a2e3bf0006077a02e24d875";
		
		//classe de conexao
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
