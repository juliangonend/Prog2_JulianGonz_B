package Bidimensional;

public class BidimensionalMain {
    public static  void main(String []args){

        Book book1= new Book("El principito");
        Book book2= new Book("Harry Potter");
        Book book3= new Book("Juegos del Hambre");
        Book book4= new Book("La Biblia");
        Person person1= new Person("Pedro");
        Person person2= new Person("Juan");
        Person person3= new Person("Alfoso");
        Person person4= new Person("Camila");
        Person person5= new Person("Chacho");
        person1.addBooks(book1);
        person1.addBooks(book2);
        person1.addBooks(book4);
        person1.printListBook();
        System.out.println("----------");
        person2.addBooks(book1);
        person2.addBooks(book3);
        person2.addBooks(book4);
        person2.printListBook();
        book2.printListClient();
        System.out.println("----------");
        person3.addBooks(book1);
        person3.addBooks(book2);
        person3.addBooks(book3);
        book3.printListClient();
        System.out.println("----------");
        person4.addBooks(book1);
        book4.printListClient();
        System.out.println("----------");
    }
}
