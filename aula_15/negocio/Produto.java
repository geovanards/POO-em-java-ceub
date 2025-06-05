import java.util.Collection;

public class Produto {



	// Propiedades da classe

	private int id = 0;

	private String nome = "";

	private double preco = 0;

	

	// Metodos de acesso da classe

	

	public Produto() {

		super();

	}



	public Produto(int id, String nome, double preco) {

		super();

		this.id = id;

		this.nome = nome;

		this.preco = preco;

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



	public double getPreco() {

		return preco;

	}



	public void setPreco(double preco) {

		this.preco = preco;
    }
	
	public static Collection<Produto> getTodos() throws Exception{
		return new ProdutoDAO().getTodos();
	}
}