package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class SelLocators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Infosys Limited");
		driver.findElementById("createLeadForm_firstName").sendKeys("Sriraman");
		driver.findElementById("createLeadForm_lastName").sendKeys("Chakravarthi");
		driver.findElementByClassName("smallSubmit").click();
		driver.getTitle();
		
		Thread.sleep(3000);
		driver.close();

	}

}
