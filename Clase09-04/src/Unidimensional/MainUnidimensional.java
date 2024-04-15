package Unidimensional;

public class MainUnidimensional {
    public static  void main(String[]args){
        University Unc= new University("UNC");
        University Utn= new University("UTN");
        Student student= new Student("Julian", Unc);
        student.printUniversity();
        student.changeUniversity(Utn);

    }
}
