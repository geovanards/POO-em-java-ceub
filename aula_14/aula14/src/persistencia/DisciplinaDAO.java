package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.LinkedList;

import negocio.Disciplina;

public class DisciplinaDAO {

    private BancoDeDados objBanco = new BancoDeDados();
    private PreparedStatement objExecucao = null;
    private ResultSet objCursor = null;

    public Collection<Disciplina> getTodos() throws Exception{
        LinkedList<Disciplina> colecao = new LinkedList<Disciplina>();

        objBanco.conectar();

        objExecucao = objBanco.getObjConexao().prepareStatement("SELECT * FROM DIS_DISCIPLINA");

        objCursor = objExecucao.executeQuery();

        while (objCursor.next()) {
            colecao.add(new Disciplina(objCursor.getInt("DIS_ID"),objCursor.getString("DIS_NOME")));

        }

        objBanco.desconectar();

        return colecao;
    }
}
