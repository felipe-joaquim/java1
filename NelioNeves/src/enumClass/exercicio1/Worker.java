package enumClass.exercicio1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private Departement departement;
    private Double baseSalary;
    private WorkerLevel level;
    private List<HourContract> contract = new ArrayList<>();

    public Worker(){

    }
    public Worker(String name, Departement departement, Double baseSalary, WorkerLevel level) {
        this.name = name;
        this.departement = departement;
        this.baseSalary = baseSalary;
        this.level = level;
    }

    public void addContract (HourContract contract){
        this.contract.add(contract);
    }

    public void removeContract(HourContract contract){
        this.contract.remove(contract);
    }

    public double income(int year, int month){
        double total = baseSalary;

        Calendar cal = Calendar.getInstance();

        for (HourContract cont : contract) {
            cal.setTime(cont.getDate());
            int cYear = cal.get(Calendar.YEAR);
            int cMonth = cal.get(Calendar.MONTH) + 1 ;

            if( (cYear == year) && (cMonth==month)){
                total += cont.totalValue();
            }

        }

        return total;
    }

    public List<HourContract> getContract(){
        return this.contract;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Departement getDepartment() {
        return departement;
    }

    public void setDepartment(Departement departement) {
        this.departement = departement;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }
}
