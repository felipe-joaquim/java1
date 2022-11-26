package heranca_e_polimorfismo._3_exercicio_abstract.entitie;

import heranca_e_polimorfismo._3_exercicio_abstract.enums.Cor;

public class Circulo extends Forma {
    private Double raio;
    private Double pi = Math.PI;

    public Circulo(){
        super();
    }

    public Circulo(Cor color, double raio){
        super(color);
        this.raio = raio;
    }

    @Override
    public double area(){
        return pi*Math.pow(raio, 2);
    }
}
