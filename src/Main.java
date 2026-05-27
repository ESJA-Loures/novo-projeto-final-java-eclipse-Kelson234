import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Videoteca videoteca = new Videoteca("Os meus filmes");

        int opcao;

        do {

            System.out.println("\n1. Apresentar biblioteca");
            System.out.println("2. Adicionar filme");
            System.out.println("3. Apagar filme");
            System.out.println("4. Editar filme");
            System.out.println("0. Sair");

            System.out.print("Opcao: ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {

                case 1:

                    videoteca.listarFilmes();
                    break;

                case 2:

                    System.out.print("Titulo: ");
                    String titulo = input.nextLine();

                    System.out.print("Ano: ");
                    int ano = input.nextInt();
                    input.nextLine();

                    Filme novoFilme = new Filme(titulo, ano);

                    videoteca.adicionarFilme(novoFilme);

                    break;

                case 3:

                    if (videoteca.temFilmes()) {

                        videoteca.listarFilmes();

                        System.out.print("Número do filme a apagar: ");
                        int apagar = input.nextInt();
                        input.nextLine();

                        videoteca.apagarFilme(apagar);

                    } else {

                        System.out.println("Não existem filmes para apagar.");
                    }

                    break;

                case 4:

                    if (videoteca.temFilmes()) {

                        videoteca.listarFilmes();

                        System.out.print("Número do filme a editar: ");
                        int editar = input.nextInt();
                        input.nextLine();

                        System.out.print("Novo título: ");
                        String novoTitulo = input.nextLine();

                        System.out.print("Novo ano: ");
                        int novoAno = input.nextInt();
                        input.nextLine();

                        videoteca.editarFilme(editar, novoTitulo, novoAno);

                    } else {

                        System.out.println("Não existem filmes para editar.");
                    }

                    break;

                case 0:

                    System.out.println("Programa terminado.");
                    break;

                default:

                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        input.close();
    }
}