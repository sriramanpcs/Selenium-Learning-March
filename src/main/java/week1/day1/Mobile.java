package week1.day1;

public class Mobile {
	public String mobileName = "Samsung";
	public boolean isOn = true;
	
	public void switchOff() {
		System.out.println("Mobile switchoff");
}
	public String getMsg() {
		return ("Welcome to Selenium Learning");
		
	}
	public int getNumber() {
		return 988403848;
	}
	public String getcolor(String whom) {
		if(whom.equals("Wife"))
			return "Blue";
		else if(whom.equals("daughter"))
			return "Pink";
		else if(whom.equals("dad"))
			return "White";
		else
		return "Black";
		
	}
	//Switch case
	public String getColor(String whom) {
		String Color="";
		switch(whom) {
		case "samsung": Color="White";
		break;
		case "Motorola": Color="black";
		break;
		default: Color="grey";
		
		}
		return Color;
	}
}
