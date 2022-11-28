package heranca_e_polimorfismo._4_exercicio_heranca_polimorfismo.entities;

public class PessoaJuridica extends Pessoa {
    private Integer quantFuncionarios;

    public PessoaJuridica(){
        super();
    }

    public PessoaJuridica(String name, double ganhoAnual, int quantFuncionarios){
        super(name, ganhoAnual);
        this.quantFuncionarios = quantFuncionarios;
    }

    @Override
    public double impostos() {
        double totalImpostos = 0.0;

        if(quantFuncionarios<=10){
            totalImpostos = ganhoAnual*16/100;
        } else if (quantFuncionarios>10) {
            totalImpostos = ganhoAnual*14/100;
        }

        return totalImpostos;
    }

    @Override
    public String toString() {
        return "name=" + name+"; Impostos: "+impostos();
    }
}
