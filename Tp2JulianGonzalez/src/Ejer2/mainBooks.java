package Ejer2;

public class mainBooks {
    public static  void main (String []args){
        Childish childishBook= new Childish("Nick", false,"Gaturro", "2016",4);
        Novel novel1= new Novel("Juan", false,"El amor el amor", "2020","romance");
        Academic mathBook= new Academic("Alfonso",false,"Ecuasiones e Inecuasiones","1980","Matematica" );
        Childish childishBook2= new Childish("Nick", false,"Gaturro2", "2017",4);
        Novel novel2= new Novel("Matias", false,"EL misterio de la Joya Robada", "2020","policial");
        Academic physical= new Academic("Mauro",false,"La ley de Gravedad","2000","Fisica" );
        Childish childishBook3= new Childish("Nick", false,"Gaturro", "2016",4);
        Novel novel3= new Novel("Juan", false,"El principito", "2005","No-ficccion");
        Academic science= new Academic("Pedro",false,"De lo atomico a lo global","1990","Ciencia" );
        Library library = new Library();

        library.addBooks(childishBook);
        library.addBooks(novel1);
        library.addBooks(mathBook);
        library.addBooks(childishBook2);
        library.addBooks(novel3);
        library.addBooks(physical);
        library.addBooks(childishBook3);
        library.addBooks(novel2);
        library.addBooks(science);
        library.aviableBooks();
        library.lenderBook("Gaturro");
        library.aviableBooks();
        library.lenderBook("El principito");
        library.lenderBook("La ley de Gravedad");
        library.returnBook(childishBook.getTittle());
        library.returnBook(mathBook.getTittle());
        library.returnBook(science.getTittle());

    }

}
