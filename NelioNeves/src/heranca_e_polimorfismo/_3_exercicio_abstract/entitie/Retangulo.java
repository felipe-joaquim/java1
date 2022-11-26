package heranca_e_polimorfismo._3_exercicio_abstract.entitie;


import heranca_e_polimorfismo._3_exercicio_abstract.enums.Cor;

public class Retangulo extends Forma {

    private Double altura;
    private Double largura;

    public Retangulo(){
        super();
    }

    public Retangulo(Cor color, double altura, double largura){
        super(color);
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double area() {
        return altura*largura;
    }
}
