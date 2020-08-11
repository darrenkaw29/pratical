/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical9;

/**
 *
 * @author DK
 */
public class SavingAccount extends Account{
    private  final static double INTEREST_RATE = 2.0;
    
    public SavingAccount(String accNo,double amount){
        super(accNo,amount);
    }
    public static double getINTEREST_RATE(){
    return INTEREST_RATE;
    }
    public double calculateInterest(){
    return (getBalance()* INTEREST_RATE)/12;
    }
    public void addInterest(){
    double interest = calculateInterest();
    deposit(interest);
    }
}
