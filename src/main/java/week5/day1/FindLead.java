package week5.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class FindLead {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByName("emailAddress").sendKeys("AAZ@gmail.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);
		driver.findElementByLinkText("AAZ@gmail.com").click();
		
		String exptitle= new String();
		exptitle = "View Lead | opentaps CRM";
		
		String acttitle= new String();
		acttitle = driver.getTitle();
		
		if(exptitle.equals(acttitle))
		{
			System.out.println("Page Title is as expected");
		}
		else
		{
			System.out.println("Page Title is Not as expected");
		}
		driver.close();
		//driver.findElementByXPath("//a[@class='subMenuButtonDangerous']").click();
		//driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").clear();
		//driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").sendKeys("ABC Limited");
		//driver.findElementByXPath("//input[@class='smallSubmit']").click();
		//String cmpName = new String();
		//if(cmpName.equals(sendKeys)) {
		//		}
		//String cmpName = driver.findElementByXPath("//span[text()='Company Name']").getText();
		//System.out.println(cmpName);


	}

}
