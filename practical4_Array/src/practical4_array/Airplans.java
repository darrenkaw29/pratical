/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.         -----tutorial T$Q9-----
 */  
package practical4_array;

public class Airplans {
        private String id;
	private double price;
	private int yearOfPurchased;
	private int numOfPassenger;
	private static int numOfAirplane;
        
        public Airplans(){ 
       //  id = "";
       //   price = 0;
       //  yearOfPurchased = 0;
       // numOfPassenger = 0;
       this("",0.00,0,0);
        }
       public Airplans(String id,double price,int yearOfPurchased,int numOfPassenger)
       {
        this.id = id; ///perform initialization 
        this.price = price;
        this.yearOfPurchased = yearOfPurchased;
        this.numOfPassenger = numOfPassenger;
        numOfAirplane++;
        } 

    public void setId(String id) {
        this.id = id;
    }

    public void setNumOfPassenger(int numOfPassenger) {
        this.numOfPassenger = numOfPassenger;
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public int getYearOfPurchased() {
        return yearOfPurchased;
    }

    public int getNumOfPassenger() {
        return numOfPassenger;
    }

    public static int getNumOfAirplane() {
        return numOfAirplane;
       
    }
    
  public double calCurrentValue() 
  {
		double value = price - (price*0.1*(2011-yearOfPurchased));
		if(value < 0){
		 	return 0;
		 }
		 
		 return value;	
		 	
	}
    public String toString(){
        return"ID : " + id + "\n" +
              "Price :" + price + "\n" +
                "Year of Purchased :" + yearOfPurchased + "\n" +
                "Num of Passenger : " + numOfPassenger +
                "current Value : " + calCurrentValue();
                
    }
}
       
       

