package br.com.Bancocentral.Caixa;

public class Cliente {

    private final String nameCliente;
    private final int numeroDaConta;
    private double saldo = 50.5;
    public double saque, deposito;


    public Cliente(String nameCliente, int numeroDaConta) {

        this.nameCliente = nameCliente;
        this.numeroDaConta = numeroDaConta;

    }

    public int getNumeroDaConta() {
        return this.numeroDaConta;
    }


    public void setSaque(double s) {
        this.saque = s;
    }

    public void setDeposito(double d) {
        this.deposito = d;
    }



    public void sacar(double saque) {
        this.saldo = saldo-saque;
    }

    public void depositar(double deposito) {
        this.saldo = saldo+deposito;
    }



    public void mostrarDados() {

      System.out.print("\ncliente : " + this.nameCliente);
      System.out.printf("\nsaldo do cliente :  %.2f ", this.saldo );
        double limiteCheque = -500.50;
        System.out.printf("\nlimite de credito fornecido pelo banco :  %.2f ", limiteCheque);

        double usoCheque = 0;
        if (this.saldo < usoCheque) {

            System.out.println("\natenção voce esta fazendo uso do cheque especial\n");
            System.out.printf("limite de credito usado  :  %.2f ",usoCheque + this.saldo);
            System.out.println();

        }

        double saldoExpecial = 15000000;
        if (saldo >= saldoExpecial) {
            System.out.println("cliente de valor");
        }

    }

}
