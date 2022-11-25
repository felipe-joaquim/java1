package heranca_e_polimorfismo.exercicio_resolvido1.production;

import heranca_e_polimorfismo.exercicio_resolvido1.entities.Funcionario;
import heranca_e_polimorfismo.exercicio_resolvido1.entities.FuncionarioTerceirizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class FuncionariosTeste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<Funcionario> listaFuncionario = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        Integer quantEmployees = scan.nextInt();

        for (int i = 0; i < quantEmployees; i++) {
            System.out.println("Dados do "+(i+1)+"º funcionario:");
            System.out.print("Funcionário terceirizado (s/n) ?");
            if (scan.next().charAt(0) == 'n'){
                scan.nextLine();
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Hours: ");
                Integer hours = scan.nextInt();
                System.out.print("Value per hours: ");
                Double valuePerHours = scan.nextDouble();
                Funcionario funcionario = new Funcionario(name, hours, valuePerHours);

                listaFuncionario.add(funcionario);
            } else {
                scan.nextLine();
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Hours: ");
                Integer hours = scan.nextInt();
                System.out.print("Value per hours: ");
                Double valuePerHours = scan.nextDouble();
                System.out.print("Additional charge: ");
                Double additionalCharge = scan.nextDouble();
                Funcionario funcionarioT = new FuncionarioTerceirizado(name, hours, valuePerHours, additionalCharge);

                listaFuncionario.add(funcionarioT);


            }

        }

        System.out.print("Payments: ");
        for (Funcionario func : listaFuncionario ) {
            System.out.print("\nFuncionário: "+func.getName());
            System.out.print(" - "+func.payment());
        }


    }
}
