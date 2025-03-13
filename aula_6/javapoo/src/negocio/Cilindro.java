package negocio;

public class Cilindro implements Solido {
    //propiedades da classe
    private double raio = 0;
    private double altura = 0;
    
    //construtores
    public Cilindro() {
    }
    public Cilindro(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    //métodos de acesso
    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    //métodos implementados da interface
    public double calcularArea(){
        return(2 * Math.PI * Math.pow(getRaio(), 2)+ 2 * Math.PI * getRaio()* getAltura());
    }
    public double calcularVolume(){
        return(Math.PI * Math.pow(getRaio(), 2)* getAltura());
    }
}
