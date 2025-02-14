package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Estante;
import negocio.Produto;

public class VisaoControleEstoque {
	public static void main(String [] args) {
		// Declaração de variáveis 
		
		BufferedReader leitor = new BufferedReader(
								new InputStreamReader(
									System.in));
		
		Produto objProduto = new Produto();
		
		// Entrada de Dados
		try {
			System.out.print("Digite o nome do produto: ");
			objProduto.setNome(leitor.readLine());
			
			System.out.print("Digite o número da estante: ");
			objProduto.setObjEstante(new Estante(
						Integer.parseInt(leitor.readLine())));
			
			System.out.print("Digite a quantidade de produtos: ");
			objProduto.setQuantidade(
						Integer.parseInt(leitor.readLine()));
						
		} catch (Exception erro) {
			System.out.println(erro);
		}
		
		// Saida de dados 
		
			System.out.println("Produto: " + objProduto.getNome());
			System.out.println("Estante: " + objProduto.getObjEstante().getNumero());
			System.out.println("Quantidade: " + objProduto.getQuantidade());
	}
}
