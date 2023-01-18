package ProjetoLivraria;

import java.util.Scanner;

public class Menu {
    static Scanner leitor = new Scanner(System.in);

    public static Integer menuPrincipal() {
        System.out.print("-".repeat(20));
        System.out.println("\nBem vindo(a) à Livraria da Livia!");
        System.out.println("Selecione a opção que voce deseja conferir: ");
        System.out.println("1 - Estoque\n2 - Realizar compra\n3 - Sair");
        Integer opcaoSelecionada;

        do {
            System.out.print("Digite sua escolha: ");
            opcaoSelecionada = leitor.nextInt();
        } while (opcaoSelecionada < 1 || opcaoSelecionada > 3);
        System.out.println("-".repeat(20));

        return opcaoSelecionada;
    }

    public static Integer menuEstoque() {
        System.out.println("\nQual operação voce deseja realizar no estoque?");
        System.out.println("1 - Ver lista de produtos disponíveis.");
        System.out.println("2 - Ver lista de produtos disponíveis por categoria.");
        System.out.println("3 - Adicionar produtos.");
        System.out.println("4 - Alterar preço do produto.");
        System.out.println("5 - Remover produto.");
        System.out.println("6 - Retornar ao menu principal.");
        Integer opcaoSelecionada;

        do {
            System.out.print("Digite sua escolha: ");
            opcaoSelecionada = leitor.nextInt();
        } while (opcaoSelecionada < 1 || opcaoSelecionada > 6);
        System.out.println("-".repeat(20));

        return opcaoSelecionada;
    }

    public static Integer menuEscolhaDeTipoDeProduto() {
        System.out.println("-".repeat(20));
        System.out.println("Voce deseja realizar essa operação em qual categoria? ");
        System.out.println("1 - Livros.");
        System.out.println("2 - Jogos.");
        System.out.println("3 - Filmes.");
        System.out.println("4 - Albuns de Musica.");
        System.out.println("5 - Brinquedos.");
        Integer opcaoSelecionada;

        do {
            System.out.print("Digite sua escolha: ");
            opcaoSelecionada = leitor.nextInt();
        } while (opcaoSelecionada < 1 || opcaoSelecionada > 5);
        System.out.println("-".repeat(20));

        return opcaoSelecionada;
    }
}
