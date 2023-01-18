package ProjetoLivraria.Produtos;

public class Produto {
    protected String nome;
    protected Integer id;
    protected Double preco;
    protected Integer quantidade;

    public Produto(String nome, Integer id, Double preco, Integer quantidade) {
        this.nome = nome;
        this.id = id;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String toString() {
        return String.format("Nome: %s; Id: %d; Preço: %.2f; Quantidade em Estoque: %d, ", nome, id, preco, quantidade);
    }

    public String getNome() {
        return nome;
    }

    public Integer getId() {
        return id;
    }

    public Double getPreco() {
        return preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
