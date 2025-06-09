package persistencia;

import java.sql.PreparedStatement;

import negocio.Compra;

public class CompraDAO {
	
	// Propiedades da classe
	private BancoDeDados objBanco = new BancoDeDados();
	private PreparedStatement objExecucao = null;
	
	// Metodos da classe 
	
	public void persistir(Compra objCompra) throws Exception{
		
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement(
											"INSERT INTO CMP_COMPRA" +
											"(CMP_IDPRODUTO, CMP_IDCLIENTE, CMP_DATA, CMP_QUANTIDADE)" +
											"VALUES" +
											"(?, ?, ?, ?)");
		
		objExecucao.setInt(1, objCompra.getObjProduto().getId());
		objExecucao.setInt(2, objCompra.getObjCliente().getId());
		objExecucao.setString(3, objCompra.getDataParaBancoDeDados());
		objExecucao.setInt(4, objCompra.getQuantidade());
		
		objExecucao.executeUpdate();
		
		objBanco.desconectar();
		
	}

}
