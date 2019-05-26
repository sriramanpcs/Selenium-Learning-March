package week5.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateLead extends ProjectMethods {
	
	@Test
	//public static void main(String[] args) {
		/*System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();*/
	public void cLead() {
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Infosys Limited");
		driver.findElementById("createLeadForm_firstName").sendKeys("Sriraman");
		driver.findElementById("createLeadForm_lastName").sendKeys("Chakravarthi");
		
		WebElement Industry = driver.findElementById("createLeadForm_industryEnumId");
		Select dropdown = new Select(Industry);
		dropdown.selectByVisibleText("Finance");
		List<WebElement> options = dropdown.getOptions();
		for (WebElement myelement : options) {
			String text = myelement.getText();
			System.out.println(text);
		}
		driver.findElementByClassName("smallSubmit").click();
		
		driver.getTitle();

	}


	}


