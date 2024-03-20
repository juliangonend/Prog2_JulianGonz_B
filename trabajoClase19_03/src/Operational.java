public class Operational extends Employee{
    private String area;
    private boolean holidayAviable=true;

    public Operational() {
    }

    public Operational(String area, boolean holidayAviable) {
        this.area = area;
        this.holidayAviable = holidayAviable;
    }

    public Operational(String name, String area, boolean holidayAviable) {
        super(name);
        this.area = area;
        this.holidayAviable = holidayAviable;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }


    public void setHolidayAviable(boolean holidayAviable) {
        this.holidayAviable = holidayAviable;
    }

    public void haveVacation(){
        if (this.holidayAviable){
            System.out.println("El empleado ya no tiene las vacaciones disponibles para este anio");

        }else{
            System.out.println("El empleado puede tomarse las 2 semanas devacaciones ");
            this.holidayAviable=true;
        }
    }


    @Override
    public String toString() {
        String s= ("El nombre del oficial es : " + this.getName() + "pertenece al area de "+ this.getArea() );
        return s;
    }
}
