package Exercicio_4;

public class ProjetoProduto {
    public static void main(String[] args) {
    Produto pd1 = new Produto("Teclado", -249.99);
    Produto pd2 = new Produto("Mouse", 50.00);

    System.out.println("Produto 1: " + pd1.getNome() + " R$: " + pd1.getPreco());
    System.out.println("Produto 2: " + pd2.getNome() + " R$: " + pd2.getPreco());
    }        
}