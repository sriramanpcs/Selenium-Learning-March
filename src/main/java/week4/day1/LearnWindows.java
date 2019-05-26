package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe\\");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.findElementByXPath("(//span[text()='AGENT LOGIN'])[2]").click();
		//driver.navigate().to("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}
