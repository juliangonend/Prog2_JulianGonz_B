package Ejer2;

public class Childish extends Book{
    private int ageRecomended;

    public Childish(String autor, boolean borrowed, String tittle, String yearofPublication, int ageRecomended) {
        super(autor, borrowed, tittle, yearofPublication);
        this.ageRecomended = ageRecomended;
    }

    public int getAgeRecomended() {
        return ageRecomended;
    }

    public void setAgeRecomended(int ageRecomended) {
        this.ageRecomended = ageRecomended;
    }
}
