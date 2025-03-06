package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Aguia;
import negocio.Animal;
import negocio.Ave;
import negocio.Cachorro;
import negocio.Leopardo;
import negocio.Mamifero;

public class VisaoZoo {
public static void main(String[] args) {
    BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
    Animal objAnimal = null;
    String opcao = "";

    //entrada de dados

    try {
        System.out.println(" Digite <C> para cachorro <L> para leopardo <A> para ave: ");
        opcao = leitor.readLine();

        if (opcao.equalsIgnoreCase("C")) {
            objAnimal = new Cachorro();
            
        }else if (opcao.equalsIgnoreCase("L")){
            objAnimal = new Leopardo();

        }else if (opcao.equalsIgnoreCase("A")){
            objAnimal = new Aguia();
        }
        System.out.println("Digite o nome: ");
        objAnimal.setNome(leitor.readLine());

        System.out.println("Digite a altura: ");
        objAnimal.setAltura(Double.parseDouble(leitor.readLine()));

        System.out.println("Digite o peso: ");
        objAnimal.setPeso(Double.parseDouble(leitor.readLine()));

        if (opcao.equalsIgnoreCase("C")) {
            System.out.println("Digie a quantidade de litros de leite: ");
            ((Mamifero)objAnimal).setLitrosLeite(Integer.parseInt(leitor.readLine()));

            System.out.println("Digite a força da mordida: "); 
            ((Mamifero)objAnimal).setLitrosLeite(Integer.parseInt(leitor.readLine()));

            System.out.println("Digite a velocidade: ");
            ((Leopardo)objAnimal).setVelocidade(Double.parseDouble(leitor.readLine()));
        }else{

            System.out.println("Digite a quantidade de ovos: "); 
            ((Ave)objAnimal).setQuantidadeOvos(Integer.parseInt(leitor.readLine()));

            System.out.println("Digite a autonomia: ");
            ((Aguia)objAnimal).setAutonomia(Double.parseDouble(leitor.readLine()));
        }
        

    } catch (Exception erro) {
        System.out.println(erro);
    }
    //sáida de dados
    System.out.println("Nome: " + objAnimal.getNome());
    System.out.println("IMC: " +objAnimal.calcularIMC());
    if (opcao.equalsIgnoreCase("C")) {
        ((Cachorro)objAnimal).morder();

    } else if (opcao.equalsIgnoreCase("L")) {
        ((Leopardo)objAnimal).correr();
    } else {
        ((Aguia)objAnimal).voar();
    }
        
}
    
}

