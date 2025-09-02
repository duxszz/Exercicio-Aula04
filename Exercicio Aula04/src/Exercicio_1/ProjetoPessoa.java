package Exercicio_1;

public class ProjetoPessoa {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Maria do Carmo", 34);
        Pessoa p2 = new Pessoa("Pedro Paixão", 22);

        System.out.println("Pessoa 1: " + p1.nome + "," + p1.idade + " anos");
        System.out.println("Pessoa 1: " + p2.nome + "," + p2.idade + " anos");
    }
}
