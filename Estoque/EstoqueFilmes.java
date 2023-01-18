package ProjetoLivraria.Estoque;

import ProjetoLivraria.Produtos.Filme;
import ProjetoLivraria.Produtos.Produto;

import java.util.Locale;
import java.util.Scanner;

public class EstoqueFilmes extends Estoque {
    public void addProduto() {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        System.out.println("Cadastro de Filme!");
        System.out.print("Nome: ");
        String nome = leitor.nextLine();

        Integer id = verificarExclusividadeId();

        System.out.print("Preço: ");
        Double preco = leitor.nextDouble();

        System.out.print("Quantidade: ");
        Integer quantidade = leitor.nextInt();
        leitor.nextLine();

        System.out.print("Estudio: ");
        String estudio = leitor.nextLine();

        System.out.print("Diretores: ");
        String diretores = leitor.nextLine();

        System.out.print("Generos: ");
        String generos = leitor.nextLine();

        System.out.print("Produtores: ");
        String produtores = leitor.nextLine();

        Estoque.listaProdutos.add(new Filme(nome, id, preco, quantidade, estudio, diretores, generos, produtores));

        System.out.println("Produto adicionado.");
    }

    public Integer verificarQuantidadePorCategoria(){
        Integer quantidadeFilmes = 0;
        for (Produto produto : listaProdutos) {
            if (produto.getClass() == Filme.class) {
                quantidadeFilmes += produto.getQuantidade();
            }
        }
        System.out.printf("Existem %d filmes em estoque.", quantidadeFilmes);
        return quantidadeFilmes;
    }

    public void listarProdutosPorCategoria() {
        if (verificarQuantidadePorCategoria() == 0) {
            System.out.println("Sem filmes em estoque no momento.");
        } else {
            System.out.println("Lista de filmes disponíveis: ");
            for (Produto produto: listaProdutos) {
                if (produto.getClass() == Filme.class) {
                    System.out.println(listaProdutos.indexOf(produto)+1 + ": " + produto);
                }
            }
        }

    }
}
