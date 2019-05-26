package week4.day2.hw;

import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps");
			driver.manage().window().maximize();
			driver.findElementById("username").sendKeys("Demosalesmanager");
			driver.findElementById("password").sendKeys("crmsfa");
			driver.findElementByClassName("decorativeSubmit").click();
			driver.findElementByLinkText("CRM/SFA").click();
			driver.findElementByXPath("//a[text()='Leads']").click();
			driver.findElementByXPath("//a[text()='Find Leads']").click();
			driver.findElementByXPath("(//label[text()='First name:'])/following::input[@name='firstName']").sendKeys("Sriraman");
			driver.findElementByXPath("//button[text()='Find Leads'])").click();
			

	}

}
