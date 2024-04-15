package Ejer1;

public class Fish extends Animal{
    private String color;
    private String species;

    public Fish(int age, String animalType, String name, double price, String color, String species) {
        super(age, animalType, name, price);
        this.color = color;
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() +"\n" +
                "color : " +  this.getColor() +"\n" +
                "especie : " +  this.getSpecies();
    }
}
