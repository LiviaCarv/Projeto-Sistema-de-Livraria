package ProjetoLivraria;

import ProjetoLivraria.Estoque.Estoque;
import ProjetoLivraria.Produtos.Produto;
import java.util.Scanner;

public abstract class Caixa {
    private static Double dinheiroEmCaixa = 0.0;

    public static Double getDinheiroEmCaixa() {
        return dinheiroEmCaixa;
    }

    public static void compraDeProduto() {
        Estoque.listarProdutosEmEstoque();
        Scanner leitor = new Scanner(System.in);
        System.out.print("Id do produto que deseja comprar: ");
        Integer id = leitor.nextInt();
        System.out.print("Quantidade de produtos: ");
        Integer quantidadeDaCompra = leitor.nextInt();

        Double preco = 0.0;
        Produto produtoComprado = null;

        for (Produto produto : Estoque.listaProdutos) {
            if (produto.getId().equals(id)) {
                produtoComprado = produto;
                preco = produtoComprado.getPreco();
                if (produto.getQuantidade() < quantidadeDaCompra) {
                    System.out.printf("Produto: {%s}.Existem apenas %d disponíveis. " +
                            "Atualizaremos a quantidade comprada para %d.\n", produto.getNome(), produto.getQuantidade(), produto.getQuantidade());
                    quantidadeDaCompra = produto.getQuantidade();
                }
            }
        }
        if (produtoComprado == null ) {
            System.out.println("Id não localizada em nosso estoque.");
            System.out.println("Compra não pôde ser realizada.");
        } else {
            preco *= quantidadeDaCompra;
            dinheiroEmCaixa += preco;
            produtoComprado.setQuantidade(produtoComprado.getQuantidade() - quantidadeDaCompra);
            System.out.printf("Voce realizou a compra de %d produtos (Id: %d). " + produtoComprado.getClass().getName().replace("Projeto_Livraria.Produtos.", "Categoria") + ". Nome : { %s }", quantidadeDaCompra, id, produtoComprado.getNome());
            System.out.printf("\nValor da compra: R$ %.2f", preco);
        }
        System.out.println("\nDinheiro em caixa: R$ " + dinheiroEmCaixa);
    }
}
