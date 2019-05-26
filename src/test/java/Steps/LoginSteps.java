package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class LoginSteps {
	ChromeDriver driver;
	@Given("Open the Browser")
	public void openTheBrowser() {
	    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    
	}

	@And("Max Browser")
	public void maxBrowser() {
		driver.manage().window().maximize();
	    
	}

	@And("set the timeouts")
	public void setTheTimeouts() {
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS)	;
	    }

	@And("Load the URL")
	public void loadTheURL() {
		driver.get("http://leaftaps.com/opentaps");
	    
	}

	//@And("Enter the username as DemoSalesManager")
	@And("Enter the username as (.*)")
	public void enterTheUsernameAsDemoSalesManager(String uName) {
		
		driver.findElementById("username").sendKeys(uName);
	}

	@And("Enter the password as (.*)")
	public void enterThePasswordAsCrmsfa(String pwd) {
	  
		driver.findElementById("password").sendKeys(pwd);
	}

	@When("click on on the Login Button")
	public void clickOnOnTheLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@Then("verify Login successful")
	public void verifyLoginSuccessful() {
		/*driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Infosys Limited");
		driver.findElementById("createLeadForm_firstName").sendKeys("Sriraman");
		driver.findElementById("createLeadForm_lastName").sendKeys("Chakravarthi");*/
		//driver.findElementByLinkText("Create Lead").click();
		driver.findElementByLinkText("CRM/SFA").click();
	    System.out.println("Login Success");
	}
	/*@Given("click the link text crms/fa")
	public void linktextClick() {
		driver.findElementByLinkText("CRM/SFA").click();
	}*/
	/*@Given("click the create lead")
	public void cLead() {
		driver.findElementByXPath("//a[text()='Create Lead']").click();
	}*/
	/*@Given("Enter the first name as <fname>")
	public void firstname(String fName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
	}
	@And("Enter the last name as <lname>")
	public void lastname(String lName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
	}
	@And("Enter the company name as <cname>")
	public void cmpname(String cName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
	}
	@When("click on on the Create Lead Button")
	public void clckButton() {
		driver.findElementByLinkText("Create Lead").click();
	}
	@Then ("verify Lead Created successful")
	public void verifySuccess() {
		System.out.println("Program success");
	}*/
	/*@Given("Enter the username as DemoCSR")
	public void enterTheUsernameAsDemoCSR() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}*/
	}


