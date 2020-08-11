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
public class CurrentAccount extends Account {
    private final static int FREE_TRANSACTION = 5;
    private final static double TRANSACTION_FEE = 0.5;   
    private int transactionCount = 0;

    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public static int getFREE_TRANSACTION() {
        return FREE_TRANSACTION;
    }

    public static double getTRANSACTION_FEE() {
        return TRANSACTION_FEE;
    }

    public int getTransactionCount() {
        return transactionCount;
    }
  
    public void addTransactionCount(){
    transactionCount++;
    }
    public void deductTransactionFee(){
        withdrawal(TRANSACTION_FEE);
    }
    
}
