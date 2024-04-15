package Ejer1;

public class Dog extends Animal{
    private String race;
    private boolean vaccinated;

    public Dog(int age, String animalType, String name, double price, String race, boolean vaccinated) {
        super(age, animalType, name, price);
        this.race = race;
        this.vaccinated = vaccinated;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    @Override
    public String toString() {
        String vaccinated= (this.isVaccinated())? "vacunado": "no vacunado";
        return  super.toString()+ "\n"+
                "raza : "+ this.getRace() + "\n" +
                "esta vacunado : "+ vaccinated ;

    }
}
