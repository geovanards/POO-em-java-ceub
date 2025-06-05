import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

public class ProdutoDAO {
    private BancoDeDados objBanco = new BancoDeDados();
    private PreparedStatement objExecucao = null;
    private ResultSet objCursor = null;

    //metodos da classe
    public Collection<Produto> getTodos() throws Exception{
        ArrayList<Produto> colecao = new ArrayList<Produto>();

        objBanco.conectar();

        objExecucao = objBanco.getObjConexao().prepareStatement("SELECT * FROM prd_produto");

        objCursor = objExecucao.executeQuery();

        while (objCursor.next()) {
            colecao.add(new Produto(objCursor.getInt("prd_id"),
                                    objCursor.getString("prd_nome"),
                                    objCursor.getDouble("prd_preco")));
                
              }


        objBanco.desconectar();
                    return colecao;
        }
}
