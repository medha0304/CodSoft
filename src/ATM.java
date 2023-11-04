import java.util.Scanner;

public class ATM {
    private double balance;

    public ATM(double iniBal) {
        this.balance = iniBal;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amt) {
        if(amt > 0) {
            balance += amt;
            System.out.println("Deposited amount = " + amt);
        }
        else {
            System.out.println("Enter valid amount to be deposited!");
        }
    }
    public boolean withdrawal(double amt) {
        if(amt > 0 && amt <= balance) {
            balance -= amt;
            System.out.println("Amount withdrawn = " + amt);
            return true;
        }
        else {
            System.out.println("Invalid withdrawal amount or insufficient balance!");
            return false;
        }
    }
}
class Account {
    private ATM acct;

    public Account(ATM acct) {
        this.acct = acct;
    }

    public void displayMenu() {
        System.out.println("Menu of ATM machine is as follows : ");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money in account");
        System.out.println("3. Withdraw money from account");
        System.out.println("4. Exit");
    }
    public void operation() {
        Scanner in = new Scanner(System.in);
        double withdrawalAmt;
        double depositAtm;
        double balance;
        int ch;
        do {
            displayMenu();
            System.out.print("Enter your choice : ");
            ch = in.nextInt();

            switch(ch) {
                case 1: {
                    balance = acct.getBalance();
                    System.out.println("Your current balance is : Rs." + balance);
                    break;
                }
                case 2: {
                    System.out.println("Enter the amount to be deposited : Rs.");
                    depositAtm = in.nextDouble();
                    acct.deposit(depositAtm);
                    break;
                }
                case 3: {
                    System.out.println("Enter the amount to be withdrawn : Rs.");
                    withdrawalAmt = in.nextDouble();
                    acct.withdrawal(withdrawalAmt);
                    break;
                }
                case 4: {
                    System.out.println("Thankyou!");
                    return;
                }
                default: {
                    System.out.println("Please select valid choice!");
                }
            }
        }
        while (ch != 0);
    }
}

class Main1 {
    public static void main(String[] args) {
        System.out.println("WELCOME TO ATM MACHINE!");
        ATM NewUser = new ATM(1000.0);
        Account Acc1 = new Account(NewUser);
        Acc1.operation();
    }
}
