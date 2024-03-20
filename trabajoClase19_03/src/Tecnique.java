public class Tecnique extends  Operational{
    private String speciality;
    public Tecnique() {
    }

    public Tecnique(String speciality) {
        this.speciality = speciality;
    }

    public Tecnique(String area, boolean holidayAviable, String speciality) {
        super(area, holidayAviable);
        this.speciality = speciality;
    }

    public Tecnique(String name, String area, boolean holidayAviable, String speciality) {
        super(name, area, holidayAviable);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    public void specialyOfTecnique(){
        System.out.println("El tecnico "+ this.getName()+ " es especialista en "+ this.getSpeciality() + " y trabaja en el area de "+ this.getArea());
    }
    @Override
    public String toString() {

        String s = ("El nombre del tecnico es : " + this.getName() + " pertenece al area de "+ this.getArea() + " y su especialida es "+ this.getSpeciality() );
        return s;
    }
}
