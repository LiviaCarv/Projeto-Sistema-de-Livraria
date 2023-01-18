package ProjetoLivraria.Produtos;

public class AlbumMusica  extends Produto {
    private String artista;
    private String generos;
    private String selos;

    public AlbumMusica(String nome, Integer id, Double preco, Integer quantidade, String artista, String generos, String selos) {
        super(nome, id, preco, quantidade);
        this.artista = artista;
        this.generos = generos;
        this.selos = selos;
    }

    public String toString() {
        return String.format("{ " + super.toString()
                        + "Artista: %s, Generos: %s, Selos: %s }"
                , artista, generos, selos);
    }

}