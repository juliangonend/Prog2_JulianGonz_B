package Animal.Clases;

public class Bird extends Animal{
    private String species;

    public Bird(String species) {
        this.species = species;
    }

    public Bird(String name, int year, String gender, String species) {
        super(name, year, gender);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public void animalSound() {
        System.out.println("El pajaro silva ");
    }
    public void information(){
        System.out.println("Pajaro "+ getName()+ " de la especie "+ getSpecies() + "tiene unos "+ getYear() +" y su genero es "+ getGender());
    }
}
