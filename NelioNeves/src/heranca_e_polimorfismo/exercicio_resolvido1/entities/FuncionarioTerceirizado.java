package heranca_e_polimorfismo.exercicio_resolvido1.entities;

public class FuncionarioTerceirizado extends Funcionario {
    private Double additionalCharge;

    public FuncionarioTerceirizado(String name, int hours, double valuePerHours, double additionalCharge){
        super(name, hours, valuePerHours);
        this.additionalCharge = additionalCharge;

    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment(){
        return super.payment()+(additionalCharge*110/100);
    }
}
