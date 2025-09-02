package Exercicio_6;

public class ProjetoBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(5);
        Livro li1 = new Livro("Diario de um banana", "Jeff Kinney");
        Livro li2 = new Livro("Gigantes de aço", "Richard Matheson");
        Livro li3 = new Livro("Dom Casmurro", "Machado de Assis");

        biblioteca.adicionarLivro(li1);
        biblioteca.adicionarLivro(li2);
        biblioteca.adicionarLivro(li3);

        biblioteca.mostrarLivros();

        biblioteca.emprestarLivro("Diario de um banana");

        biblioteca.mostrarLivros();

        biblioteca.devolverLivro("Diario de um banana");

        biblioteca.mostrarLivros();
    }
}
