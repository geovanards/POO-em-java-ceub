package negocio;

public class Compra {
    //Propiedades da classe 

    private Produto obProduto = null;
    private int quantidade = 0;
    private String data = "";
    private String cartao = "";
    
    public Produto getObProduto() {
        return obProduto;
    }
    public void setObProduto(Produto obProduto) {
        this.obProduto = obProduto;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getCartao() {
        return cartao;
    }
    public void setCartao(String cartao) {
        this.cartao = cartao;
    }
}
