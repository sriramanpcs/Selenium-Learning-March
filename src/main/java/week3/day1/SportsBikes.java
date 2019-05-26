package week3.day1;

public class SportsBikes extends Vehicle {
	//SportsBikes sb = new SportsBikes();
	public void brake() {
		super.brake();
		System.out.println("Iam Overriding Vehicle method");
	}
}
