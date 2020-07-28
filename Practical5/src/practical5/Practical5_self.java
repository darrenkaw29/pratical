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
public class Practical5_self {

    public static boolean validatePassword(String psw) {
        int digit = 0;
        int letter = 0;
        if (psw.length() >= 7) {
            for (int i = 0; i < psw.length(); i++) {
                char temp = psw.charAt(i);
                if (Character.isLetter(temp) || Character.isDigit(temp)) {
                    if (Character.isLetter(temp)) {
                        letter++;
                    } else if (Character.isDigit(temp)) {
                        digit++;
                    }
                } else {
                    return false;
                }

            }
        }
        if (letter == 0 || digit == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your Password: ");
        String psw = scan.nextLine();

        boolean validate = validatePassword(psw);

        if(validate == true){
        System.out.println("Valid Password");
        }
        else{
            System.out.println("InValid Password");
        }

    }
}
