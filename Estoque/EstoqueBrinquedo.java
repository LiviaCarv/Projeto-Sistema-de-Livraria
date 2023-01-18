package ProjetoLivraria.Estoque;

import ProjetoLivraria.Produtos.Brinquedo;
import ProjetoLivraria.Produtos.Produto;

import java.util.Locale;
import java.util.Scanner;

public class EstoqueBrinquedo extends Estoque {
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

        System.out.print("Tipo: ");
        String tipo = leitor.nextLine();


        Estoque.listaProdutos.add(new Brinquedo(nome, id, preco, quantidade, tipo));

        System.out.println("Produto adicionado.");
    }

    public Integer verificarQuantidadePorCategoria(){
        Integer quantidadeBrinquedos = 0;
        for (Produto produto : listaProdutos) {
            if (produto.getClass() == Brinquedo.class) {
                quantidadeBrinquedos += produto.getQuantidade();
            }
        }
        System.out.printf("Existem %d brinquedos em estoque.", quantidadeBrinquedos);
        return quantidadeBrinquedos;
    }

    public void listarProdutosPorCategoria() {
        if (verificarQuantidadePorCategoria() == 0) {
            System.out.println("Sem brinquedos em estoque no momento.");
        } else {
            System.out.println("Lista de brinquedos disponíveis: ");
            for (Produto produto: listaProdutos) {
                if (produto.getClass() == Brinquedo.class) {
                    System.out.println(listaProdutos.indexOf(produto)+1 + ": " + produto);
                }
            }
        }

    }

}
