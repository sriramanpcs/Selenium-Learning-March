package week2.day1.hw;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe\\");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().maximize();
		driver.findElementById("userRegistrationForm:userName").sendKeys("badri_s");
		driver.findElementById("userRegistrationForm:password").sendKeys("rushika");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("rushika");
    	WebElement sq = driver.findElementById("userRegistrationForm:securityQ");
    	Select dropdown = new Select(sq);
    	dropdown.selectByIndex(8);
    	driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Temple");
    	driver.findElementById("userRegistration"+ "Form:firstName").sendKeys("Sriraman");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("Pallikonda");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("Chakravarthi");
		driver.findElementById("userRegistrationForm:gender:0").click();
		driver.findElementById("userRegistrationForm:maritalStatus:0").click();
		
		WebElement daypick = driver.findElementById("userRegistrationForm:dobDay");
		Select DayPick = new Select(daypick);
		
    	
    	
		 
				
		

	}

}
