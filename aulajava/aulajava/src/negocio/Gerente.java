package negocio;

public class Gerente extends Colaborador {
    // Propriedades da classe
    private double bonus = 0;

    // Metodos construtores
    public Gerente() {
        super();
    }

    public Gerente(int matricula, String nome, double salario, double bonus) {
        super(matricula, nome, salario);
        this.bonus = bonus;
    }

    // Getters and Setters
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // Metodos sobrescritos da hierarquia
    public double getSalario() {
        return super.getSalario() + this.getBonus();
    }
}