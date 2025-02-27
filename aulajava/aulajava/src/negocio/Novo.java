package negocio;

public class Novo extends Imovel {
//propiedades de classe
    private double adicional = 0;

    public Novo() {
    }

    public Novo(double adicional) {
        this.adicional = adicional;
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }
    
    //Métodos dsobrescritos da hierarquia

    public double getValor(){
        return(super.getValor() + this.getAdicional());

    }
    
}
