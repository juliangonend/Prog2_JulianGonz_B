package Agregacion;

import java.util.ArrayList;

public class Deparment {
    private String deparmentName;
    private ArrayList<Employee> listEmployee = new ArrayList<>();

    public Deparment(String deparmentName) {
        this.deparmentName = deparmentName;
    }

    public String getDeparmentName() {
        return deparmentName;
    }

    public void setDeparmentName(String deparmentName) {
        this.deparmentName = deparmentName;
    }

    public ArrayList<Employee> getListEmployee() {
        return listEmployee;
    }

    public void setListEmployee(ArrayList<Employee> listEmployee) {
        this.listEmployee = listEmployee;
    }
    public void addEmployee(Employee employee){
        listEmployee.add(employee);
    }
    public void printDeparmentList(){
        for (Employee employee:listEmployee
        ) {
            System.out.println("       -> "+employee.getName() +" trabaja como : "+ employee.getCompanyPosition());
        }
    }
}
