/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.   -----tutorial T$Q9-----
 */
package practical4_array;

/**
 *
 * @author DK
 */
public class T4Q6 {
    public static void main(String[] args) {
        Airplans a1 =new Airplans();
        Airplans a2= new Airplans("XYZ 0001",250000.00,2005,100);
        
        a1.setId("AWS 0003");
        a1.setNumOfPassenger(190);
         
        System.out.println(a1.toString());
        
        System.out.println(a2.toString());
    }
}
