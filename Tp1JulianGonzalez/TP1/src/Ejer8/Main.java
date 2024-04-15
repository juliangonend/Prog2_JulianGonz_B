package Ejer8;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Worker worker1= new Worker("Juan", 34,170000,true,"Empaquetamiento");
        Worker worker2= new Worker("Pedro", 22,100000,false,"Observacion");
        Worker worker3= new Worker("Fausti", 18,130000,true,"Produccion");
        Worker worker4= new Worker("Anibal", 54,700000,false,"Seguridad");

        worker1.produce();
        worker2.produce();
        worker3.produce();
        worker4.produce();

        Manager manager1= new Manager("Alvaro", 40, 1000000,true, "Finanzas");
        Manager manager2= new Manager("Marcela", 50, 1300000,true, "Marketing");
        Manager manager3= new Manager("Humberto", 35, 1500000,true, "Produccion");


        manager1.addTask("reunion sobre presupuesto 2024");
        manager1.addTask("reunion ganancias  2024");
        manager1.addTask("reunion sobre presupuesto 2024");
        manager1.printTask();
        manager2.addTask("reunion sobre campaña 2024");
        manager2.addTask("Subir publicasiones a redes");
        manager2.printTask();
        manager3.addTask("mejorar las automatizaciones");
        manager3.addTask("revisar salarios trabajadores");
        manager3.addTask("comprobar cantidad de stock");
        manager3.printTask();
    }
}