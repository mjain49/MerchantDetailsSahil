package MerchantStepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageBean.MerchantPageFactory;
import pageBean.MerchantPageFactory;

public class MerchantTestClass {

	private WebDriver driver;
	private MerchantPageFactory mpf;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		// driver=new FirefoxDriver();
	}

	@Given("^Merchant is on 'merchant' Page$")
	public void merchant_is_on_merchant_Page() throws Throwable {
		driver.get("D:\\BDD Workspace\\MerchantDetails\\target\\MerchantDetails.html");
		mpf = new MerchantPageFactory(driver);
		//Thread.sleep(2000);
	}

	@When("^Merchant Enters Invalid First Name$")
	public void merchant_Enters_Invalid_First_Name() throws Throwable {
		mpf.setFname("");
	    mpf.setConfirmButton();
	}

	@Then("^display 'Please Enter Valid First Name'$")
	public void display_Please_Enter_Valid_First_Name() throws Throwable {
		String expectedMessage="Please fill the First Name";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^Merchant Enters Invalid Last Name$")
	public void merchant_Enters_Invalid_Last_Name() throws Throwable {
		mpf.setFname("Mayur");
		mpf.setLname("");
	    mpf.setConfirmButton();
	}

	@Then("^display 'Please Enter Valid Last Name'$")
	public void display_Please_Enter_Valid_Last_Name() throws Throwable {
		String expectedMessage="Please fill the Last Name";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^Merchant Enters Invalid Company Name$")
	public void merchant_Enters_Invalid_Company_Name() throws Throwable {
		mpf.setFname("Mayur");
		mpf.setLname("Jain");
		mpf.setCname("");
	    mpf.setConfirmButton();
	}

	@Then("^display 'Please Enter Valid Company Name'$")
	public void display_Please_Enter_Valid_Company_Name() throws Throwable {
		String expectedMessage="Please fill the Company Name";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^Merchant Enters Invalid Mobile Number$")
	public void merchant_Enters_Invalid_Mobile_Number() throws Throwable {

		mpf.setFname("Mayur");
		mpf.setLname("Jain");
		mpf.setCname("Capgemini");
		mpf.setMobileno("");
	    mpf.setConfirmButton();
	}

	@Then("^display 'Please Enter Valid Mobile Number'$")
	public void display_Please_Enter_Valid_Mobile_Number() throws Throwable {
		String expectedMessage="Please fill the Mobile Number";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^Merchant Enters Invalid EmailID$")
	public void merchant_Enters_Invalid_EmailID() throws Throwable {
		mpf.setFname("Mayur");
		mpf.setLname("Jain");
		mpf.setCname("Capgemini");
		mpf.setMobileno("8652407781");
		mpf.setEmail("");
		mpf.setConfirmButton();
	}

	@Then("^display 'Please Enter Valid EmailID'$")
	public void display_Please_Enter_Valid_EmailID() throws Throwable {
		String expectedMessage="Please fill the Email";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@Given("^Merchant is on 'merchant' page$")
	public void merchant_is_on_merchant_page() throws Throwable {
		driver.get("D:\\BDD Workspace\\MerchantDetails\\target\\MerchantDetails.html");
		mpf = new MerchantPageFactory(driver);
	}

	@When("^Merchant Enters Invalid Password$")
	public void merchant_Enters_Invalid_Password() throws Throwable {
		mpf.setFname("Mayur");
		mpf.setLname("Jain");
		mpf.setCname("Capgemini");
		mpf.setMobileno("8652407781");
		mpf.setEmail("mayur1234@capgemini.com");
		mpf.setPassword("");
	    mpf.setConfirmButton();
	}

	@Then("^display 'Please Enter Valid Password'$")
	public void display_Please_Enter_Valid_Password() throws Throwable {
		String expectedMessage="Please fill the Password";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^Merchant Upload Invalid Photo$")
	public void merchant_Upload_Invalid_Photo() throws Throwable {
//		mpf.setFname("Mayur");
//		mpf.setLname("Jain");
//		mpf.setCname("Capgemini");
//		mpf.setMobileno("8652407781");
//		mpf.setEmail("mayur1234@capgemini.com");
//		mpf.setPassword("Asdf@1234");
//		mpf.setPhoto(null);
//	    mpf.setConfirmButton();
	}

	@Then("^display 'Please Upload Valid Photo'$")
	public void display_Please_Upload_Valid_Photo() throws Throwable {
//		String expectedMessage="Please Upload Image";
//		String actualMessage=driver.switchTo().alert().getText();
//		Assert.assertEquals(expectedMessage, actualMessage);
//		driver.switchTo().alert().accept();
//		driver.close();
	}

	@When("^Merchant clicks on Create Account$")
	public void merchant_clicks_on_Create_Account() throws Throwable {
		mpf.setFname("Mayur");
		mpf.setLname("Jain");
		mpf.setCname("Capgemini");
		mpf.setMobileno("8652407781");
		mpf.setEmail("mayur1234@capgemini.com");
		mpf.setPassword("Asdf@1234");
		mpf.setPhoto("D:\\Users\\mayurjai\\Desktop\\abc.png");
	    mpf.setConfirmButton();
	}

	@Then("^display 'success' Page$")
	public void display_success_Page() throws Throwable {
		String expectedMessage="Successful!!!!";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.get("D:\\BDD Workspace\\MerchantDetails\\target\\success.html");
	}

}