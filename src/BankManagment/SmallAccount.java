package BankManagment;


public class SmallAccount extends SavingsAccount {

    private double withrawLimit;

    public double getWithrawLimit() {
        return withrawLimit;
    }

    public SmallAccount(){

    }


    public SmallAccount(double limit, double withrawLimit) {
        this.withrawLimit = withrawLimit; // ustalanie limitu wypłat
    }

    @Override
    public double Withdraw(double ammount) throws Exception {
        if (ammount > withrawLimit){
            throw new Exception ("Kwota przekracza limit kwoty wyplaty");
        }
        return super.Withdraw(ammount);
    }
}
