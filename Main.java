package ProjetoLivraria;

import ProjetoLivraria.Estoque.*;

public class Main {
    public static void main(String[] args) {

        while (true) {
            Integer opcaoSelecionada = Menu.menuPrincipal();

            if (opcaoSelecionada == 1) {
                atividadesEstoque(Menu.menuEstoque());

            } else if (opcaoSelecionada == 2) {
                Caixa.compraDeProduto();

            } else {
                break;
            }
        }
        System.out.println("Aplicação fechada.");
        System.out.println("Volte Sempre!");
    }

    public static void atividadesEstoque(int opcao) {
        int escolhaDeCategoria;
        Estoque estoqueEscolhido;

        switch (opcao) {
            case 1:
                Estoque.listarProdutosEmEstoque();
                break;

            case 2:
                escolhaDeCategoria = Menu.menuEscolhaDeTipoDeProduto();
                estoqueEscolhido = retornaEstoqueSelecionado(escolhaDeCategoria);
                estoqueEscolhido.listarProdutosPorCategoria();
                break;

            case 3:
                escolhaDeCategoria = Menu.menuEscolhaDeTipoDeProduto();
                estoqueEscolhido = retornaEstoqueSelecionado(escolhaDeCategoria);
                estoqueEscolhido.addProduto();
                break;

            case 4:
                Estoque.alterarPrecoProduto();
                break;

            case 5:
                Estoque.removerProduto();
                break;

            case 6:
                break;
        }
    }

    public static Estoque retornaEstoqueSelecionado(int opcao) {
        Estoque estoque;
        switch (opcao) {
            case 1:
                estoque = new EstoqueLivros();
                break;
            case 2:
                estoque = new EstoqueJogos();
                break;
            case 3:
                estoque = new EstoqueFilmes();
                break;
            case 4:
                estoque = new EstoqueAlbunsDeMusica();
                break;
            case 5:
                estoque = new EstoqueBrinquedo();
                break;
            default:
                estoque = new EstoqueLivros();
        }
        return estoque;
    }
}
