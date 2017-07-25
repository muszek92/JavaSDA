package BankManagment;


public interface Account {
    void Deposit(double ammount) throws Exception;
    double  Withdraw(double ammount) throws Exception;
    double Balance();
}
