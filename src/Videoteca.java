import java.util.ArrayList;

public class Videoteca {

    private String nome;
    private ArrayList<Filme> filmes;

  
    public Videoteca(String nome) {
        this.nome = nome;
        filmes = new ArrayList<>();
    }

 
    public void listarFilmes() {

        System.out.println("=== " + nome + " ===");

        if (filmes.size() == 0) {
            System.out.println("Não existem filmes na videoteca.");
        } else {

            for (int i = 0; i < filmes.size(); i++) {
                System.out.println((i + 1) + ". " + filmes.get(i));
            }
        }

        System.out.println("======");
    }

  
    public void adicionarFilme(Filme filme) {
        filmes.add(filme);
    }

 
    public void apagarFilme(int numero) {

        if (numero >= 1 && numero <= filmes.size()) {
            filmes.remove(numero - 1);
            System.out.println("Filme removido com sucesso.");
        } else {
            System.out.println("Número inválido.");
        }
    }

  
    public void editarFilme(int numero, String titulo, int ano) {

        if (numero >= 1 && numero <= filmes.size()) {
            filmes.get(numero - 1).setFilme(titulo, ano);
            System.out.println("Filme editado com sucesso.");
        } else {
            System.out.println("Número inválido.");
        }
    }

    public boolean temFilmes() {
        return filmes.size() > 0;
    }
}