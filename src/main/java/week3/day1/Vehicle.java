package week3.day1;

public class Vehicle {
	
	// methods inside Vehicle class
	public void brake() {
		System.out.println("Bikes for cruise");
	}
	public void headLamp() {
		System.out.println("Scooter headlamps are off");
	}

	public static void main(String[] args) {
		//Object created for vehicle class
		//Vehicle twowheeler = new Vehicle();
		//vehicle obj.methods used below
		//twowheeler.brake();
		//
		//twowheeler.headLamp();
		
		// object created for sportsBikes
		SportsBikes SB=new SportsBikes();
		SB.brake();
		
		
		
		//object created for Scooter 
		//SB.headLamp();
		Scooter sc= new Scooter();
			sc.headLamp();
		
		

	}

}
