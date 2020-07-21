/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical4_self;

/**
 *
 * @author DK
 */
public class Practical4_Self {
    public static void main(String[] args) {
        // TODO code application logic here              
      
          
        Practical4_self_2 newStudent = new Practical4_self_2("Introduction to computers",250.0);
        
        newStudent.addStudent("Ali Said");
        newStudent.addStudent("Wong Ken");
        newStudent.addStudent("Peter Lim");
        
        System.out.print(newStudent.toString());
    String[] students = newStudent.getStudentNames();
    System.out.println("Total Fees collected: " + newStudent.calFeesCollected());
        System.out.println("list of Student In the course :");
    for (int i = 0; i < newStudent.getNoOfStudents(); i++){
      System.out.println(students[i]);
           
    }
    }
}
    

