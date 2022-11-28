package heranca_e_polimorfismo._4_exercicio_heranca_polimorfismo.production;

import heranca_e_polimorfismo._4_exercicio_heranca_polimorfismo.entities.Pessoa;
import heranca_e_polimorfismo._4_exercicio_heranca_polimorfismo.entities.PessoaFisica;
import heranca_e_polimorfismo._4_exercicio_heranca_polimorfismo.entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Pessoas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<Pessoa> listaPessoas = new ArrayList<>();

        System.out.print("Quantidade de dados a serem inseridos: ");
        Integer quant = scan.nextInt();

        for (int i = 0; i < quant; i++) {
            System.out.println("Dados do "+(i+1)+" pagador: ");
            System.out.print("Física [f] ou Jurídica [j]:");
            Character tipo = scan.next().charAt(0);
            scan.nextLine();
            System.out.print("Nome:");
            String name = scan.nextLine();
            System.out.print("Ganho anual: ");
            Double ganhoAnual = scan.nextDouble();
            if(tipo=='f'){
                System.out.print("Gastos com saúde: ");
                Double gastosSaude = scan.nextDouble();
                PessoaFisica pessoaF = new PessoaFisica(name, ganhoAnual, gastosSaude);
                listaPessoas.add(pessoaF);
            } else if (tipo=='j'){
                System.out.print("Quantidade de funcionários: ");
                Integer quantF = scan.nextInt();
                PessoaJuridica pessoaJ = new PessoaJuridica(name, ganhoAnual, quantF);
                listaPessoas.add(pessoaJ);
            }

        }
        System.out.println("Impostos dos pagadores: ");
        for (Pessoa p: listaPessoas) {
            System.out.print("Name: "+p.toString()+"\n");

        }
    }
}
