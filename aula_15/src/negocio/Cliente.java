package negocio;

import java.util.Collection;

import persistencia.ClienteDAO;

public class Cliente {
	
	// Propiedades da classe
	
	private int id = 0;
	private String nome = "";
	private String cartao = "";
	
	// Metodos de acesso da classe 
	
	public Cliente() {
		super();
	}

	public Cliente(int id, String nome, String cartao) {
		super();
		this.id = id;
		this.nome = nome;
		this.cartao = cartao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCartao() {
		return cartao;
	}

	public void setCartao(String cartao) {
		this.cartao = cartao;
	}
	
	// Metodos da classe
	
	public static Collection<Cliente> getTodos() throws Exception{
		return new ClienteDAO().getTodos();
	}
	
}
