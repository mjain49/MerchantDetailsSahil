package pageBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MerchantPageFactory {

	// Driver definition
	WebDriver driver;

	// Initiating the Driver
	public MerchantPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Step 1 : Identify Elements
	
	@FindBy(name = "firstName") // find by is to find element name specified in the form
	@CacheLookup // to cache the value of that element of the form whose name is specified inside
					// FindBy tag
	WebElement fname;

	@FindBy(name = "lastName")
	@CacheLookup
	WebElement lname;
	
	@FindBy(name = "companyName")
	@CacheLookup
	WebElement cname;

	@FindBy(name = "mobileNo")
	@CacheLookup
	WebElement mobileno;

	@FindBy(name = "email")
	@CacheLookup
	WebElement email;

	@FindBy(id = "password")
	@CacheLookup
	WebElement password;

	@FindBy(name = "photo")
	@CacheLookup
	WebElement photo;
	
	@FindBy(className = "btn")
	@CacheLookup
	WebElement confirmButton;

	// No changes in the Driver
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname.sendKeys(fname);
	}

	public WebElement getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname.sendKeys(lname);
	}

	public WebElement getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname.sendKeys(cname);
	}

	public WebElement getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno.sendKeys(mobileno);
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email.sendKeys(email);
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password.sendKeys(password);
	}

	public WebElement getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo.sendKeys(photo);
	}

	public void setConfirmButton() {
		this.confirmButton.click();
	}
	
	
	
	
	
}