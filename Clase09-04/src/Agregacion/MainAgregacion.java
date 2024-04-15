package Agregacion;

public class MainAgregacion {
    public static void main(String []args){
        Employee employee1 = new Employee("Julian", "Director");
        Employee employee2 = new Employee("Pedro", "Secretario");
        Employee employee3 = new Employee("Manuel", "Mantenimiento");
        Employee employee4 = new Employee("Alfonso", "Operario");
        Employee employee5 = new Employee("Juan", "Operario");
        Employee employee6 = new Employee("Ricardo", "Comunity Manager");
        Employee employee7 = new Employee("Roberto", "Contador");
        Employee employee8 = new Employee("Juana", "Secretaria");

        Deparment finance = new Deparment("Finanzas");
        Deparment marketing = new Deparment("Marketing");
        Deparment producction = new Deparment("Produccion");
        Deparment maintenance = new Deparment("Mantenimiento");

        Company company = new Company();
        company.addDeparments(finance);
        company.addDeparments(marketing);
        company.addDeparments(producction);
        company.addDeparments(maintenance);
        finance.addEmployee(employee1);
        finance.addEmployee(employee2);
        finance.addEmployee(employee7);
        finance.addEmployee(employee8);
        maintenance.addEmployee(employee3);
        producction.addEmployee(employee4);
        producction.addEmployee(employee5);
        marketing.addEmployee((employee6));
        company.printCompanyList();


    }
}
