package negocio;

import java.util.Collection;

import persistencia.AutorDAO;

public class Autor {
    //pp da classe
    private int id = 0;
    private String nome = "";


    public Autor() {
    }

    public Autor(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
     //metodos de acesso da classe    
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

    //métodos da classe
    public static Collection<Autor>getTodos() throws Exception{
        return new AutorDAO().getTodos();
    }

}
