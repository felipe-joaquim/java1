package heranca_e_polimorfismo._4_exercicio_heranca_polimorfismo.entities;

public class PessoaFisica extends Pessoa {

    private Double gastosSaude;

    public PessoaFisica(){
        super();
    }

    public PessoaFisica(String name, double ganhoAnual, double gastosSaude){
        super(name, ganhoAnual);
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double impostos() {
        double totalImpostos = 0;

        if(this.ganhoAnual<=20000.0){
            totalImpostos = ganhoAnual*15/100;
        } else if (ganhoAnual>20000.0) {
            totalImpostos= ganhoAnual*25/100;
        }
        if (gastosSaude!=0){
            totalImpostos -= (gastosSaude*50/100);
        }
        return totalImpostos;
    }

    @Override
    public String toString() {
        return "name=" + name+"; Impostos: "+impostos();
    }
}
