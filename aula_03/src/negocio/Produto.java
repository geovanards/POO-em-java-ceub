package negocio;

public class Produto {
    //Propiedades de classe

    private String nome = ""; 
    private Tipo objTipo = null;
    private double preco = 0;


    //construtores de classe
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    //métodos de acesso da classe
    public Tipo getObjTipo() {
        return objTipo;
    }
    public void setObjTipo(Tipo objTipo) {
        this.objTipo = objTipo;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
