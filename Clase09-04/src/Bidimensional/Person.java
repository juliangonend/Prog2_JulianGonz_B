package Bidimensional;

import java.util.ArrayList;

public class Person {
     private ArrayList<Book> listBooks= new ArrayList<>();
    private String name ;

    public Person(String name) {
        this.name = name;
    }

    public ArrayList<Book> getListBooks() {
        return listBooks;
    }

    public void setListBooks(ArrayList<Book> listBooks) {
        this.listBooks = listBooks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addBooks(Book book){
        this.listBooks.add(book);
        book.addOwnerBooks(this);
    }
    public void printListBook(){
        System.out.println("La lista de libros de "+ this.getName()+ " es : ") ;
        for (Book book:listBooks
             ) {

            System.out.println("       Libro ) " + book.getTittle());

        }
    }
}
