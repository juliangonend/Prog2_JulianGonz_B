package Composicion;

public class MainComposicion {
    public static void main (String[]args){
        House house = new House(4);
        house.modifyDoorMaterial(1,"Hierro");
        house.modifyDoorMaterial(2,"Madera");
        house.modifyDoorMaterial(3,"Hierro");
        house.printDoorList();

    }
}
