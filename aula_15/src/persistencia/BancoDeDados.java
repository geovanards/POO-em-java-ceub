package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

public class BancoDeDados {
	
	// Propiedades  da classe
	private Connection objConexao = null;
	
	// Metodows da Classe 
	Connection getObjConexao() {
		return objConexao;
	}
	
	void conectar() throws Exception {
		objConexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/aula15?"
				+ "user=root&password=ceub123456&"
				+ "serverTimezone=UTC&useSSL=false");
	}
	
	void desconectar()throws Exception{
		objConexao.close();
	}

}
