package heranca_e_polimorfismo._2_exercicio_resolvido.production;

import heranca_e_polimorfismo._2_exercicio_resolvido.entities.Produto;
import heranca_e_polimorfismo._2_exercicio_resolvido.entities.ProdutoImportado;
import heranca_e_polimorfismo._2_exercicio_resolvido.entities.ProdutoUsado;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProdutosTesteIf {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<Produto> listaProdutos = new ArrayList<>();

        System.out.print("Quantidade de produtos: ");
        Integer quantProdutos = scan.nextInt();

        for (int i = 0; i < quantProdutos; i++) {
            System.out.println("Dados do "+(1+i)+"º produto: ");
            System.out.print("Qual o tipo do produto (Comum [c], Usado [u], Importado [i]) :");
            Character tipoProduto = scan.next().charAt(0);
            scan.nextLine();

            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Price: ");
            Double price = scan.nextDouble();

            if(tipoProduto=='c'){
                Produto produto = new Produto(name, price);
                listaProdutos.add(produto);
            } else if(tipoProduto=='i'){
                System.out.print("Customs fee: ");
                Double customsFee = scan.nextDouble();
                Produto produtoI = new ProdutoImportado(name, price, customsFee);

                listaProdutos.add(produtoI);
            } else if(tipoProduto =='u'){
                name += " (usado) ";
                System.out.print("Manufacture date (DD/MM/YYYY) : ");
                String data = scan.nextLine();
                Produto produtoU = new ProdutoUsado(name, price, data);

                listaProdutos.add(produtoU);
            }
        }
        System.out.println("PRICE TAGS: ");
        for (Produto produto:listaProdutos) {
            System.out.println(produto.priceTag());
        }
    }
}
