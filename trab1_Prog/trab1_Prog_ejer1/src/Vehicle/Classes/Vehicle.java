package Vehicle.Classes;

public abstract class Vehicle {

    private String color;
    private  int wheels;

    public Vehicle(String color, int wheels) {
        this.color = color;
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
   }
    public abstract void catalog();
}
