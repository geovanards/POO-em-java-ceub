package negocio;

import java.util.Collection;

public class Disciplina {

    private int id = 0;
    private String  nome = "";
    public Disciplina() {
    }

    
    public Disciplina(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public static Collection<Disciplina> getTodos () throws Exception{
        return new Disciplina().getTodos();
    }


    public int getLetra() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLetra'");
    }
}
