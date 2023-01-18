package ProjetoLivraria.Produtos;

public class Jogo extends Produto{

    private String distribuidora;
    private String generos;
    private String estudio;

    public Jogo(String nome, Integer id, Double preco, Integer quantidade, String distribuidora, String generos, String estúdio) {
        super(nome, id, preco, quantidade);
        this.distribuidora = distribuidora;
        this.generos = generos;
        this.estudio = estúdio;
    }

    public String toString() {
        return String.format("{ + " + super.toString() + "Distribuidora: %s; Generos: %s; Estudio: %s }", distribuidora, generos, estudio);
    }

}
