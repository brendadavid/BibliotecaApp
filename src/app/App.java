package app;

import model.ListaDeLivros;
import model.Livro;
import model.StatusEnum;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        ListaDeLivros l1 = new ListaDeLivros();
        Livro livro = null;
        int numeroLivro = 0;
        String titulo, autor, ano;
        int op;

        do {
            System.out.println("\n\nMENU:\n");
            System.out.println("1 - Cadastrar/Doar Livros");
            System.out.println("2 - Retirar um Livro");
            System.out.println("3 - Devolver um livro");
            System.out.println("4 - Exibir Livros");
            System.out.println("0 - Sair.");

            op = ler.nextInt();

            switch (op) {

                case 1:

                    System.out.println("Digite o numero do livro: ");
                    ler.nextLine();
                    numeroLivro = ler.nextInt();
                    if (l1.buscarLivro(numeroLivro)){
                        System.out.println("Já existe um livro cadastrado com esse número, tente novamente.");
                    }
                    else {
                        System.out.println("Digite o título do livro: ");
                        ler.nextLine();
                        titulo = ler.nextLine();
                        System.out.println("Digite o nome do autor do livro: ");
                        autor = ler.nextLine();
                        System.out.println("Digite o ano de publicação do livro: ");
                        ano = ler.nextLine();

                        livro = new Livro(numeroLivro, titulo, autor, ano);
                        l1.cadastrarLivro(livro);
                        System.out.println("Livro cadastrado com sucesso!");
                    }
                    break;

                case 2:

                    if (l1.getLista().isEmpty()) {
                        System.out.println("Nao há livros cadastrados.");
                    } else {
                        System.out.println("Digite o número do livro que deseja retirar:");
                        int numero = ler.nextInt();
                        if (l1.buscarLivro(numero)) {
                            System.out.println("Digite seu nome:");
                            ler.nextLine();
                            String nome = ler.nextLine();
                            if(l1.retirarLivro(numero,nome) != null){
                                System.out.println("Livro emprestado!");}
                            else {
                                System.out.println("O livro pesquisado não está disponível.");
                            }
                        }
                        else { System.out.println("O livro pesquisado não foi encontrado."); }
                    }
                    break;

                case 3:
                    if (l1.getLista().isEmpty()) {
                        System.out.println("Nao há livros cadastrados.");
                    } else {
                        System.out.println("Digite o número do livro que deseja devolver:");
                        int numero = ler.nextInt();
                        l1.buscarLivro(numero);
                        if (l1.buscarLivro(numero)) {
                            System.out.println("Livro Devolvido:" + "\n" + l1.devolverLivro(numero));
                        } else {
                            System.out.println("O livro pesquisado não foi encontrado.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Livros do acervo:" + l1);

                    break;
                case 0:
                    System.out.println("Sistema encerrado.");
                    break;
                default:
                    System.out.println("Opcao inválida");
            }

        } while (op != 0);

    }

}
