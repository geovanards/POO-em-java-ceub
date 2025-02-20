package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Aluno;
import negocio.Cadeira;
import negocio.Professor;
import negocio.Turma;

public class VisaoEscola {
    public static void main(String[] args) {
        //delcaração de variáveis
        BufferedReader leitor = new BufferedReader( new InputStreamReader(System.in));
        Turma objTurma = new Turma();
        Professor objProfessor = new Professor();

        //Entrada de dados
        try {
            System.out.println("Digite o nome da cadeira: ");
            objTurma.setObjCadeira(new Cadeira(leitor.readLine()));

            System.out.println("Digite o nome do professor: ");
            objProfessor.setTitulo(leitor.readLine());

            System.out.println("Digite a titulação do professor: ");
            objProfessor.setTitulo(leitor.readLine());

            System.out.println("Digite o salário do professor: ");
            objProfessor.setSalario(Double.parseDouble(leitor.readLine()));

            do{
                Aluno objAluno = new Aluno();

                System.out.println("Digite a matrícula do aluno: ");
                objAluno.setMatricula(Integer.parseInt(leitor.readLine()));
                
                System.out.println("Digite o nome do aluno: ");
                objAluno.setNome(leitor.readLine());
                
                objTurma.adicionarAluno(objAluno);

                System.out.println("Digite <S> se houver mais alunos: ");
            } while (leitor.readLine().equalsIgnoreCase("S"));

            objTurma.setObjProfessor(objProfessor);

        } catch (Exception erro) {
        System.out.println("Inválido"+ erro );
        }


        //Saída de dados
        System.out.println("Cadeira: " + objTurma.getObjCadeira().getNome());
        System.out.println("Professor: " + objTurma.getObjProfessor().getNome() + objTurma.getObjProfessor().getTitulo());
        System.out.println("Alunos: ");
        objTurma.listarAlunos();
    
    }
}
