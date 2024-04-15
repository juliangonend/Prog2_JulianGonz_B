package Ejer2;

public class Academic extends Book {
    private  String subject;

    public Academic(String autor, boolean borrowed, String tittle, String yearofPublication, String subject) {
        super(autor, borrowed, tittle, yearofPublication);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
