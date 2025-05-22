package negocio;

import persistencia.LivroDAO;

public class Livro {

    private int id = 0;
    private String titulo = "";
    private Autor objAutor = null;

    public Livro() {
    }

    public Livro(int id, String titulo, Autor objAutor) {
        this.id = id;
        this.titulo = titulo;
        this.objAutor = objAutor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getObjAutor() {
        return objAutor;
    }

    public void setObjAutor(Autor objAutor) {
        this.objAutor = objAutor;
    }

    //métodos de acesso
    public void persistir() throws Exception{
        new LivroDAO().persistir(this);
    }
}
