package Animal.Clases;

public class Dog extends Animal {
    private String race;


    public Dog(String race ) {
        this.race = race;

    }

    public Dog(String name, int year, String gender, String race ) {
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
        System.out.println("El perro ladra ");
    }
    public void information(){
        System.out.println("Perro "+ getName()+ " de la especie "+ getRace() + "tiene unos "+ getYear() +" y su genero es "+ getGender());
    }
}
