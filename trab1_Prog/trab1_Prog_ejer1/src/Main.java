import Vehicle.Classes.Bycicle;
import Vehicle.Classes.Car;
import Vehicle.Classes.Motorcycle;
import Vehicle.Classes.Van;

public class Main {
    public static void main(String[] args) {

        Car auto1=new Car("rojo",4,210,6);
        Van camioneta1= new Van("negra",4,210,12,280.2);
        Bycicle bicicleta1= new Bycicle("azul",2,"deportiva");
        Motorcycle moto1= new Motorcycle("blanca",2,"deportiva",100,4);
        auto1.catalog();
        camioneta1.catalog();
        bicicleta1.catalog();
        moto1.catalog();

    }
}