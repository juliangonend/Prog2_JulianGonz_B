import java.util.Scanner;

public class Funcions {

    public static void addNumbers(int num1,int num2){
        int result;
        result= num1+num2;
        System.out.println("EL RESULTADO DE LA SUMA DEL N1: "+ num1+ " + " + num2 +" ES "+ result);
    }
    public static void subtractNumbers(int num1,int num2){
        int result;
        result= num1-num2;
        System.out.println("EL RESULTADO DE LA RESTA DEL N1: "+ num1+ " - " + num2 +" ES "+ result);
    }
    public static void multNumbers(int num1,int num2){
        int result;
        result= num1*num2;
        System.out.println("EL RESULTADO DE LA MULTIPLICASION DEL N1: "+ num1+ " * " + num2 +" ES "+ result);
    }
    public   static void divNUmbers(int num1,int num2){
        float result;
        result= num1/num2;
        System.out.println("EL RESULTADO DE LA DIVISION DEL N1: "+ num1+ " / " + num2 +" ES "+ result);
    }

    public static  void calTemp(){
        Scanner src=new Scanner(System.in);
        float celsius=0;
        float fahrenheit=0;
        int opcTemp;
        boolean exitTemp=false;
        float temp;

        do {
            System.out.println("INGRESE EN QUE METODO ESTA LA TEMPERATURA ");
            System.out.println("OPCION 1 : CELSIOUS");
            System.out.println("OPCION 2 : FAHRENHEIT");
            System.out.println("OPCION 3 : SAlIR");
            opcTemp= src.nextInt();

            if (opcTemp==3){
                break;
            }
            System.out.println("INGRESE LA TEMPERATURA QUE DESEA CONVERTIR");
            temp=src.nextFloat();
            switch (opcTemp){
                case 1:
                    celsius=temp;
                    fahrenheit = (celsius * 9/5) +32;
                    System.out.println("LA TEMPERATURA " + temp + " EN GRADOS FAHRENHEIT SERIA " + fahrenheit);
                    exitTemp=true;
                    break;
                case 2:
                    fahrenheit =temp;
                    celsius=(fahrenheit - 32) * 5/9;;
                    System.out.println("LA TEMPERATURA " + temp + " EN GRADOS CELSIOUS SERIA " + celsius);
                    exitTemp=true;
                    break;
                default:
                    System.out.println("LA OPCION QUE HA INGRESADO ES INCORRECTA");
                    continue;
            }

        }while(!exitTemp);

    }
    public  static boolean verifyPrime(int num){
        Boolean isPrime=true;

        for (int i = 2; i <num; i++) {
            if (num%i==0){
                isPrime= false;
            }
        }
        return  isPrime;

    }
    public  static void verifyPrase(String prase){
        int vocal=0, consonant=0;
        for (char letter:prase.toCharArray()
             ) {
            letter= Character.toLowerCase(letter);
            if(Character.isLetter(letter)){
                if (letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u'){
                    vocal++;
                }else {
                    consonant++;
                }
            }

        }
        System.out.println("LA CANTIDAD DE VOCALES DE LA FRASE "+ prase + " ES DE : " + vocal );
        System.out.println("LA CANTIDAD DE CONSONATE DE LA FRASE "+ prase + " ES DE : " + consonant );
    }


}
