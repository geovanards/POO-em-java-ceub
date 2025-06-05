import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

public class ClienteDAO {
    private BancoDeDados objBanco = new BancoDeDados();
    private PreparedStatement objExecucao = null;
    private ResultSet objCursor = null;

    //metodos da classe
    public Collection<Cliente> getTodos() throws Exception{
        ArrayList<Cliente> colecao = new ArrayList<Cliente>();

        objBanco.conectar();

        objExecucao = objBanco.getObjConexao().prepareStatement("SELECT * FROM cli_cliente");

        objCursor = objExecucao.executeQuery();

        while (objCursor.next()) {
            colecao.add(new Cliente(objCursor.getInt("cli_id"),
                                    objCursor.getString("cli_nome"),
                                    objCursor.getString("cli_cartao")));
                
              }


        objBanco.desconectar();
                    
        return colecao;
        }
}

