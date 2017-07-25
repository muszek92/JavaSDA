package BankManagment;


public class SavingsAccount implements Account {

    private double accountBalance;
    public SavingsAccount(){

    }

    public SavingsAccount(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }


    @Override
    public void Deposit(double ammount) throws Exception {
        if (ammount < 0) {
            throw new Exception("Wpłacana kwota nie może być ujemna");
        }
        accountBalance += ammount;
    }

    @Override
    public double Withdraw(double ammount) throws Exception {
        if (ammount > accountBalance) {
            throw new Exception("Zbyt mało środków na koncie");
        }
        accountBalance -= ammount;
        return ammount;
    }

    @Override
    public double Balance() {
        return accountBalance;
    }
}


