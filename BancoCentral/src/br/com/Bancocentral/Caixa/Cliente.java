package br.com.Bancocentral.Caixa;

public class Cliente {

    private String nameCliente;
    private int numeroDaConta;
    private double saldo = 50.5;
    private double saldoExpecial = 15000000;
    private double LimiteCheque = -500.50;
    public double saque, deposito;
    private double usoCheque = 0;



    public Cliente(String nameCliente, int numeroDaConta) {

        this.nameCliente = nameCliente;
        this.numeroDaConta = numeroDaConta;

    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }


    public double getSaque() {

        return this.saque;
    }

    public void setSaque(double s) {

        this.saque = s;

    }

    public double getDeposito() {

        return this.deposito;
    }

    public void setDeposito(double d) {

        this.deposito = d;

    }



    public double sacar(double saque) {

        this.saldo = saldo-saque;

        return saldo;
    }

    public double depositar(double deposito) {

        this.saldo = saldo+deposito;

        return saldo;
    }



    public void mostrarDados() {

      System.out.print("\ncliente : " + this.nameCliente);
      System.out.printf("\nsaldo do cliente :  %.2f ", this.saldo );
      System.out.printf("\nlimite de credito fornecido pelo banco :  %.2f ", LimiteCheque);




        if (this.saldo < this.usoCheque) {

            System.out.println("\natenção voce esta fazendo uso do cheque especial");
            System.out.printf("seu saldo :  %.2f ", this.saldo);
            System.out.println("");
            System.out.printf("seu limite atual de credito :  %.2f ", this.LimiteCheque - this.saldo);
            System.out.println("");

        }

        if (saldo >= saldoExpecial) {
            System.out.println("cliente de valor");
        }


    }


}
