public abstract class Employee {
    private  String name;
    private int edad;
    private  int salary;

    private boolean capacityofWork;

    public Employee(String name, int edad, int salary, boolean capacityofWork) {
        this.name = name;
        this.edad = edad;
        this.salary = salary;
        this.capacityofWork = capacityofWork;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isCapacityofWork() {
        return capacityofWork;
    }

    public void setCapacityofWork(boolean capacityofWork) {
        this.capacityofWork = capacityofWork;
    }
}
