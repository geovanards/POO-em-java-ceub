package negocio;

public class Professor {

    private int id = 0;
    private String nome = "";
    private String titulacao = "";
    
    public Professor() {
    }
    public Professor(int id, String nome, String titulacao) {
        this.id = id;
        this.nome = nome;
        this.titulacao = titulacao;
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
    public String getTitulacao() {
        return titulacao;
    }
    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
    
}
