package Ejer8;

import java.util.ArrayList;

public class Manager extends  Employee{
    private  String  deparment;
    private ArrayList<String> tasks= new ArrayList<>();

    public Manager(String name, int edad, int salary, boolean capacityofWork, String deparment) {
        super(name, edad, salary, capacityofWork);
        this.deparment = deparment;
    }

    public String getDeparment() {
        return deparment;
    }

    public void setDeparment(String deparment) {
        this.deparment = deparment;
    }

    public ArrayList<String> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<String> tasks) {
        this.tasks = tasks;
    }

    public void addTask(String task){
        this.tasks.add(task);
    }
    public void printTask() {
        System.out.println("Las actividades que tiene planificada el " + this.getName() + " en el departamento de " + this.getDeparment() + " son:");
        for (String task : this.getTasks()) {
            System.out.println("- " + task);
        }
    }

}
