package Bidimensional;

import java.util.ArrayList;

public class Book {
    private String tittle;
    private ArrayList <Person> clientBookList= new ArrayList<>();

    public Book(String tittle) {
        this.tittle = tittle;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public ArrayList<Person> getClientBookList() {
        return clientBookList;
    }

    public void setClientBookList(ArrayList<Person> clientBookList) {
        this.clientBookList = clientBookList;
    }

    public void addOwnerBooks(Person client){
        this.clientBookList.add(client);
    }
    public void printListClient(){
        System.out.println("La lista de personas que poseen el libro "+ this.getTittle()+ " es : ") ;
        for (Person client:clientBookList
        ) {

            System.out.println("       Cliente ) " + client.getName());

        }
    }
}
