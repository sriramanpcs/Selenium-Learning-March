package week4.day2.hw;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

public static void main(String[] args) {
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
	driver.findElementByXPath("//input[@name ='submitButton']").click();
}

}
