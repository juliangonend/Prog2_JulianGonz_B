import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);

        //1.	Crea una calculadora simple en Java que pueda realizar operaciones básicas
        // como suma, resta, multiplicación y división. El programa debe solicitar al usuario que ingrese dos
        // números y luego le permitirle elegir la operación que desea realizar. Una vez completada la operación,
        // debe mostrar el resultado al usuario. Cada operación debe implementarse en un método diferente.
        // El programa principal debe llamar a estos métodos según la operación seleccionada por el usuario.
        int num1, num2;
        System.out.println("INGRESE UN NUMERO");
        num1 = src.nextInt();
        System.out.println("INGRESE OTRO NUMERO");
        num2 = src.nextInt();

        int opc;
        do {
            System.out.println("INSERTE QUE OPERACION DESEA REALIZAR ");
            System.out.println("------------------------------------- ");
            System.out.println(" 1) SUMA ");
            System.out.println(" 2) RESTA ");
            System.out.println(" 3) MULTIPLICASION");
            System.out.println(" 4) DIVISION ");
            System.out.println(" 5) SALIR ");
            opc = src.nextInt();
            switch (opc) {
                case 1:
                    Funcions.addNumbers(num1, num2);
                    break;
                case 2:
                    Funcions.subtractNumbers(num1, num2);
                    break;
                case 3:
                    Funcions.multNumbers(num1, num2);
                    break;
                case 4:
                    Funcions.divNUmbers(num1, num2);
                    break;
                case 5:
                    System.out.println("NUMERO INCORRECTO POR FAVOR INGRESELO NUEVAMENTE");
                    System.out.println("-------------------------------------------------");
                    break;
            }

        } while (opc < 1 || opc > 5);

        /* 2.	Crea un programa en Java que convierta la temperatura de grados Celsius a Fahrenheit y viceversa.
        El programa debe permitir al usuario elegir la dirección de la conversión y luego ingresar la temperatura a convertir. */
        Funcions.calTemp();


        /* 3.	Pide por teclado dos números y genera 10 números aleatorios entre esos números. Usa el método Math.random para generar un número entero aleatorio.*/
        int num3, num4, aux;
        System.out.println("INGRESE EL NUMERO 1  ");
        num3 = src.nextInt();
        System.out.println("INGRESE EL NUMERO 2  ");
        num4 = src.nextInt();

        if (num3 > num4) {
            aux = num3;
            num3 = num4;
            num4 = aux;
        }
        int randomNum;
        randomNum = num3 + (int) (Math.random() * ((num4 - num3) + 1));
        System.out.println("EL NUMERO ENTRE " + num3 + " Y " + num4 + " ES " + randomNum);
        // 4.	Pide un número por teclado e indica si es un número primo o no.
        int num5;
        boolean isPrime;
        do {
            System.out.println("INGRESE POR TECLADO UN NUMERO Y SE LE INDICARA SI ES PRIMO");
            num5 = src.nextInt();

            if (num5 <= 0) {
                System.out.println("NO SE PUEDE INGRESAR UN NUMERO NEGATIVO , INGRESELO NUEVAMENTE ");
            } else {
                isPrime = Funcions.verifyPrime(num5);
                if (isPrime) {
                    System.out.println("EL NUMERO  " + num5 + " ES PRIMO ");
                } else {
                    System.out.println("EL NUMERO " + num5 + " NO ES PRIMO ");
                }
                break;
            }

        } while (true);


        //5.	Crea un programa que pida al usuario un
        // número mínimo y un máximo y muestre por pantalla todos los números primos incluidos en ese rango. Validar que mínimo sea menor que máximo.
        int minNum, maxNum;
        do {
            System.out.println("INGRESE DOS NUMEROS Y SE LE MOSTRARA NUMEROS PRIMOS INCLUIDOS  EN ESE RANGO ");
            minNum = src.nextInt();
            maxNum = src.nextInt();
            if (minNum < 0 || maxNum < 0) {
                System.out.println("NUMEROS NEGATIVOS NO SE PUEDEN INGRESAR");
                System.out.println("INGRESELOS NUEVAMENTE ");
            } else {
                if (minNum > maxNum) {
                    aux = minNum;
                    minNum = maxNum;
                    maxNum = aux;
                }
                System.out.println("LOS NUMEROS PRIMOS ENTRE " + minNum + " Y " + maxNum + " SON ");
                for (int i = minNum; i < maxNum; i++) {
                    isPrime = Funcions.verifyPrime(i);
                    if (isPrime) {
                        System.out.println("EL NUMERO  " + i + " ES PRIMO ");
                    }

                }
                break;
            }
        } while(true);

        //6.	Pide al usuario que ingrese una frase y devuelve la cantidad de vocales y consonantes que tiene esa frase.
        src.nextLine();
        System.out.println("INGRESE UNA FRASE Y SE LE DEVOLVERA LA CANTIDAD DE VOCALES Y CONSONANTES");
        String prase= src.nextLine();
        Funcions.verifyPrase(prase);

    }
}
