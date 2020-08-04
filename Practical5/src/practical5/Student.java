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
public class Student {

    private String studentID;
    private String name;
    private String school;

    public Student() {
        this.studentID = "";
        this.name = "";
        this.school = "";
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getStudentID() {

        return studentID;
    }

    public String getName() {

        return name;
    }

    public String getSchool() {

        return school;
    }

    public static boolean validateStudentID(Student s) {
        if(s.studentID.length() == 6){ 
            
        if(s.studentID.matches(("[A-B]{1}[\\d]{5}"))){
        char temp = s.studentID.charAt(0); //A || B
        if(s.school.equals("FAFC") && (temp == 'A')){  return true;}
        else if("FAFB".equals(s.school) && (temp == 'B')){ return true;}
        else{return false;}
       
      }else {return false;}
    }else{return false;}
       
}
}
