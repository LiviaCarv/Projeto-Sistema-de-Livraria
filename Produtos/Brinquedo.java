package ProjetoLivraria.Produtos;

public class Brinquedo extends Produto{
    private String tipo;

    public Brinquedo(String nome, Integer id, Double preco, Integer quantidade, String tipo) {
        super(nome, id, preco, quantidade);
        this.tipo = tipo;
    }

    public String toString() {
        return String.format("{ " + super.toString() + "Tipo: %s }", tipo);
    }

}
