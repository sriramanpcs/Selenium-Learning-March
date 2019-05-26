package week5.day1;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week5.day2.ReadExcel;

public class ProjectMethods {
	public RemoteWebDriver driver;
	public String dataSheetName;
	@BeforeMethod
	public void StartApp() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
	}

	@DataProvider(name = "FetchData")
	public String [][] getData()throws IOException{
		ReadExcel excel = new ReadExcel();
		return excel.readExcel(dataSheetName);
	}
}
