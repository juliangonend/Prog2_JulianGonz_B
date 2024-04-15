package Agregacion;

import java.util.ArrayList;

public class Company {
    ArrayList<Deparment> listDeparments= new ArrayList<>();

    public Company() {}

    public ArrayList<Deparment> getListDeparments() {
        return listDeparments;
    }

    public void setListDeparments(ArrayList<Deparment> listDeparments) {
        this.listDeparments = listDeparments;
    }

    public void addDeparments(Deparment deparment){
        listDeparments.add(deparment);
    }
    public void printCompanyList(){
        for (Deparment deparment:listDeparments
             ) {
            System.out.println(deparment.getDeparmentName());
            deparment.printDeparmentList();
        }
    }
}

