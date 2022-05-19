package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.HomePage;

public class AboutStep {

	public WebDriver driver;
	public HomePage hp;
	
	@Given("user open chrome browser")
	public void user_open_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nirnay\\eclipse-workspace\\BBc2Cucumber\\Driver\\chromedriver.exe");
		hp= new HomePage(driver);
		driver= new ChromeDriver();
	}
	@When("user url  {string}")
	public void user_url(String url) {
	    driver.get(url);
	}

	@Then("click about us")
	public void click_about_us() {
		hp= new HomePage(driver);
	    hp.clickaboutpage();
	}

	@And("verify the page title {string}")
	public void verify_the_page_title(String title) {
		if(driver.getTitle()==title) {
			Assert.assertTrue(true);
			System.out.print("Test passed");
		}
		else {
			System.out.println("Test failed");
		}
	}

	@Then("close chrome browser")
	public void close_chrome_browser() {
		driver.close();
	    driver.quit();
	}
}
