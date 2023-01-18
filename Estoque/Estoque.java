package ProjetoLivraria.Estoque;

import ProjetoLivraria.Produtos.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Estoque {

    public static List<Produto> listaProdutos = new ArrayList<>();
    public abstract void addProduto();
    public abstract Integer verificarQuantidadePorCategoria();
    public abstract void listarProdutosPorCategoria();

    public static Integer verificarExclusividadeId () {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Id: ");
        Integer id = leitor.nextInt();
        for (Produto produto : listaProdutos) {
            if (produto.getId().equals(id)) {
                System.out.println("Id já utilizada. Tente novamente.");
                id = verificarExclusividadeId();
            }
        }
        return id;
    }

    public static void listarProdutosEmEstoque () {
        if (listaProdutos.isEmpty()) {
            System.out.println("Sem produtos em estoque no momento.");
        } else {
            System.out.println("Lista de produtos disponíveis: ");
            for (Produto produto: listaProdutos) {
                System.out.println(produto.getClass().getName().replace("Projeto_Livraria.Produtos.", "Categoria ") +
                        " [Item "+ (listaProdutos.indexOf(produto)+1) + "] " + produto);
            }
        }
    }

    public static String removerProduto () {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Id do produto a ser removido: ");
        Integer id = leitor.nextInt();
        for (Produto produto: listaProdutos) {
            if (produto.getId().equals(id)) {
                System.out.println("Produto removido: \n" + produto);
                listaProdutos.remove(produto);
                return "Produto removido com sucesso!";
            }
        }
        System.out.println("Id não existente em estoque.");
        return "";
    }

    public static void alterarPrecoProduto() {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o id do produto: ");
        int id  = leitor.nextInt();
        System.out.print("Digite o novo preço: ");
        Double new_preco = leitor.nextDouble();

        for (Produto produto: listaProdutos) {
            if (produto.getId().equals(id)) {
                System.out.println("Produto:\n" + produto);

                produto.setPreco(new_preco);
                System.out.println("Preço atualizado.");
            }
        }
    }

}
