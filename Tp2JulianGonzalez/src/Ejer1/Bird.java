package Ejer1;

public class Bird extends  Animal{
    private String species;
    private boolean speak;

    public Bird(int age, String animalType, String name, double price, String species, boolean speak) {
        super(age, animalType, name, price);
        this.species = species;
        this.speak = speak;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isSpeak() {
        return speak;
    }

    public void setSpeak(boolean speak) {
        this.speak = speak;
    }

    @Override
    public String toString() {
        String speak= this.isSpeak() ? "habla": "no habla";
        return super.toString() + "\n" +
                "especie :"+ this.getSpecies()+ "\n" +
                "habla? :"+ speak;
    }
}
