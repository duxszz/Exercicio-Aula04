package Exercicio_3;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;

    public ContaBancaria(){
        this.numeroConta = 29821;
        this.saldo = 1200.00;
    }
    public void depositar(double valor){
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito em andamento...");
            System.out.println("Deposito realizado com êxito...");
        } else {
            System.out.println("Erro no deposito...");
        }
    }
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor; 
                System.out.println("Saque em andamento...");
                System.out.println("Saque realizado com êxito...");
        } else {
            System.out.println("Saque mal-sucedido");
        }
    }
    public void getSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }
}
