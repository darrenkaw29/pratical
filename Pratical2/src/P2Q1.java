/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DK
 */
public class P2Q1 {
    public static double mathCal(int i){
        return Math.sqrt(i);
    }
    public static void main(String[] args) {
        System.out.println("Number\t\tSquareRoot");
       for (int i=0;i<=20;i+=2){
           System.out.printf("%3d\t\t%.2f\n" ,i,mathCal(i));
           
           
       }
    }
        
        
        
    
}
