package heranca_e_polimorfismo.exercicio_resolvido2.entities;

public final class ProdutoImportado extends Produto {
    private Double taxaAlfandega;

    public ProdutoImportado(){
        super();
    }

    public ProdutoImportado(String name, double price, double taxaAlfandega){
        super(name, price);
        this.taxaAlfandega = taxaAlfandega;
    }

    @Override
    public String priceTag(){
        return super.priceTag()+";\n Customs Fee: "+taxaAlfandega;
    }

    public double totalPrice(){
        return super.price+taxaAlfandega;
    }

    public Double getTaxaAlfandega() {
        return taxaAlfandega;
    }

    public void setTaxaAlfandega(Double taxaAlfandega) {
        this.taxaAlfandega = taxaAlfandega;
    }
}
