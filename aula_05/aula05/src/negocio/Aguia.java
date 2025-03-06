package negocio;

public class Aguia extends Ave {
private double autonomia = 0;

public Aguia() {
}

public Aguia(double autonomia) {
    this.autonomia = autonomia;
}

public Aguia(int quantidadeOvos, double autonomia) {
    super(quantidadeOvos);
    this.autonomia = autonomia;
}

public Aguia(double peso, double altura, String nome, int quantidadeOvos, double autonomia) {
    super(peso, altura, nome, quantidadeOvos);
    this.autonomia = autonomia;
}

public double getAutonomia() {
    return autonomia;
}

public void setAutonomia(double autonomia) {
    this.autonomia = autonomia;
}
public void voar(){
    System.out.println("Fly like aan eagle ! Into the future");
}
}
