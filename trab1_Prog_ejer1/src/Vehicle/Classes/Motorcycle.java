package Vehicle.Classes;

public class Motorcycle extends Bycicle{

    private  int velocity;
    private int displacement;

    public Motorcycle(String color, int wheels, String type) {
        super(color, wheels, type);
    }

    public Motorcycle(String color, int wheels, String type, int velocity, int displacement) {
        super(color, wheels, type);
        this.velocity = velocity;
        this.displacement = displacement;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }
    @Override
    public void catalog() {
        System.out.println("Se ha encontrado la motocicleta con " + getWheels()+ " ruedas");
    }

}
