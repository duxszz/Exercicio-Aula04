package exercicio_5;

public class ProjetoPessoa {
    public static void main(String[] args) {
        Endereco end1 = new Endereco("Rua d", 134); 
        Endereco end2 = new Endereco("Jose de alencar", 542);
        Pessoa p1 = new Pessoa("tarso", 18,  end1);
        Pessoa p2 = new Pessoa("Ana",19,  end2);

        System.out.println("Pessoa 1: " + p1.mostrarDados());
        System.out.println("Pessoa 2: " + p2.mostrarDados());
    }
}
