package enumClass;

public class Departement {
    private String departementName;

    public Departement(){

    }

    public Departement (String departementName){
        this.departementName = departementName;
    }

    public String getDepartementName() {
        return departementName;
    }

    public void setDepartementName(String departementName) {
        this.departementName = departementName;
    }
}
