package heranca_e_polimorfismo;

public class ContaFisica extends Conta {
    private Double limiteEmprestimo;

    public ContaFisica(){
        super();
    }

    public ContaFisica(String titular, String numeroDaConta, double saldo, double limiteEmprestimo){
        super(titular, numeroDaConta, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void emprestimo (double emprestimo){
        if (emprestimo <= limiteEmprestimo){
            depositar(emprestimo);
        } else {
            System.out.println("Solicitação de emprestimo recusada!!!\n" +
                    "Limite menor que o solicitado!");
        }
    }
}
