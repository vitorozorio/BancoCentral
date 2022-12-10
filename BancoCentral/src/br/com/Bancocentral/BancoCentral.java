package br.com.Bancocentral;
import br.com.Bancocentral.Caixa.Cliente;
import java.util.Scanner;


public class BancoCentral {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        int opcao;
        int conta;


        Cliente C1 = new Cliente("Vitor Ozorio", 200220);
        Cliente C2 = new Cliente("igor Silva", 400440);
        Cliente C3 = new Cliente("Edson Quintino", 300330);


        System.out.print("insira o numero da conta :");
        conta = texto.nextInt();

        if (conta == C1.getNumeroDaConta()) {

            System.out.println("escolha uma operação\n1 para saque\n2 para deposito");
            opcao = texto.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("valor do saque : ");
                    C1.saque = texto.nextDouble();
                    C1.setSaque(C1.saque);
                    C1.sacar(C1.saque);
                    C1.mostrarDados();
                }
                case 2 -> {
                    System.out.print("Valor do deposito : ");
                    C1.deposito = texto.nextDouble();
                    C1.setDeposito(C1.deposito);
                    C1.depositar(C1.deposito);
                    C1.mostrarDados();
                }
            }


        } else if (conta == C2.getNumeroDaConta()) {

            System.out.println("escolha uma operação\n1 para saque\n2 para deposito");
            opcao = texto.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("valor do saque : ");
                    C2.saque = texto.nextDouble();
                    C2.setSaque(C2.saque);
                    C2.sacar(C2.saque);
                    C2.mostrarDados();
                }
                case 2 -> {
                    System.out.print("Valor do deposito : ");
                    C2.deposito = texto.nextDouble();
                    C2.setDeposito(C2.deposito);
                    C2.depositar(C2.deposito);
                    C2.mostrarDados();
                }
            }


        } else if (conta == C3.getNumeroDaConta()) {

            System.out.println("escolha uma operação\n1 para saque\n2 para deposito");
            opcao = texto.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("valor do saque : ");
                    C2.saque = texto.nextDouble();
                    C2.setSaque(C2.saque);
                    C2.sacar(C2.saque);
                    C2.mostrarDados();
                }
                case 2 -> {
                    System.out.print("Valor do deposito : ");
                    C3.deposito = texto.nextDouble();
                    C3.setDeposito(C3.deposito);
                    C3.depositar(C3.deposito);
                    C3.mostrarDados();
                }
            }


        } else {

            System.out.println(" conta não cadastrada");

        }


    }
}
