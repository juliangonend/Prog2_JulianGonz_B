package Agregacion;

public class Employee {
    private String companyPosition;
    private String name;

    public Employee( String name, String companyPosition) {
        this.companyPosition = companyPosition;
        this.name = name;
    }

    public String getCompanyPosition() {
        return companyPosition;
    }

    public void setCompanyPosition(String companyPosition) {
        this.companyPosition = companyPosition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
