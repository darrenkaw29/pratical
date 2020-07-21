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
public class Practical4_self_2 {

    private String courseTittlel;
    private double feesPerStudent;
    private int noOfStudents;
    private String[] studentNames = new String[100];
    private static int courseCount; // cannotput this in static for constuctor
    
    //constustor
    public Practical4_self_2(String courseTittlel, double feesPerStudent) {
        this.courseTittlel = courseTittlel;
        this.feesPerStudent = feesPerStudent;
        this.noOfStudents = noOfStudents;
        this.studentNames = studentNames;
        courseCount++;
    }
     ///end construtor

    public void setCourseTittlel(String courseTittlel) {
        this.courseTittlel = courseTittlel;
    }

    public void setFeesPerStudent(double feesPerStudent) {
        this.feesPerStudent = feesPerStudent;
    }

    public void setNoOfStudents(int noOfStudent) {
        this.noOfStudents = noOfStudents;
    }

    public void setStudentNames() {
        this.studentNames = studentNames;
    }

    public static void setCourseCount(int courseCount) {
        Practical4_self_2.courseCount = courseCount;
    }
// set method end
    public String getCourseTittlel() {
        return courseTittlel;
    }

    public double getFeesPerStudent() {
        return feesPerStudent;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public String[] getStudentNames() {
        return studentNames;
    }

    public static int getCourseCount() {
        return courseCount;
    }
     //get method end
   public double calFeesCollected(){
       return (feesPerStudent * noOfStudents);
   }
     public void addStudent(String studName) {
      
             this.studentNames[noOfStudents] = studName;
             noOfStudents++;
             
     }

    @Override
    public String toString() {
        return  "courseTittlel :" + courseTittlel + "\n" + " feesPerStudent :" + feesPerStudent + "\n" + " noOfStudents :" + noOfStudents + "\n" ;
    }

     
     
}
