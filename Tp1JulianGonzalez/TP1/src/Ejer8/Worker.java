package Ejer8;

public class Worker extends Employee{
    private String area;

    public Worker(String name, int edad, int salary, boolean capacityofWork, String area) {
        super(name, edad, salary, capacityofWork);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    public void produce(){
        System.out.println("El empleado "+ this.getName()+ " esta produciendo en el area de : " + this.getArea());
    }
}
