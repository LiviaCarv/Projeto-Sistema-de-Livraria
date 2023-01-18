package ProjetoLivraria.Estoque;

import ProjetoLivraria.Produtos.Jogo;
import ProjetoLivraria.Produtos.Produto;

import java.util.Locale;
import java.util.Scanner;

public class EstoqueJogos extends Estoque {

    public void addProduto() {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        System.out.println("Cadastro de Jogo!");

        System.out.print("Nome: ");
        String nome = leitor.nextLine();

        Integer id = verificarExclusividadeId();

        System.out.print("Preço: ");
        Double preco = leitor.nextDouble();

        System.out.print("Quantidade: ");
        Integer quantidade = leitor.nextInt();
        leitor.nextLine();

        System.out.print("Generos: ");
        String generos = leitor.nextLine();

        System.out.print("Distribuidora: ");
        String distribuidora = leitor.nextLine();

        System.out.print("Estúdio: ");
        String estudio = leitor.nextLine();

        Estoque.listaProdutos.add(new Jogo(nome, id, preco, quantidade, distribuidora, generos, estudio));

        System.out.println("Produto adicionado.");
    }

    public Integer verificarQuantidadePorCategoria() {
        Integer quantidadeJogos = 0;
        for (Produto produto : listaProdutos) {
            if (produto.getClass() == Jogo.class) {
                quantidadeJogos += produto.getQuantidade();
            }
        }
        System.out.printf("Existem %d jogos em estoque.", quantidadeJogos);
        return quantidadeJogos;
    }

    public void listarProdutosPorCategoria() {
        if (verificarQuantidadePorCategoria() == 0) {
            System.out.println("Sem jogos em estoque no momento.");
        } else {
            System.out.println("Lista de jogos disponíveis: ");
            for (Produto produto : listaProdutos) {
                if (produto.getClass() == Jogo.class) {
                    System.out.println(produto.toString());
                }
            }
        }

    }


}