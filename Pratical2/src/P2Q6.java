/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DK
 */
public class P2Q6 {
    
   public static double inchToCentimeter (int in){
        return in *2.54;
    }
       
        public static double CentimerToInch (int cm){
        return cm / 2.54;
    }
    public static void main(String[] args) { 
        System.out.println("Inches\t\tCentimeters");          
        
        for (int i=0;i<=10;i++){
            
            System.out.printf("%-12.2f %.2f\n", (double)i,inchToCentimeter(i));
                   
        }
         System.out.printf("\n");
           
        for (int i=5;i<=50;i+=5){
            
            System.out.printf("%-12.2f %.2f\n", (double)i,CentimerToInch(i));
                   
        }
        
        
     
    
}
    
}
