package negocio;

public class Cadeira {
    //propiedades da classe
    String nome = "";

    //métodos construtores da classe
    public Cadeira() {
    }

    public Cadeira(String nome) {
        this.nome = nome;
    }
    
    //métodos de acesso da classe
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
