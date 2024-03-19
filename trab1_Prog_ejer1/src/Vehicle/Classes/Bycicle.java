package Vehicle.Classes;

public class Bycicle extends Vehicle{
    private String type;

    public Bycicle(String color, int wheels, String type) {
        super(color, wheels);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void catalog() {
        System.out.println("Se ha encontrado la bicicleta con " + getWheels()+ " ruedas");
    }
}
