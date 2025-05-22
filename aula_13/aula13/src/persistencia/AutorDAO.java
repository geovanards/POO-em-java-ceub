package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import negocio.Autor;

public class AutorDAO {
    private BancoDeDados objBanco = new BancoDeDados();
    private PreparedStatement objExecucao = null;
    private ResultSet ObjCursor = null;

    //metodos da classe

    public Collection<Autor> getTodos() throws Exception{
        ArrayList<Autor> colecao = new ArrayList<Autor>();

        // obs.:Preprared preapara o "prepare"
        objBanco.conectar();
        objExecucao = objBanco.getObjConexao().prepareStatement("SELECT * FROM autor");
        ObjCursor = objExecucao.executeQuery();

        while (ObjCursor.next()){
            colecao.add(new Autor(  ObjCursor.getInt("id_autor"),
                                    ObjCursor.getString("nome")));
        }

        objBanco.desconectar();

        return colecao;
    }
}    
