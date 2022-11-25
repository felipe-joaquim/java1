package heranca_e_polimorfismo;

public abstract class Conta {
    private String titular;
    private String numeroDaConta;
    private Double saldo;

    public Conta (){

    }

    public Conta(String titular, String numeroDaConta, Double saldo) {
        this.titular = titular;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public void sacar(double saque){
        saldo -= saque;
    }

    public void depositar(double deposito){
        saldo =+ deposito;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo(){
        return saldo;
    }

}
