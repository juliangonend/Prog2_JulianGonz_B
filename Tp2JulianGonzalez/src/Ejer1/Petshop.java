package Ejer1;

import java.util.ArrayList;

public class Petshop {
    private  String name;
    private ArrayList<Animal> animalStock = new ArrayList<>();

    public Petshop( String name) {
        this.name=name;
    }

    public void addAnimal(Animal animal){
            animalStock.add(animal);
    }
    public void feedAnimal(String name){
        for (Animal animal:animalStock
             ) {
            if (animal.getName()==name){
                System.out.println("Alimentando al animal "+ animal.getName());
            }
        }
    }
    public void printListAnimal(){
        System.out.println("Lista de animales");
        for (Animal animal: animalStock
             ) {
            System.out.println("    >  "+animal.getAnimalType()+ "  : "+ animal.getName());
        }
    }
    public void sendAnimal(String  name){
        int animalIndex=0;
        for (Animal animal: animalStock
             ) {
            if (animal.getName()==name){
                System.out.println("Vendiendo animal  "+ animal.getName());
                animalIndex=animalStock.indexOf(animal);
            }
        }
        animalStock.remove(animalIndex);

    }
}
