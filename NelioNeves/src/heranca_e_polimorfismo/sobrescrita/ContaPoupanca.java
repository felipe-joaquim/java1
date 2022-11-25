package heranca_e_polimorfismo.sobrescrita;

public final  class ContaPoupanca extends Conta {
    private Double taxaPoupanca;

    public ContaPoupanca(){
        super();

    }

    public ContaPoupanca(int number, String titular, double saldo, double taxa){
        super(number, titular, saldo);
        taxaPoupanca = taxa;
    }

    public void atualizarSaldo (){
        saldo += saldo*taxaPoupanca;
    }

    @Override
    public void saque (double valorSaque){
        saldo -= valorSaque;
    }
}
