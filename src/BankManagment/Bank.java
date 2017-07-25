package BankManagment;


public class Bank {
    public static void main(String[] args) {

        SavingsAccount newAccount = new SavingsAccount(200);
        try {
            newAccount.Deposit(400);
        }catch (Exception ex){
            System.out.println("Błąd \n" + ex.getMessage());
        }

        SmallAccount newSmallAccount = new SmallAccount(200);{
            try{
                newSmallAccount.Withdraw(500);
            }catch (Exception ex){
                System.out.println("Małe konto, kwota większa od limitu \n" + ex.getMessage());
            }
        }
    }
}
