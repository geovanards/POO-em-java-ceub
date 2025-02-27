package negocio;

public class Usado extends Imovel{
    //Propiedades de classe

    private double depreciacao = 0;

    public Usado() {
    }

    public Usado(double depreciacao) {
        this.depreciacao = depreciacao;
    }

    public double getDepreciacao() {
        return depreciacao;
    }

    public void setDepreciacao(double depreciacao) {
        this.depreciacao = depreciacao;
    }
    //metodos sobrescritos de hierarquia

    public double getValor(){
        return super.getValor() - this.getDepreciacao();
    }

}