package Bank;

import java.time.LocalDate;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account(1122,20000);
        account.setAnnualInterestRate(4.5);

        System.out.println("Balance is $" + account.getBalance());
        System.out.println("Current Monthly Interest Rate is $" + account.getMonthlyInterest());
        System.out.println("Date Created : " + account.getDateCreated());
        System.out.println();

        account.withdraw(2000);
        System.out.println("Withdrawal of $2000");
        System.out.println("New Balance $" + account.getBalance());
        System.out.println("Monthly Interest is $" + account.getMonthlyInterest());

        account.deposit(3000);
        System.out.println("Deposit of $3000");
        System.out.println("New Balance $" + account.getBalance());
        System.out.println("Monthly Interest is $" + account.getMonthlyInterest());

    }
}
