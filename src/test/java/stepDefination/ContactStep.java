package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.ContactPage;
import pageObject.HomePage;

public class ContactStep {

	public WebDriver driver;
	public HomePage hp;
	public ContactPage cp;
	
	@Given("user chrome browser")
	public void user_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nirnay\\eclipse-workspace\\BBc2Cucumber\\Driver\\chromedriver.exe");
		hp= new HomePage(driver);
		driver= new ChromeDriver();
	}

	@When("user url  {string} in browser")
	public void user_url_in_browser(String url) {
		driver.get(url);
	}

	@And("click contact option")
	public void click_contact_option() {
		hp= new HomePage(driver);
		hp.clickcontactpage();
	}

	@Then("verify the contact page title")
	public void verify_the_contact_page_title() {
		if(driver.getTitle()=="Contact Us | urbanladder.com") {
			Assert.assertTrue(true);
			System.out.print("Test passed");
		}
		else {
			System.out.println("Test failed");
		}
	
	}

	@And("verify contact page the option")
	public void verify_contact_page_the_option() {
		cp= new ContactPage(driver);
		boolean l1=cp.verifysearchbar();
		if(l1==true) {
			Assert.assertTrue(true);
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		
	}

	@Then("quit browser")
	public void quit_browser() {
		driver.close();
	    driver.quit();
	}

}
