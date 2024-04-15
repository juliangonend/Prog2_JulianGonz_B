package Ejer2;

import java.util.ArrayList;

public class Library implements Lonable {
    private ArrayList<Book> listBook = new ArrayList<>();

    public Library() {
    }

    public ArrayList<Book> getListBook() {
        return listBook;
    }

    public void setListBook(ArrayList<Book> listBook) {
        this.listBook = listBook;
    }
    public void addBooks(Book book){

        listBook.add(book);
    }
    public void aviableBooks(){
        System.out.println("La lista de los libros disponibles es :");
        for (Book book:listBook
             ) {
            if (!book.isBorrowed()){
                System.out.println("El libro "+book.getTittle()+" esta disponible");
            }
        }
        System.out.println("-------------");
    }

    @Override
    public void lenderBook(String bookName) {
        for (Book book:listBook
             ) {
            if (bookName.equals(book.getTittle())) {
                if (!book.isBorrowed()) {
                    System.out.println("El libro" + book.getTittle() + " esta siendo prestado");
                    book.setBorrowed(true);}
                    else {
                    System.out.println("El libro "+ book.getTittle()+" ya a sido prestado espere a que sea devuelto");
                }
            }
            }
        }



    @Override
    public void returnBook(String bookName) {
        for (Book book:listBook
        ) {
            if (book.isBorrowed()) {
                if (bookName.equals(book.getTittle())) {
                    System.out.println("El libro" + book.getTittle() + " esta siendo prestado");
                    book.setBorrowed(false);
                } else {
                    System.out.println("El libro "+ book.getTittle()+" no esta prestado");
                }
            }
        }
    }

}
