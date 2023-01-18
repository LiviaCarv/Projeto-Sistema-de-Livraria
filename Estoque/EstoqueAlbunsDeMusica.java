package ProjetoLivraria.Estoque;

import ProjetoLivraria.Produtos.AlbumMusica;
import ProjetoLivraria.Produtos.Brinquedo;
import ProjetoLivraria.Produtos.Produto;

import java.util.Locale;
import java.util.Scanner;

public class EstoqueAlbunsDeMusica extends Estoque {
    public void addProduto() {
        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);
        System.out.println("Cadastro de Brinquedo!");
        System.out.print("Nome: ");
        String nome = leitor.nextLine();

        Integer id = verificarExclusividadeId();

        System.out.print("Preço: ");
        Double preco = leitor.nextDouble();

        System.out.print("Quantidade: ");
        Integer quantidade = leitor.nextInt();
        leitor.nextLine();

        System.out.print("Artista: ");
        String artista = leitor.nextLine();

        System.out.print("Generos: ");
        String generos = leitor.nextLine();

        System.out.print("Selos: ");
        String selos = leitor.nextLine();

        Estoque.listaProdutos.add(new AlbumMusica(nome, id, preco, quantidade, artista, generos, selos));

        System.out.println("Produto adicionado.");
    }

    public Integer verificarQuantidadePorCategoria(){
        Integer quantidadeAlbunsDeMusica = 0;
        for (Produto produto : listaProdutos) {
            if (produto.getClass() == AlbumMusica.class) {
                quantidadeAlbunsDeMusica += produto.getQuantidade();
            }
        }
        System.out.printf("Existem %d albuns de musica em estoque.", quantidadeAlbunsDeMusica);
        return quantidadeAlbunsDeMusica;
    }

    public void listarProdutosPorCategoria() {
        if (verificarQuantidadePorCategoria() == 0) {
            System.out.println("Sem albuns de musica em estoque no momento.");
        } else {
            System.out.println("Lista de albuns de musica disponíveis: ");
            for (Produto produto: listaProdutos) {
                if (produto.getClass() == Brinquedo.class) {
                    System.out.println(listaProdutos.indexOf(produto)+1 + ": " + produto);
                }
            }
        }

    }

}
