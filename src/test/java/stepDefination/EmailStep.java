package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.HomePage;

public class EmailStep {

	public WebDriver driver;
	public HomePage hp;

	@Given("user open browser")
	public void user_open_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nirnay\\eclipse-workspace\\BBc2Cucumber\\Driver\\chromedriver.exe");
		hp= new HomePage(driver);
		driver= new ChromeDriver();
	}
	
	@When("user open url {string}")
	public void user_open_url(String url) {
		driver.get(url);
	}
	
	@And("user enter {string}")
	public void user_enter(String email) {
		hp= new HomePage(driver);
		hp.Emailtxtbar(email);
	}
	
	@Then("click subscribe button")
	public void click_subscribe_button() {
		hp= new HomePage(driver);
		hp.clickEmailSubmit();
	}
	
	@And("close the brower")
	public void close_the_brower() {
	    driver.close();
	    driver.quit();
	}


}
