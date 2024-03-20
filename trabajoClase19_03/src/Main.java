
public class Main {
    public static void main(String[] args) {

        Oficial oficial1= new Oficial();
        oficial1.setName("Pedro");
        oficial1.setArea("Administracion");
        oficial1.setHours(30);
        System.out.println(oficial1.toString());
        oficial1.setHolidayAviable(true);
        oficial1.weekHours();
        oficial1.haveVacation();
        System.out.println("---------------");
        Tecnique tecnique1= new Tecnique();
        tecnique1.setName("Juan");
        tecnique1.setSpeciality("electricidad");
        tecnique1.setArea("Mantenimiento ");
        tecnique1.specialyOfTecnique();
        tecnique1.toString();
        System.out.println("-----------------");
        Directive directive1= new Directive();
        directive1.setName("Alfonso");
        directive1.setYears(67);
        directive1.setArea("Produccion");
        directive1.retirement();
        System.out.println(directive1.toString());
        System.out.println("----------------");
        Directive directive2= new Directive();
        directive2.setName("Maria ");
        directive2.setYears(47);
        directive2.setArea("Marketing");
        directive2.retirement();
        System.out.println(directive2.toString());

    }
}