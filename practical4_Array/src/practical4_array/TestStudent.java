/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical4_array;

public class TestStudent {
    public static void main(String[] args) {
        
        //todo:: create 2 objects to test all constructors
        p4Q2a s1 = new p4Q2a();
        p4Q2a s2 = new p4Q2a("1901222","John"); // this can change  in contructor 
        
        //todo:: Assign data to s1
        s1.setName("Abu");
        s1.setID("1900567");  // once assgn here the variable have been asign cannot change
                              // another page this would not see any effect by using construtor
    
        //todo:: Add quiz to s1 and s2
        s1.addQuiz(4);
        s1.addQuiz(8);

        
        s2.addQuiz(8);
        s2.addQuiz(8);

        
       
        //Q2
        //todo:: display average for s1 and s2
        System.out.println("Average Score:");
        System.out.printf("%-10s %s %s\n", "Name", "Total Scoe", "Average");
        System.out.printf("%-10s %5d %5.2f\n", s1.getName(), s1.getTotalScore(), s1.getAverageScore());
	System.out.printf("%-10s %5d %5.2f\n", s2.getName(), s2.getTotalScore(), s2.getAverageScore());
        
   
        //q3
        //todo:: set 20% contribution 
        p4Q2a.setContribution(20); //
       
        //todo:: display result  
        System.out.printf("Contribution to final (%d)\n" , p4Q2a.getContribution() );
        System.out.printf("%-10s %s \n", "Name", "final Contribution");
        System.out.printf("%-10s %.2f \n", s1.getName(), s1.getAverageScore()/10 * p4Q2a.getContribution());
	System.out.printf("%-10s %.2f \n", s2.getName(), s2.getAverageScore()/10 * p4Q2a.getContribution());
    }
}