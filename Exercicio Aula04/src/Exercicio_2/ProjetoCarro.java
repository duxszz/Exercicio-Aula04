package Exercicio_2;

public class ProjetoCarro {
public static void main(String[] args) {
    
        Carro c1 = new Carro("Ferrari 458-italia", 2012);
        Carro c2 = new Carro("Lamborghini Huracán", 2022);

        System.out.println("Carro 1, Nome: " + c1.getMarca() + "do ano de: " + c1.getAno());
        System.out.println("Carro 1, Nome: " + c2.getMarca() + "do ano de: " + c2.getAno());
    }
}