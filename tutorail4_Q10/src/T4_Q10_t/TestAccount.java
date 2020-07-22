package T4_Q10_t;
import java.util.Scanner;


public class TestAccount {
   private static Scanner scanner = new Scanner(System.in);     
    // enamble this canner share under this class    
    public static void main (String[] args) {
          //todo:: create account object
     
          Account acc1 = new Account (909,"Ali baba" ,1000);
          //todo:: set Interest rate
         Account.setAnnualInterestRate(0.03); //there is link to to another calss with call textrate
          
          int choice;
          double amt; 
          
          do {
              choice = displayMenu();
              switch (choice ){
                  case 1:  //todo:: display balance 
                          System.out.println("Balance : " + acc1.getBalance());
                          
                  case 2 : //todo:: request deposit amount
                      System.out.println("Enter deposit Amount: "); 
                      
                           //todo:: cash in
                      amt=scanner.nextDouble();
                      
                      acc1.cashIn(amt);// Cal amount 
                      System.out.println("Balance : " + acc1.getBalance());
                           //todo:: display balance                         
                           break;
                           
                  case 3 : System.out.print("Enter Amount : ");
                           //todo:: cash out
                  amt= scanner.nextDouble();
                  acc1.cashOut(amt);
                      System.out.println("Balance : " + acc1.getBalance());
                           //todo:: display balance
                           break;
                           
                  case 4 : //todo:: display interest amount
                         System.out.println("Interest amount : " + acc1.calculateInterest());
              }
          }while (choice != 5);
    }
      
    public static int displayMenu(){
          System.out.println("\nMain Menu");
          System.out.println("1 : Check balance");
          System.out.println("2 : Cash In"); 
          System.out.println("3 : Cash Out");
          System.out.println("4 : Interest"); 
          System.out.println("5 : Exit"); 
          System.out.print("Enter a choice : "); 
          
          int choose = scanner.nextInt();
          return choose;
    }
    }  
