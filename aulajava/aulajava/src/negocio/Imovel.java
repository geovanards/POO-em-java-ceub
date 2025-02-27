package negocio;

public abstract class Imovel {
    //propiedades da classe
    private String endereco = "";
    private double metragem = 0;
    private double valor = 0;

//construtores
     public Imovel() {
    }
    
//metodos de acesso
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public double getMetragem() {
        return metragem;
    }
    public void setMetragem(double metragem) {
        this.metragem = metragem;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

}
