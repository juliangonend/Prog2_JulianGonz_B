package Animal.Clases;

public class Cat extends Animal{
    private String race;

    public Cat(String race) {
        this.race = race;
    }

    public Cat(String name, int year, String gender, String race) {
        super(name, year, gender);
        this.race = race;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public void animalSound() {
        System.out.println("El gato Mauia");
    }
    public void information(){
        System.out.println("Gato "+ getName()+ " de la especie "+ getRace() + "tiene unos "+ getYear() +" y su genero es "+ getGender());
    }
}
