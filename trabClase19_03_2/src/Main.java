import Classes.CurrentAccount;
import Classes.SavingAccount;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------Caja de Ahorro ----------");
        SavingAccount cajaAhorro1= new SavingAccount(15000,12);
        cajaAhorro1.consign(160000);
        cajaAhorro1.consign(1000);
        cajaAhorro1.consign(60000);
        cajaAhorro1.consign(1000);
        cajaAhorro1.withdraw(1500);
        cajaAhorro1.print();
        System.out.println("--------Cuenta Corriente ----------");
        CurrentAccount cuentaCorriente1= new CurrentAccount(300000,10);
        cuentaCorriente1.withdraw(450000);
        cuentaCorriente1.monthlyStatement();
        cuentaCorriente1.printAccount();


    }
}