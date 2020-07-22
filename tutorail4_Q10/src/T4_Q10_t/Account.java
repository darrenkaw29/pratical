/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package T4_Q10_t;

public class Account {

    private int accountNo; // -
    private String accountHolderName; //-
    private double balance;// -
    static int accountCount; // ~ access default modifier //no nned initilise else in main program  bcs local varialble
    private static double annualInterestRate; // -
    // it means one copy for all of them using

    public Account(int accountNo, String accountHolderName, double balance) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.balance = balance;

        Account.accountCount++;
    }

    // Accesors is gettle method.
    // mutators is setlle method.
// without this accountholder isrefer to parameters
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public static int getAccountCount() {
        return accountCount;
        //when access statics variable in get need statics also        
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }
    public void cashIn(double cash){
        // if(cash <0)
        balance += cash;
    }
       public void cashOut(double cash){
        balance -= cash;
    }
       
    public double calculateInterest(){
       return  balance * annualInterestRate;
    }
    


}

