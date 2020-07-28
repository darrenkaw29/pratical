/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical5;

import java.util.Scanner;

public class Practical5Q2 {
    
     
     public static void main(String[] args) {
           Scanner scan =  new Scanner(System.in);
           
           System.out.print("Enter a String: ");
           String word = scan.nextLine().toUpperCase();
       
           for(int i=0; i<word.length();i++){
               if(word.charAt(i) == 'A' || word.charAt(i) == 'E' || word.charAt(i) == 'I' || word.charAt(i) == 'O' || word.charAt(i) == 'U' )
               {
                   word = word.replace(word.charAt(i), 'x');
               }
           }
           // word = word.relaceAll("[AEIOU]" , "x");
           
           System.out.printf("Modidied string: %s\n", word);
          
           
       }
}
