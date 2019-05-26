package week2.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTableElements {

	public static void main(String[] args) throws InterruptedException {		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe\\");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
		driver.findElementById("txtStationTo").sendKeys("SBC",Keys.TAB);
		
		WebElement chkbox = driver.findElementById("chkSelectDateOnly");
		if(chkbox.isSelected()){
			chkbox.click();
		}
		Thread.sleep(2000);
		
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']");
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println("Rowscount: "+rows.size());
		for (int i = 1; i <= rows.size(); i++) {
			
			if(driver.findElementByXPath("//table[@class='DataTable TrainList']//tr["+i+"]/td[2]").getText().startsWith("S")) {
				System.out.println(driver.findElementByXPath("//table[@class='DataTable TrainList']//tr["+i+"]/td[1]").getText()+" "+driver.findElementByXPath("//table[@class='DataTable TrainList']//tr["+i+"]/td[2]").getText());
			}
			
		}
//		for(int i=0;i<rows.size();i++) {
//		WebElement eachRow = rows.get(i);
//		}
		
		
		//List<WebElement> cols = table.findElements(By.tagName("td"));

		
		

	}

}
