package practical9;

import java.util.Scanner;

/**
 *
 * @author DK
 */
public class Templete {

    public static void main(String[] args) {
        CurrentAccount currentAccount = new CurrentAccount("A001", 1000);
        int selection = 4;
        double amount = 0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("\n1. Withdrawal");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Quit");
            System.out.print("Enter choice> ");
            selection = scan.nextInt();
            switch (selection) {

                case 1:
                    System.out.println("Enter amount to withdraw:");
                    amount = scan.nextDouble();
                    currentAccount.withdrawal(amount);
                    currentAccount.addTransactionCount();
                    if (currentAccount.getTransactionCount() > currentAccount.getFREE_TRANSACTION()) {
                        currentAccount.deductTransactionFee();
                    }
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw:");
                    amount = scan.nextDouble();
                    currentAccount.deposit(amount);
                    break;
                case 3:
                    System.out.println("Current Balance: Rm" + currentAccount.getBalance());
                    break;
                default:
                    System.out.println("\n\nTerminating program...");
            }
        } while (selection >= 1 && selection <= 3);

    }
}
