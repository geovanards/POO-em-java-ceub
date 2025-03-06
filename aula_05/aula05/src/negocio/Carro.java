package negocio;

public class Carro extends Veiculo {
//Propiedades da classe
    private boolean tetoSolar = false;

    public Carro() {
    }

    
    public Carro(String modelo, Fabricante objFabricante, String cor, boolean tetoSolar) {
        super(modelo,objFabricante,cor);
        this.tetoSolar = tetoSolar;
    }

    public boolean isTetoSolar() {
        return tetoSolar;
    }

    public void setTetoSolar(boolean tetoSolar) {
        this.tetoSolar = tetoSolar;
    }
    
}
