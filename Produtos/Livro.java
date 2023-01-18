package ProjetoLivraria.Produtos;

public class Livro extends Produto {
    private String generos;
    private String escritor;
    private String editora;

    public Livro(String nome, Integer id, Double preco, Integer quantidade, String generos, String escritor, String editora) {
        super(nome, id, preco, quantidade);
        this.generos = generos;
        this.escritor = escritor;
        this.editora = editora;
    }

    public String toString() {
        return String.format( "{ " + super.toString()
                + "Gêneros: %s, Escritor: %s, Editora: %s }",
                 generos, escritor, editora);
    }

}
