package Animal;

import Animal.Clases.Bird;
import Animal.Clases.Cat;
import Animal.Clases.Dog;

public class Main {

    public static void main(String[] args) {
        Dog salchicha= new Dog("Pancho", 3, "masculino", "salchicha");
        Cat michi = new Cat("michi", 6, "femenino", "americano");
        Bird cata= new Bird("Catalina", 2, "femenino", "cata");

        // Llamadas a los métodos animalSound()
        System.out.println("--------------");
        salchicha.animalSound();
        salchicha.information();
        System.out.println("---------------");
        michi.animalSound();
        michi.information();
        System.out.println("-----------------");
        cata.animalSound();
        cata.information();
    }
}
