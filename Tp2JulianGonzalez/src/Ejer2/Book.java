package Ejer2;

public abstract class Book  implements Lonable{
    private String autor;
    private boolean borrowed;
    private String tittle ;
    private String yearofPublication;

    public Book(String autor, boolean borrowed, String tittle, String yearofPublication) {
        this.autor = autor;
        this.borrowed = borrowed;
        this.tittle = tittle;
        this.yearofPublication = yearofPublication;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getYearofPublication() {
        return yearofPublication;
    }

    public void setYearofPublication(String yearofPublication) {
        this.yearofPublication = yearofPublication;
    }

@Override
    public void lenderBook(String bookName) {
        System.out.println("El libro esta siendo prestado");
        this.borrowed=true;

    }

    @Override
    public void returnBook(String bookName) {
        System.out.println("Se esta devolviendo el libro prestado");
        this.borrowed=false;
    }
}
