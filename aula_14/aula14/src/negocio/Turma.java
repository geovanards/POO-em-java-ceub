package negocio;

public class Turma {

    private int id = 0;
    private Disciplina objDisciplina = null;
    private Professor objProfessor = null;
    private String Letra = "";


    
    public Turma() {
    }



    public Turma(int id, Disciplina objDisciplina, Professor objProfessor, String letra) {
        this.id = id;
        this.objDisciplina = objDisciplina;
        this.objProfessor = objProfessor;
        Letra = letra;
    }



    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }



    public Disciplina getObjDisciplina() {
        return objDisciplina;
    }



    public void setObjDisciplina(Disciplina objDisciplina) {
        this.objDisciplina = objDisciplina;
    }



    public Professor getObjProfessor() {
        return objProfessor;
    }



    public void setObjProfessor(Professor objProfessor) {
        this.objProfessor = objProfessor;
    }



    public String getLetra() {
        return Letra;
    }



    public void setLetra(String letra) {
        Letra = letra;
    }



}
