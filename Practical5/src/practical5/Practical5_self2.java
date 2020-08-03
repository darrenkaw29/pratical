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
public class Practical5_self2 {
    public static void main (String[] args){
    Scanner scan = new Scanner (System.in);
    Student studentInfo = new Student();
       
    
    System.out.print("Enter STUDENT ID: ");
    String studentID = scan.nextLine().toUpperCase();
    studentInfo.setStudentID(studentID);
    
     
    System.out.print("Enter STUDENT Name: ");
    String name = scan.nextLine();
    studentInfo.setName(name);
     
      
     System.out.print("Enter STUDENT School: ");
    String school = scan.nextLine().toUpperCase();
    studentInfo.setSchool(school);
    
       
    Student.validateStudentID(studentInfo);
    
    if(Student.validateStudentID(studentInfo)){
             
             System.out.println("VALID FOR STUDENT_ID");
             
         }else{
             System.out.println("INVALID FOR STUDENT_ID");
         }
    
    }
    
    
}
