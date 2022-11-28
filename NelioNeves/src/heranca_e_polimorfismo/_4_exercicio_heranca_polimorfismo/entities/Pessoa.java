package heranca_e_polimorfismo._4_exercicio_heranca_polimorfismo.entities;

public abstract class Pessoa {
    protected String name;
    protected Double ganhoAnual;

    public Pessoa(){

    }

    public Pessoa (String name, double ganhoAnual){
        this.name=name;
        this.ganhoAnual = ganhoAnual;
    }

    public abstract double impostos();


}
