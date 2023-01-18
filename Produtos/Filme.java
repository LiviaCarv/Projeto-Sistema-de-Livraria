package ProjetoLivraria.Produtos;

public class Filme extends Produto {
    private String estudio;
    private String diretores;
    private String generos;
    private String produtores;

    public Filme(String nome, Integer id, Double preco, Integer quantidade, String estudio, String diretores, String generos, String produtores) {
        super(nome, id, preco, quantidade);
        this.estudio = estudio;
        this.diretores = diretores;
        this.generos = generos;
        this.produtores = produtores;
    }

    public String toString() {
        return String.format("{ " + super.toString()
                + "Gêneros: %s, Estúdio: %s, Diretores: %s; Produtores: %s }"
                , generos, estudio, diretores, produtores);
    }

}
