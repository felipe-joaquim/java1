package enumClass.exercicio1.Testes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import enumClass.exercicio1.Departement;
import enumClass.exercicio1.HourContract;
import enumClass.exercicio1.Worker;
import enumClass.exercicio1.WorkerLevel;


/* Agradeço por chegar até aqui!
*   Segui o mesmo modelo em inglês oferecido pelo professor Nelio Alves no curso de Java por conta de problemas que estava tendo em ter o retorno do valor
*   correto do ganho do mês, após usar o substring do String consegui corrigir e não ter mais problemas a partir disso!!
* */


public class WorkerTest {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name:");
        String department = scan.nextLine();
        System.out.println("Enter worker data:\n");
        System.out.print("Name:");
        String name = scan.nextLine();
        System.out.print("Level: ");
        String level = scan.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = scan.nextDouble();

        Worker worker1 = new Worker(name, new Departement(department), baseSalary, WorkerLevel.valueOf(level));

        System.out.print("How many contracts to this worker?");
        int quant = scan.nextInt();

        for (int i = 0; i < quant; i++) {
            System.out.println("Enter contract #"+(i+1)+" data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            Date data = format.parse(scan.next());
            System.out.print("Value per hour: ");
            double valuePerHour = scan.nextDouble();
            System.out.println("Duration (hours): ");
            int duration = scan.nextInt();

            HourContract contract = new HourContract(data, valuePerHour, duration);
            worker1.addContract(contract);

        }
        scan.nextLine();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String dateIncome = scan.nextLine();
        int month = Integer.parseInt(dateIncome.substring(0, 2)) ;
        int year = Integer.parseInt(dateIncome.substring(3));
        System.out.println("Name: "+worker1.getName());
        System.out.println("Department: "+worker1.getDepartment().getDepartementName());
        System.out.println("Income for "+dateIncome+": "+worker1.income(year, month));


        scan.close();
    }
}
