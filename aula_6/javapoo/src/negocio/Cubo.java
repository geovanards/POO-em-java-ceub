package negocio;

public class Cubo implements Solido {
//propiedades da classe

    private double aresta = 0;

//costrutores
    public Cubo() {
    }

    public Cubo(double aresta) {
        this.aresta = aresta;
    }

// metodos de acesso da classe
    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }
    
    //métodos implementados da interface
    public double calcularArea(){
        return(6 * Math.pow(getAresta(), 2));
    }

    public double calcularVolume(){
        return(Math.pow(getAresta(), 3));
    }
}
