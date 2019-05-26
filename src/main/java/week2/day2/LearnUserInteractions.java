package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnUserInteractions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe\\");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		WebElement myelement = driver.findElementById("draggable");
		
		Actions sriram = new Actions(driver);
		//sriram.clickAndHold(myelement).moveToElement(myelement, 218,85).perform();
		sriram.dragAndDropBy(myelement, 211, 78).perform();

	}

}
