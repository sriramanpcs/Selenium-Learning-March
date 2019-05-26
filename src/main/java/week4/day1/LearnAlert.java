package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe\\");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		Alert alert = driver.switchTo().alert();
		//Thread.sleep(3000);
		alert.sendKeys("Sriraman");
		alert.accept();
		String verifytxt = driver.findElementByXPath("//p[@id='demo']").getText();
		//verifytxt.getText();
		
	if(verifytxt.contains("Sriraman")) {
			System.out.println(true);
		}
		else
			System.out.println("False");

	}

}
