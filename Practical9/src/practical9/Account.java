/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical9;

import java.util.Date;

/**
 *
 * @author DK
 */
public class Account {
    
    private String accountNumber;
    private double balance;
    private Date dateCreadted;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.dateCreadted = new Date();
    }
    
   

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Date getDateCreadted() {
        return dateCreadted;
    }
    
    public void deposit(double amount ){
    balance += amount;
    }

    public void withdrawal(double amount){
    balance -= amount;
    }
    
}
