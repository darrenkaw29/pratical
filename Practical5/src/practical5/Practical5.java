/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical5;

import java.util.Scanner;

/**
 *
 * @author DK
 */
public class Practical5 {  //计算letter 和 character 相同的。
    public static int countLetter(String str,char ch){
       int count = 0;
       for(int i=0; i<str.length() ;i++){
           char temp = str.charAt(i);
           if(Character.toUpperCase(temp) == Character.toUpperCase(ch)){
               count++;           }
       }
       return count;
    }
    
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    
       System.out.print("Enter a word: ");
       String word = scan.nextLine();
   
       System.out.println("Enter the letter you want to count : ");
       char letter = scan.next().charAt(0);
       
       int count = countLetter(word, letter);
       
        System.out.println("Happy count:" + count);
    }
    
}
