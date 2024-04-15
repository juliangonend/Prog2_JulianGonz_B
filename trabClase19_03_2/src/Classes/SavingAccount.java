package Classes;

public class SavingAccount extends Account{
    private boolean active;

    public SavingAccount(float balance, float annualRate) {
        super(balance, annualRate);
        this.active= balance>=10000;
    }

    @Override
    public void consign(float amount){
        if (active){
            super.consign(amount);
        }else {
            System.out.println("No se puede cosignar dinero en una cuenta inactiva");
        }
    }

    public void withdraw(float amount){
        if (active){
                super.consign(amount);
            }
        else{
            System.out.println("No se puede retirar dinero de una cuenta inactiva");
        }
    }
    @Override
    public void monthlyStatement(){
        if (this.numberConsignments>4){
            this.monthlyCommission+=1000;
            System.out.println("Se cobrara comision ya que supero las 4 consignaciones");
        }
    }
    public void print(){
        System.out.println("El saldo de la Cuenta es :" + balance);
        System.out.println("numero de transacciones  es "+ (numberConsignments+numberWithdrawals));
        System.out.println("tasa anual:  "+ annualRate);
        System.out.println("comision mensual "+ monthlyCommission);
    }

}
