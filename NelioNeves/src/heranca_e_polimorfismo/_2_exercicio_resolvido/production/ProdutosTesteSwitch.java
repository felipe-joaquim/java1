package heranca_e_polimorfismo._2_exercicio_resolvido.production;

import heranca_e_polimorfismo._2_exercicio_resolvido.entities.Produto;
import heranca_e_polimorfismo._2_exercicio_resolvido.entities.ProdutoImportado;
import heranca_e_polimorfismo._2_exercicio_resolvido.entities.ProdutoUsado;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProdutosTesteSwitch {
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

            switch (tipoProduto) {
                case 'c':
                    System.out.print("Name: ");
                    String name = scan.nextLine();
                    System.out.print("Price: ");
                    Double price = scan.nextDouble();
                    Produto produto = new Produto(name, price);
                    listaProdutos.add(produto);

                    break;
                case 'i':
                    System.out.print("Name: ");
                    String nameI = scan.nextLine();
                    System.out.print("Price: ");
                    Double priceI = scan.nextDouble();
                    System.out.print("Customs fee: ");
                    Double customsFee = scan.nextDouble();
                    Produto produtoI = new ProdutoImportado(nameI, priceI, customsFee);

                    listaProdutos.add(produtoI);
                    break;

                case 'u':
                    System.out.print("Name: ");
                    String nameU = scan.nextLine();
                    nameU += " (usado)";
                    System.out.print("Price: ");
                    Double priceU = scan.nextDouble();
                    scan.nextLine();
                    System.out.print("Manufacture date (DD/MM/YYYY) : ");
                    String data = scan.nextLine();
                    Produto produtoU = new ProdutoUsado(nameU, priceU, data);

                    listaProdutos.add(produtoU);
                    break;
            }
        }
        System.out.println("PRICE TAGS: ");
        for (Produto produto:listaProdutos) {
            System.out.println(produto.priceTag());
        }
    }
}
