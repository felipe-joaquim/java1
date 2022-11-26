package heranca_e_polimorfismo._3_exercicio_abstract.production;

import heranca_e_polimorfismo._3_exercicio_abstract.entitie.Circulo;
import heranca_e_polimorfismo._3_exercicio_abstract.entitie.Forma;
import heranca_e_polimorfismo._3_exercicio_abstract.entitie.Retangulo;
import heranca_e_polimorfismo._3_exercicio_abstract.enums.Cor;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class FormasTeste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<Forma> listaForma = new ArrayList<>();

        System.out.print("Quantidade de formas: ");
        Integer quant = scan.nextInt();

        for (int i = 0; i < quant; i++) {
            System.out.println("Dados da "+(1+i)+"º forma:");
            System.out.print("Retangulo (r) ou Circulo (c)? ");
            Character formaTipo = scan.next().charAt(0);
            scan.nextLine();
            System.out.print("Digite a cor (black, blue ou red) :");
            String color = scan.nextLine();
            color =  color.toUpperCase();

            if (formaTipo =='r'){
                System.out.print("Altura: ");
                Double altura = scan.nextDouble();
                System.out.print("Digite a largura: ");
                Double largura = scan.nextDouble();
                listaForma.add(new Retangulo(Cor.valueOf(color), altura, largura));
            } else if (formaTipo=='c'){
                System.out.print("Digite o raio: ");
                Double raio = scan.nextDouble();
                listaForma.add(new Circulo(Cor.valueOf(color),raio));
            }


        }
        System.out.println("Area da formas: ");
        for (Forma forma: listaForma ) {
            System.out.println(String.format("%.2f", forma.area() ));
        }
    }
}