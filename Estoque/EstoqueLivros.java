package ProjetoLivraria.Estoque;

import ProjetoLivraria.Produtos.Livro;
import ProjetoLivraria.Produtos.Produto;
import java.util.Locale;
import java.util.Scanner;

public class EstoqueLivros extends Estoque {
    public void addProduto() {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        System.out.println("Cadastro de Livro!");
        System.out.print("Nome: ");
        String nome = leitor.nextLine();

        Integer id = verificarExclusividadeId();

        System.out.print("Preço: ");
        Double preco = leitor.nextDouble();

        System.out.print("Quantidade: ");
        Integer quantidade = leitor.nextInt();
        leitor.nextLine();

        System.out.print("Escritor: ");
        String escritor = leitor.nextLine();

        System.out.print("Generos: ");
        String generos = leitor.nextLine();

        System.out.print("Editora: ");
        String editora = leitor.nextLine();

        Estoque.listaProdutos.add(new Livro(nome, id, preco, quantidade, generos, escritor, editora));
        System.out.println("Produto adicionado.");
    }

    public Integer verificarQuantidadePorCategoria(){
        Integer quantidadeLivros = 0;
        for (Produto produto : listaProdutos) {
            if (produto.getClass() == Livro.class) {
                quantidadeLivros += produto.getQuantidade();
            }
        }
        System.out.printf("Existem %d livros em estoque.", quantidadeLivros);
        return quantidadeLivros;
    }

    public void listarProdutosPorCategoria() {
        if (verificarQuantidadePorCategoria() == 0) {
            System.out.println("Sem livros em estoque no momento.");
        } else {
            System.out.println("Lista de livros disponíveis: ");
            for (Produto produto: listaProdutos) {
                if (produto.getClass() == Livro.class) {
                    System.out.println( listaProdutos.indexOf(produto)+1 + ": " + produto);
                }
            }
        }

    }
}
