package com.fedex.cucumbertest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class TestSteps {

	static {
		WebDriverManager.chromedriver().setup();
	}
	static  ChromeOptions options;
	public static  WebDriver driver;
	

	@Given("I have navigated to FedEx")
	public void OpenPage() {
		// Write code here that turns the phrase above into concrete actions
		options = new ChromeOptions();
		 driver = new ChromeDriver(options);
		driver.get("https://www.fedex.com/en-gb/home.html");
		driver.manage().window().maximize();

		// throw new io.cucumber.java.PendingException();
	}

	@When("I select language and region")
	public void select_language_and_region() throws InterruptedException {
		driver.findElement(By.xpath("//span[@class='fxg-geo-locator__link-label']")).click();
		Thread.sleep(3000);
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@And("I click on Accept Cookies")
	public void acceptCookies() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(
				"//button[@class='fxg-cookie-consent__accept fxg-button fxg-button--orange js-fxg-cookie-save is-save-all']"))
				.click();
		Thread.sleep(2000);
		// throw new io.cucumber.java.PendingException();
	}

	@And("I enter tracking ID {string}")
	public void enterTrackingID(String s) throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@name='trackingnumber']")).sendKeys(s);
		Thread.sleep(2000);
		// throw new io.cucumber.java.PendingException();
	}

	@And("I click Enter")
	public void i_click_enter() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[4]/div/div[1]/div/div[1]/div[1]/form/button"))
				.click();
		Thread.sleep(2000);
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@Then("I validate the error message {string}")
	public void validateErrorMessage(String str1) throws InterruptedException {
		Thread.sleep(3000);
		String str = driver.findElement(By.xpath(
				"//*[@id=\"container\"]/ng-component/div/trk-shared-stylesheet-wrapper/div/trk-shared-notification/div/div[2]"))
				.getText();
		Assert.assertEquals(str1, str);
		driver.close();
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@When("I click Tracking Link")
	public void click_tracking_link() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='black-tracking-link-decoration line-height']")).click();
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@When("I click on LastOrder")
	public void click_on_last_order() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"container\"]//tr[4]/td[1]/trk-shared-tracking-link/button")).click();
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@Then("I validate the  Delivery message {string}")
	public void validate_the_delivery_message(String str2) throws InterruptedException {
		Thread.sleep(3000);
		String status = driver
				.findElement(By.xpath(
						"//*[@id=\"container\"]//section[1]/trk-shared-shipment-status-delivery-date/h1/span[2]/span"))
				.getText();
		Assert.assertEquals(str2, status);
		driver.close();
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@And("I click on Sign In")
	public void i_click_on_sign_in() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"fxg-dropdown-signIn\"]/span")).click();
		Thread.sleep(3000);
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@And("I click on Open An Account")
	public void i_click_on_open_an_account() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"global-login-wrapper\"]/div/div[3]/div/a")).click();
		Thread.sleep(3000);
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@And("I click on Personal Account")
	public void i_click_on_personal_account() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div[6]/div/div[1]/div[5]/div/a")).click();
		Thread.sleep(3000);
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@And("I set First Name {string}")
	public void i_set_first_name(String fname) throws InterruptedException {
		driver.findElement(By.id("first-name")).sendKeys(fname);
		Thread.sleep(3000);
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@And("I set Last Name {string}")
	public void i_set_last_name(String lname) throws InterruptedException {
		driver.findElement(By.id("last-name")).sendKeys(lname);
		Thread.sleep(3000);
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@And("I enter address {string}")
	public void i_enter_email(String address) throws InterruptedException {
		driver.findElement(By.id("address")).sendKeys(address);
		Thread.sleep(3000);
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@And("I enter phone number {int}")
	public void i_enter_number(CharSequence[] n) throws InterruptedException {
		driver.findElement(By.id("phone")).sendKeys(n);
		Thread.sleep(3000);
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@And("I enter email {string}")
	public void i_enter_number(String email) throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys(email);
		Thread.sleep(3000);
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@And("I click on LoginDetails")
	public void i_click_on_login_details() throws InterruptedException {
		driver.findElement(
				By.xpath("//button[@class=\"submit-button ng-tns-c90-1 fdx-c-button--primary fdx-c-button\"]")).click();
		Thread.sleep(3000);

	}

	@And("I enter password {string}")
	public void i_enter_password(String pass) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@And("I confirm password {string}")
	public void i_confirm_password(String pass) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@And("I click on Terms and Conditions")
	public void i_click_on_terms_and_conditions() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"acceptPrivacyPolicyAndTermsAndConditions-label\"]")).click();
		Thread.sleep(1000);
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}
	
	@And("I click on Create my User ID")
	public void i_click_on_create_my_userID() throws InterruptedException {
		driver.findElement(By.xpath("//button[@data-test-id=\"signupFormSubmitButton\"]")).click();
		Thread.sleep(3000);
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}

	
	@Then("I validate the completion message")
	public void validateSuccessMessage() {
		driver.findElement(By.xpath("/html/body/reg-app/main/app-create-shipping-account-feature/app-account-type/h1")).isDisplayed();
		driver.findElement(By.xpath("//button[@data-test-id=\"accountTypeSubmitButton\"]")).click();
		
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("I click on search for another country or territory")
	public void i_click_on_search_for_another_country_territory() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='fxg-geo-locator__global-link js-geo-global-url']")).click();
		Thread.sleep(3000);
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@And("I click on another country {string}")
	public void i_click_on_another_country(String string) throws InterruptedException {
		driver.findElement(By.xpath("//p[contains(text(), '" + string + "')]/a")).click();
		Thread.sleep(3000);
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@Then("I validate new country name {string}")
	public void i_validate_new_country_name(String cnames) {
		String cname = driver.findElement(By.xpath("//div[2]/h4[@class='fxg-geo-locator__country-title']")).getText();
		Assert.assertEquals(cnames, cname);
		driver.close();
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@When("I click on Search")
	public void i_click_on_search() throws InterruptedException {
		driver.findElement(By.xpath("//span/img[@alt='Search']")).click();
		Thread.sleep(3000);
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@And("I enter search text {string}")
	public void i_enter_search_text(String string) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='fxg-search-text']")).sendKeys(string);
		Thread.sleep(3000);
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@And("I click on search function button")
	public void i_click_on_search__function_button() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='fxg-search-text']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@Then("I validate the search results are displayed")
	public void i_validate_the_search_results_are_displayed() {
		driver.findElement(By.xpath("//*[@id=\"search-results\"]/div[1]/div[1]/p/span")).isDisplayed();
		driver.close();
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}
	@And("I click on ship")
	public void i_click_on_ship() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"cubeThreePar\"]/button/span")).click();
		Thread.sleep(3000);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("I validate sign up is displayed")
	public void i_validate_sign_up_is_displayed() {
		driver.findElement(By.xpath("//div[@class='fxg-user-options__option fxg-user-options__sign-in     fxg-dropdown__item--open']/div")).isDisplayed();
	    driver.close();
		// Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@And("I click on need help link")
	public void i_click_on_need_help_link() throws InterruptedException {
		driver.findElement(By.xpath("//a[@data-analytics=\"link|NEED HELP?\"]")).click();
		Thread.sleep(2000);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("I validate FAQ page is opened in next tab with title {string}")
	public void i_validate_faq_page_is_opened_in_next_tab(String ptitle) {
		
		  if ( driver.getPageSource().contains(ptitle)){
		         System.out.println("Text: " + ptitle + " is present. ");
		      } else {
		         System.out.println("Text: " + ptitle + " is not present. ");
		      }
		driver.quit();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("I validate rate and transit time is displayed")
	public void i_validate_rate_is_displayed() {
		driver.findElement(By.xpath("//span[@aria-label=\"Get Rate and Shipping Details\"]")).isDisplayed();
	    driver.close();
		// Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("I validate Facebook option is displayed")
	public void i_validate_facebook_is_displayed() {
		driver.findElement(By.xpath("//img[@data-analytics=\"ftr|social|Facebook\"]")).isDisplayed();
	    driver.close();
	
	}
	@And("I click on privacy policy link")
	public void i_click_on_privacy_policy_link() throws InterruptedException {
		driver.findElement(By.xpath("//a[@aria-label=\"Privacy Policy\"]")).click();
		Thread.sleep(2000);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@Then("I validate privacy page is opened with title {string}")
	public void i_validate_faq_page_is_opened(String ptitle) {
		
		  if ( driver.getPageSource().contains(ptitle)){
		         System.out.println("Text: " + ptitle + " is present. ");
		      } else {
		         System.out.println("Text: " + ptitle + " is not present. ");
		      }
		driver.quit();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
}
