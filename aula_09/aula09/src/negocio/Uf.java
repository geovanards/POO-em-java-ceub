package negocio;

import java.util.ArrayList;
import java.util.Collection;

public class Uf {
    //PROPIEDADES DA CLASSE
    private String sigla = "";

    //metodos construtores da classe
    public Uf() {
    }

    public Uf(String sigla) {
        this.sigla = sigla;
    }

    //metodos de acesso da classe
    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    
    public static Collection<Uf> getTodos() throws Exception {
            ArrayList<Uf> colecao = new ArrayList<Uf>();
        colecao.add(new Uf("AC"));
        colecao.add(new Uf("AM"));
        colecao.add(new Uf("AP"));
        colecao.add(new Uf("BA"));
        colecao.add(new Uf("CE"));
        colecao.add(new Uf("DF"));
        colecao.add(new Uf("SP"));

        return colecao;
    }
}
