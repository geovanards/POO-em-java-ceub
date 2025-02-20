package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Compra;
import negocio.Produto;
import negocio.Tipo;

public class VisaoAmazon {
    public static void main(String[] args) {
        //declaracao de variaveis
        BufferedReader leitor = new  BufferedReader(new InputStreamReader(System.in));

    Compra objCompra = new Compra();
    Produto objProduto = new Produto();

    //entrada de dados 
    try {
        System.out.println("Informe o nome do produto: ");
        objProduto.setNome(leitor.readLine());

        System.out.println("Informe o tipo do produto: ");
        objProduto.setObjTipo(new Tipo(leitor.readLine()));

        System.out.println("Informe o preço do produto: ");
        objProduto.setPreco(Double.parseDouble(leitor.readLine()));

        objCompra.setObProduto(objProduto); 

        System.out.println("Informe a quantidade de produtos: ");
        objCompra.setQuantidade(Integer.parseInt(leitor.readLine()));

        System.out.println("Informe a data da compra: ");
        objCompra.setData(leitor.readLine());

        System.out.println("Informe o número do cartão da compra: ");
        objCompra.setCartao(leitor.readLine());
        
    } catch (Exception erro) {
        System.out.println("Deu erro" + erro);
        
    }
    //saída de dados
        System.out.println("Produto"+ objCompra.getObProduto().getNome());
            objCompra.getObProduto().getNome();
        System.out.println("Tipo: "+ objCompra.getObProduto().getObjTipo().getDescricao());
        System.out.println("Data: "+ objCompra.getData());
        System.out.println("Valor Total: R$ "+ objCompra.getQuantidade() * objCompra.getObProduto().getPreco());
    }
}
