import java.util.LinkedList;
import java.util.List;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private List<String> transactions;

    public BankAccount(){
        transactions = new LinkedList<String>();
    }

    public void deposit(double amount){
        balance += amount;
        transactions.add("Deposited " + amount);
    }

    public void withdraw(double amount){
        balance -= amount;
        transactions.add("Withdrawn " + amount);
    }

    public void printTransactionHistory(){
        for(String transaction : transactions){
            System.out.println(transaction);
        }
    }
}
