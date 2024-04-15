package Composicion;

import java.util.ArrayList;

public class House {
    private  Door []doorList ;



    public  House(int doorAmount){
        doorList= new Door[doorAmount];
        for (int i = 0; i < doorAmount; i++) {
            doorList[i]= new Door("material-desconocido");
        }
    }
    public void modifyDoorMaterial(int doorNum, String material) {
        if (doorNum >= 0 && doorNum < doorList.length) {
            doorList[doorNum].setMaterial(material);
        } else {
            System.out.println("El número de puerta está fuera de rango.");
        }
    }
    public Door[] getDoorList() {
        return doorList;
    }

    public void setDoorList(Door[] doorList) {
        this.doorList = doorList;
    }

    public void printDoorList(){
        System.out.println("La lista de las puertas son :");
        for (int i = 0; i < doorList.length; i++) {
            System.out.println("-->La puerta : "+ (i+1) + " esta echa con "+ doorList[i].getMaterial());
        }
    }
}
