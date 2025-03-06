package negocio;

public class Moto extends Veiculo {
    //pp da classe
    private int cinlidro = 0;

    public Moto (){
        
    }
    public Moto(int cinlidro) {
        this.cinlidro = cinlidro;
    }

    public Moto(String modelo, Fabricante objFabricante, String cor, int cinlidro) {
        super(modelo, objFabricante, cor);
        this.cinlidro = cinlidro;
    }
    
    public int getCinlidro() {
        return cinlidro;
    }
    public void setCinlidro(int cinlidro) {
        this.cinlidro = cinlidro;
    }
    
}
