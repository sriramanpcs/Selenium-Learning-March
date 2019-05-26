package week4day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookLike {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElementById("email").sendKeys("9840217961");
		driver.findElementById("pass").sendKeys("Geetha@89");
		driver.findElementById("loginbutton").submit();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByName("q").sendKeys("TestLeaf");
		driver.findElementByXPath("(//button[@type='submit'])[1]").submit();
		Thread.sleep(10000);
		System.out.println(driver.findElementByXPath("(//button[@type='submit'])[2]").getText());
		String actval = new String();
		String expval = driver.findElementByXPath("(//button[@type='submit'])[2]").getText();
		if(expval.equals(actval)) {
			System.out.println("The Page already Liked");
		}
		else {
			System.out.println("Page not Liked");
		}
		
		driver.findElementByXPath("(//a[text()='TestLeaf'])[1]").click();
				//driver.findElementByXPath("//img[contains(@src,'https://static.xx.fbcdn.net/rsrc.php/v3/yg/r/AT9YNs6Rbpt.png')").getText();
				//String likes = new String();
		//Thread.sleep(10000);
				String likeval = driver.findElementByXPath("//div[contains(text(),'people like this')]").getText();
				System.out.println(likeval);
		//System.out.println();
		
		

	}

}
