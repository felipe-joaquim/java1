package heranca_e_polimorfismo._2_exercicio_resolvido.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class ProdutoUsado extends Produto {
    private Date dataDeValidade;
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");


    public ProdutoUsado(){
        super();
    }

    public ProdutoUsado(String name, double price, String dataDeValidade) throws ParseException {
        super(name, price);
        this.setDataDeValidade(dataDeValidade);
    }

    @Override
    public String priceTag(){
        return super.priceTag()+";\n Manufacture Date: "+format.format(dataDeValidade);
    }

    public void setDataDeValidade(String dataString) throws ParseException {
        this.dataDeValidade = format.parse(dataString);
    }
}
