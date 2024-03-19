package Vehicle.Classes;

public class Car extends Vehicle{
    private int velocity;
    private int displacement;

    public Car(String color, int wheels) {
        super(color, wheels);
    }

    public Car(String color, int wheels, int velocity, int displacement) {
        super(color, wheels);
        this.velocity = velocity;
        this.displacement = displacement;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocidad) {
        this.velocity = velocidad;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    @Override
    public void catalog() {
        System.out.println("Se ha encontrado el auto con " + getWheels()+ " ruedas");
    }
}
