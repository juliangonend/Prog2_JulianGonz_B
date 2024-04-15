package Ejer1;

public class Cat extends Animal{
    private String race;
    private boolean sterilized;

    public Cat(int age, String animalType, String name, double price, String race, boolean sterilized) {
        super(age, animalType, name, price);
        this.race = race;
        this.sterilized = sterilized;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public boolean isSterilized() {
        return sterilized;
    }

    public void setSterilized(boolean sterilized) {
        this.sterilized = sterilized;
    }

    @Override
    public String toString() {
        String sterilized= this.isSterilized()? "esterilizado ": "no esterilizado ";
        return super.toString() +"\n"+
                "raza : "+ this.getRace()+"\n"+
                "esta esterilizado : "+  sterilized;
    }
}
