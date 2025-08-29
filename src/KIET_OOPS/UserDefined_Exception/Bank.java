package KIET_OOPS.UserDefined_Exception;

public class Bank {
    private int balance = 10000;
    public void withdrawal(int amount){
        if(amount > balance){
            throw new InsufficientBalanceException("Garreb Aukat me reh");
        }
        else {
            balance -= amount;
            System.out.println("Withdrawal Succesfull, Remaining Balance : " +balance);
        }

    }
}
