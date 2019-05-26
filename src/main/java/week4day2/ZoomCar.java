package week4day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ZoomCar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zoomcar.com/chennai");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByLinkText("Start your wonderful journey").click();	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
			/* To select the Starting Point */
		driver.findElementByXPath("//div[contains(text(),'Kodambakkam')]").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//button[text()='Next']").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
			/* To select the Pickup Date and Time */
		driver.findElementByXPath("//div[text()='Mon']").click();
		driver.findElementByXPath("//button[text()='Next']").click();
		
			/* To Confirm */
		driver.findElementByXPath("//button[text()='Done']").click();
			//driver.findElementByXPath("//div[text()=' Price: High to Low ']");
		List<WebElement> carList = driver.findElementsByXPath("//div[@class='car-listing']");
		System.out.println(carList.size());
		
		List<String> price =new ArrayList<>();
		List<Integer> aPrce = new ArrayList<>();
		for (int i = 1; i <= carList.size(); i++) {
			price.add(driver.findElementByXPath("(//div[@class='price'])["+i+"]").getText());
		}
		
		for (String str : price) {
			String[] strArray = str.split(" ");
			String pr = strArray[1];
			aPrce.add(Integer.parseInt(pr));			
		}
		
		Collections.sort(aPrce);
		
		String highestPrice = aPrce.get(carList.size()-1).toString();
		
		for (int i = 1; i <= carList.size(); i++){
			String str = driver.findElementByXPath("(//div[@class='price'])["+i+"]").getText();
			String[] strArray = str.split(" ");
			str = strArray[1];
			if(str.equals(highestPrice)) {
				System.out.println(driver.findElementByXPath("(//div[@class='details'])["+i+"]/h3").getText());
				driver.findElementByXPath("(//button[@name='book-now'])["+i+"]").click();
				break;
			}
		}
		
		driver.close();
		
	}

	}

