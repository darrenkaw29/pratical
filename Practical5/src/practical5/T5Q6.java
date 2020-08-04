/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical5;

/**
 *
 * @author DK
 */
public class T5Q6 {
    public static boolean validateID (String loginID){
        int countLowercase =0;
        int countDigit = 0;
    if(loginID.length() < 6 || loginID.length() > 10 || 
            !Character.isUpperCase(loginID.charAt(0))){
    return false;
            }
    for(int i =0;i<loginID.length();i++){
        char ch = loginID.charAt(i);
        if(!Character.isLetter(ch) && !Character.isDigit(ch)){
            return false;
        }else{
                if(Character.isLowerCase(ch)){countLowercase++;
                }else if(Character.isDigit(ch)){countDigit++;}
        }
    }
    if(countDigit ==0 || countLowercase ==0){return false;}
    return true;
    }
    
    public static void main (String[] args){
    String id ="Wa123456";
    System.out.println(validateID(id));
    }
}
