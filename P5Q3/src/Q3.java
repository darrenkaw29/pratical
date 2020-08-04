/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Q3 {
    
    public static void main(String[] args){
        //args place by array
    if(args.length == 0){
        System.out.println("INVALID input:please enter value.");
        
    }
    else {
        String fName = "";
    for(int i=0;i<args.length;i++){
        int firstIndex = 0;
        
        if(args[i].charAt(0) == '['){
        firstIndex =1;
        //remain value
        }
   args[i] = (args[i].charAt(firstIndex)+"").toUpperCase() + // cordinater (convert ch to upeer case by string )
                                                            //character cannot convert char character to upper case else using string methd
    args[i].substring(firstIndex+1).toLowerCase();
   
                                                             // args start from 1 convert to lower case to the end
   if(firstIndex != 0){
    fName = args[i].substring(firstIndex-1,args[i].length()-1); 
       System.out.println("-->" + fName);
    args[i] =fName;
   }
    } 
    
    for(int j=0;j<args.length-1;j++)
    System.out.print(args[j] + " ");
        
        System.out.println("Wishing you merry chrismate, " + 
                   args[args.length-1] + " " +fName);
    }
  
    }
    
}
