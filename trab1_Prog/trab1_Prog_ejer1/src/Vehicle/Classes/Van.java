package Vehicle.Classes;

public class Van extends Car{
    private  double chargeCapacity;

    public Van(String color, int wheels, double chargeCapacity) {
        super(color, wheels);
        this.chargeCapacity = chargeCapacity;
    }

    public Van(String color, int wheels, int velocity, int displacement, double chargeCapacity) {
        super(color, wheels, velocity, displacement);
        this.chargeCapacity = chargeCapacity;
    }

    public double getChargeCapacity() {
        return chargeCapacity;
    }

    public void setChargeCapacity(double chargeCapacity) {
        this.chargeCapacity = chargeCapacity;
    }
    @Override
    public void catalog() {
        System.out.println("Se ha encontrado la camioneta con " + getWheels() + " ruedas");
    }
}
