package negocio;

import persistencia.CompraDAO;

public class Compra {
	
	// Propiedades da classe
	private int id = 0;
	private Produto objProduto = null;
	private Cliente objCliente = null;
	private String date = "";
	private int quantidade = 0;
	
	public Compra() {
		super();
	}

	public Compra(int id, Produto objProduto, Cliente objCliente, String date, int quantidade) {
		super();
		this.id = id;
		this.objProduto = objProduto;
		this.objCliente = objCliente;
		this.date = date;
		this.quantidade = quantidade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Produto getObjProduto() {
		return objProduto;
	}

	public void setObjProduto(Produto objProduto) {
		this.objProduto = objProduto;
	}

	public Cliente getObjCliente() {
		return objCliente;
	}

	public void setObjCliente(Cliente objCliente) {
		this.objCliente = objCliente;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	// Metodos da classe
	
	public String getDataParaBancoDeDados() {
		return getDate().substring(6, 10) + "-" +
				getDate().substring(3, 5) + "-" +
				getDate().substring(0, 2);
		
	}
	
	public void persistir() throws Exception {
		new CompraDAO().persistir(this);
	}

}
