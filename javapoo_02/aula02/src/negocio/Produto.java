package negocio;

public class Produto {
	public String nome = "";
	private Estante objEstante = null;
	private int quantidade = 0;
	
	public Produto() {
		super();
	}

	public Produto(String nome, int quantidade, Estante objEstante) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
		this.objEstante = objEstante;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public Estante getObjEstante() {
		return objEstante;
	}

	public void setObjEstante(Estante objEstante) {
		this.objEstante = objEstante;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	
	
}
