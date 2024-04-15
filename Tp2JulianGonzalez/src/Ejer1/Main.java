package Ejer1;

public  class Main {
    public static void main(String[] args) {

        Dog perro = new Dog(2,"perro", "Davo", 230000, "Labraador", true);
        Cat gato= new Cat(1,"gato", "Garfield",100000,"montes", true);
        Bird pajaro= new Bird(1,"pajaro", "Bird", 40000,"colibri",true);
        Fish pez= new Fish(3,"pez","pecesito", 10000,"azul", "globo");

        perro.toString();
        gato.toString();
        pajaro.toString();
        pez.toString();
        Petshop elLadrido=new Petshop("El ladrido");
        elLadrido.addAnimal(perro);
        elLadrido.addAnimal(gato);
        elLadrido.addAnimal(pajaro);
        elLadrido.addAnimal(pez);
        elLadrido.feedAnimal("Davo");
        elLadrido.printListAnimal();
        elLadrido.sendAnimal("Garfield");
        elLadrido.printListAnimal();
    }
}
