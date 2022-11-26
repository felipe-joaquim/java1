package heranca_e_polimorfismo._3_exercicio_abstract.entitie;

import heranca_e_polimorfismo._3_exercicio_abstract.enums.Cor;

public abstract class Forma {
    protected Cor color;

    public Forma(){

    }

    public Forma(Cor color){
        this.color = color;
    }

    public abstract double area();

    public Cor getColor() {
        return color;
    }

    public void setColor(Cor color) {
        this.color = color;
    }
}
