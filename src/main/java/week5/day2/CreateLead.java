package week5.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import week5.day1.ProjectMethods;

public class CreateLead extends ProjectMethods {
	@BeforeTest
	public void setData() {
		dataSheetName="Sample";
	}
	@Test(dataProvider="FetchData")
	//public static void main(String[] args) {
		/*System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();*/
	public void cLead(String cName,String fName, String lName) {
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		driver.findElementByName("submitButton").click();
	}
		/*@DataProvider(name = "FetchData") 
		
			String[][] getData(){
			String[][]data = new String[3][3];
			data[0][0]="Infosys";
			data[0][1]="Sriraman";
			data[0][2]="PC";
			
			data[1][0]="Infosys";
			data[1][1]="Ravan";
			data[1][2]="S";
					
			data[2][0]="Infosys";
			data[2][1]="Laxman";
			data[2][2]="K";
			
			return data;*/
		
		/*WebElement Industry = driver.findElementById("createLeadForm_industryEnumId");
		Select dropdown = new Select(Industry);
		dropdown.selectByVisibleText("Finance");
		List<WebElement> options = dropdown.getOptions();
		for (WebElement myelement : options) {
			String text = myelement.getText();
			System.out.println(text);
		}*/
		/*driver.findElementByClassName("smallSubmit").click();
		
		driver.getTitle();*/

	}


	


