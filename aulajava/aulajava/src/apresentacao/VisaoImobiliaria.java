package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Imovel;
import negocio.Novo;
import negocio.Usado;

public class VisaoImobiliaria {

    public static void main(String[] args) {
        //declaracao de variaveis 
        BufferedReader leitor = new BufferedReader( new  InputStreamReader(System.in));
        
        Imovel objImovel = null;
        String opcao = "";


        try {
            System.out.println("Digite <N> para novo <U> para usado: ");
            opcao = leitor.readLine();

            if (opcao.equalsIgnoreCase("N")) {
                objImovel = new Novo();
            } else {
                objImovel = new Usado();
            }
            System.out.println("Digite o endereço: ");
            objImovel.setEndereco(leitor.readLine());

            System.out.println("Digite a metragem: ");
            objImovel.setMetragem(Double.parseDouble(leitor.readLine()));

            System.out.println("Digite o valor: ");
            objImovel.setValor(Double.parseDouble(leitor.readLine()));

            if (opcao.equalsIgnoreCase("N")) {
                System.out.println("Digite o adiciomal: ");
                ((Novo)objImovel).setAdicional(Double.parseDouble(leitor.readLine()));
                
            } else {
                System.out.println("Digite a depreciação: ");
                Double.parseDouble(leitor.readLine());
            }

        } catch (Exception erro) {
            System.out.println("Erro"+ erro);
        }
        //saída
        System.out.println("Enderço: "+ objImovel.getEndereco());
        System.out.println("Metragem: "+ objImovel.getMetragem());
        System.out.println("Valor: "+objImovel.getValor());
    }
}
