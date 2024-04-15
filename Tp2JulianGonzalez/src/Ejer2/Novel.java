package Ejer2;

public class Novel extends Book{
    private String gender ;

    public Novel(String autor, boolean borrowed, String tittle, String yearofPublication, String gender) {
        super(autor, borrowed, tittle, yearofPublication);
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
