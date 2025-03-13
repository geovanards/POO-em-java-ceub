package negocio;

public class MoscowMule extends Drink implements Mixer {
    public void misturar(){ 
    super.adicionar(new Ingrediente("Cachaça", 100, "ml"));
    super.adicionar(new Ingrediente("Limão", 3, "unidades"));
    super.adicionar(new Ingrediente("Açúcar", 5, "g"));
    super.adicionar(new Ingrediente("Gelo", 8, "pedras"));
    super.adicionar(new Ingrediente("Gengibre", 20, "8"));
    super.adicionar(new Ingrediente("Espuma de gengibre", 50, "ml"));
    
    }
}
