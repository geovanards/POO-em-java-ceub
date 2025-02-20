package negocio;

public class Tipo {
    //Propiedades de classe
    private String descricao = "";
    
    public Tipo() {
    }
    public String getDescricao() {
        return descricao;
    }
    

    public Tipo(String descricao) {
        this.descricao = descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
