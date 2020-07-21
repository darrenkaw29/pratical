/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical4_array;


public class p4Q2a {
    private String studentID;
    private String name;
    private int quizCount;
    private int totalScore;
    private static int contribution;
    
    public p4Q2a(){
//        studentID = "";
//        name = "";
//        quizCount = 0;
//        totalScore = 0;

        this("", "");
    }
    
    public p4Q2a(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        quizCount = 0;
        totalScore = 0;
    }	 
    
    public String getStudentId(){
        return studentID;
    }
    
    public String getName(){
        return name;
    }
    
    public int getQuiz(){
    	return quizCount;
    }
    
    public int getTotalScore(){
	return totalScore;
    }
    
    public void setID(String studentID) {
        this.studentID = studentID;
    }
    
    public void setName(String name) {
       this.name = name;
    }
        
    //set get
    public static int getContribution() {     //step 2
       return contribution;                   //using this as return
    }
                                                  //  (STEP 1)
    public static void setContribution(int c){   //we give the c as 20 value in main page 
    	contribution = c;                        //so the contributor gey the value 20
    }
      //set get
    
    public void addQuiz(int score){  
        totalScore = totalScore + score;
        quizCount = quizCount + 1;
    }
        
    public double getAverageScore(){
      return (double)totalScore / quizCount;
    }
    
    
}