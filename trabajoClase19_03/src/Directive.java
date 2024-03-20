public class Directive extends Employee{
    private int years;
    private String area;

    public Directive() {
    }

    public Directive(int years, String area) {
        this.years = years;
        this.area = area;
    }

    public Directive(String name, int years, String area) {
        super(name);
        this.years = years;
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public void retirement(){
        if(this.getYears()>=65){
            System.out.println("El directivo "+ this.getName()+ " tiene que jubilarse ya que es mayor a 65 anios ");
        }else{
            System.out.println("El directivo "+ this.getName()+ "puede seguir trabajando en la empresa ya que es menor a 65 anios");
        }
    }
    @Override
    public String toString() {
        return "El nombre del directivo es : "+ this.getName()+ " es el director del area de "+ this.getArea();
    }
}
