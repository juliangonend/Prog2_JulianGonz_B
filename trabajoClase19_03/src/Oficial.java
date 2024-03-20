public class Oficial extends  Operational{
    private int hours;

    public Oficial() {

    }

    public Oficial(String area, boolean holidayAviable, int hours) {
        super(area, holidayAviable);
        this.hours = hours;
    }

    public Oficial(String name, String area, boolean holidayAviable, int hours) {
        super(name, area, holidayAviable);
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void weekHours(){
        int hours= this.getHours();
        int salary=hours*3000;
        if(hours>20){
            int extraHours=hours-20;
            salary+=extraHours*0.15;
            System.out.println("El empleado cobrara un 15 % mas las "+ extraHours+ " horas extras que realizo ");
        }
        System.out.println("El salario que cobrara esta semana es de "+ salary);
    }
    @Override
    public String toString() {
        String s= ("El nombre del oficial es : " + this.getName() + " pertenece al area de "+ this.getArea() );
        return s;
    }
}
