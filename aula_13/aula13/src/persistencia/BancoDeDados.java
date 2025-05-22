package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

public class BancoDeDados {

    private Connection objConexao = null;
    Connection getObjConexao(){
        return objConexao;
    }

    //m da classe
    void conectar() throws Exception{
        objConexao = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/aula13?"+ 
            "user=root&password=ceub123456&"+
            "serverTimezone=UTC&useSSL=false");
    }
    void desconectar() throws Exception{
        objConexao.close();
    }
}
