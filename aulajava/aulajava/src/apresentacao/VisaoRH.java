package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Colaborador;
import negocio.Gerente;

public class VisaoRH {

    public static void main(String[] args) {
        //declaracao de variaveis
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        Colaborador objColaborador = null;
        String opcao = "";

        //entrada de dados

        try{
        System.out.println("Digite <C> colaborador ou <G> para Gerente: ");
        opcao = leitor.readLine();
        
        if (opcao.equalsIgnoreCase("C")) {
            objColaborador = new Colaborador();
        } else {
            objColaborador = new Gerente();
        }
    
        System.out.println("Digite a matrícula: ");
        objColaborador.setMatricula(Integer.parseInt(leitor.readLine()));

        System.out.println("Digite o nome: ");
        objColaborador.setNome (leitor.readLine());

        System.out.println("Digite o salario: ");
        objColaborador.setSalario(Double.parseDouble(leitor.readLine()));

        if (! opcao.equalsIgnoreCase("C")) {
            System.out.println("Digite o bônus: ");
            ((Gerente) objColaborador).setBonus(Double.parseDouble(leitor.readLine()));

        } 
        
        }catch (Exception erro){
        System.out.println("Erro"+erro);
             }
             //saida de dados

             System.out.println("Matrícula: "+ objColaborador.getMatricula());
             System.out.println("Nome:"+ objColaborador.getNome());
             System.out.println("Salário:"+ objColaborador.getSalario());
        }

}
