package Exercicio_3;

public class ProjetoBanco {
    public static void main(String[] args) {
        ContaBancaria cb1 = new ContaBancaria();

        cb1.getSaldo();

        
        cb1.depositar(200.00);
        cb1.getSaldo();

        cb1.sacar(400);
        cb1.getSaldo();
    }
}
