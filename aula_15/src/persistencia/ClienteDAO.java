package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import negocio.Cliente;

public class ClienteDAO {
	
	// Propiedades da classe
	private BancoDeDados objBanco = new BancoDeDados();
	private PreparedStatement objExecucao = null;
	private ResultSet objCursor = null;
	
	// Metodos da classe
	public Collection<Cliente> getTodos() throws Exception{
		ArrayList<Cliente> colecao = new ArrayList<Cliente>();
		
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement(
												"SELECT * FROM cli_cliente");
		objCursor = objExecucao.executeQuery();
		
		while (objCursor.next()) {
			colecao.add(new Cliente(objCursor.getInt("cli_ID"),
									objCursor.getString("cli_nome"),
									objCursor.getString("cli_cartao")));		
		}
		
		objBanco.desconectar();
		
		return colecao;
	}
}
