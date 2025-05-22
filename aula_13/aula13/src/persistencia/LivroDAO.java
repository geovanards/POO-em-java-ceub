package persistencia;

import java.sql.PreparedStatement;

import negocio.Livro;

public class LivroDAO {

    private BancoDeDados objBanco = new BancoDeDados();
    private PreparedStatement objExecucao = null;

    //métodos da classe
    
    public void persistir(Livro objLivro) throws Exception{
        objBanco.conectar();

        objExecucao = objBanco.getObjConexao().prepareStatement("INSERT INTO livro"+
        "(titulo, autor_id)"+
        "VALUES"+
        "(?,?)");

        objExecucao.setString(1, objLivro.getTitulo());
        objExecucao.setInt(2, objLivro.getObjAutor().getId());

        objExecucao.executeUpdate();


        objBanco.desconectar();
    }
}
