package Exercicio_6;

public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;
    
public Livro(String titulo, String autor) {
    this.titulo = titulo;
    this.autor = autor;
    this.disponivel = true;
}
    public String getTitulo() {
        return titulo;
    }
    public boolean isDisponivel() {
        return disponivel;
    }
    public void emprestar() {
        if (disponivel) {
            disponivel = false;
                System.out.println("Livro: " + titulo + " ,emprestado com êxito...");
        } else {
            System.out.println("Livro: ," + titulo + " ,esta indisponivel...");
        }
    }
    public void devolver() {
        if (!disponivel) {
            disponivel = true;
                System.out.println("Livro: ," + titulo + " ,devolvido com êxito");
        } else {
            System.out.println("Livro: ," + titulo + " ,esta indisponivel");
        }
    }
}
