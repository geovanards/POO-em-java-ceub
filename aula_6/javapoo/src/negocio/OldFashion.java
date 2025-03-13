package negocio;

public class OldFashion extends Drink implements Mixer {
    public void misturar(){
        super.adicionar(new Ingrediente("Whiskey", 200, "ml"));
        super.adicionar(new Ingrediente("Gelo", 1, "esfera"));
        super.adicionar(new Ingrediente("Açúcar", 5, "g"));
        super.adicionar(new Ingrediente("Laranja", 10, "casca"));
        super.adicionar(new Ingrediente("Bitter", 2, "gotas"));

    }

}
