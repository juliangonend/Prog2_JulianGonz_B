package Classes;

public class CurrentAccount extends Account {
    protected float overdraft;

    public CurrentAccount(float balance, float annualRate) {
        super(balance, annualRate);
    }
@Override
    public void withdraw(float amount) {
        balance -= amount;
        if (balance<0){
            overdraft+= -(balance);
            balance=0;
            System.out.println("El balance es " + overdraft);
        }
    System.out.println("El nuevo balance es " + balance);

    }
    @Override
    public void consign(float amount){
        balance += amount;
        numberConsignments++;
    }
    @Override
    public void monthlyStatement(){
        super.monthlyStatement();
    }
    public void printAccount(){
        System.out.println( "El saldo de la Cuenta es de " + balance);
        System.out.println("numero de consgignaciones : "+ numberConsignments);
        System.out.println("tasa anual:  "+ annualRate);
        System.out.println("comision mensual :"+ monthlyCommission);
        System.out.println("sobregiros : "+ overdraft);
    }


}
