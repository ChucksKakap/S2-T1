package T1;

public class BankAccount implements Account {

    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int deposit(int parameter) {
        return balance+parameter;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean withdraw(int parameter) {
        if(parameter<=balance){
            balance=balance-parameter;
            System.out.println(balance);
            return true;}
        else
        return false;
    }
}
