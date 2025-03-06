package negocio;

public abstract class Animal {
    //pp da classe
    private double peso = 0;
    private double altura = 0;
    private String nome ="";
    
    //construtores
    public Animal() {
    }
    public Animal(double peso, double altura, String nome) {
        this.peso = peso;
        this.altura = altura;
        this.nome = nome;
    }
    //acesso da classe
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double calcularIMC(){
        return(getPeso()/(Math.pow(getAltura(), 2)));
    }
}
