package Animal.Clases;

public abstract class Animal {
    private String name;
    private int year;
    private String gender;

    public Animal() {
    }

    public Animal(String name, int year, String gender) {
        this.name = name;
        this.year = year;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public abstract void animalSound();
    public abstract  void information();
}
