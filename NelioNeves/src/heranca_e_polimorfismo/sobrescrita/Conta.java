package heranca_e_polimorfismo.sobrescrita;

public class Conta {
    protected Integer number;
    protected String titular;
    protected Double saldo;

    public Conta(){

    }

    public Conta(int number, String titular, double saldo){
        this.number = number;
        this.titular = titular;
        this.saldo = saldo;

    }

    public void saque (double valorSaque){
        saldo -= (valorSaque+5);
    }

    public void deposito (double valorDeposito){
        saldo += valorDeposito;
    }



}
