package com.noorteck.qa.steps;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import com.noorteck.qa.pages.BlazeDemoPage;
import com.noorteck.qa.utils.Constants;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BlazeStep {

	BlazeDemoPage auto;

	@Given("User navigates to BlazeDemo Page {string}")
	public void navigateToBlazeDemoPage(String url) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		Constants.driver = new ChromeDriver();
		Constants.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		Constants.driver.manage().window().maximize();
		Constants.driver.get(url);
		Thread.sleep(2000);
		auto = new BlazeDemoPage();

	}

	@When("User enters Full Name {string}")
	public void enterUserFullName(String inputName) {
		auto.enterName(inputName);
	}

	@When("User enters Address {string}")
	public void enterUserAddress(String address) {
		auto.enterAddress(address);
	}

	@When("User enters City {string}")
	public void enterUserCity(String city) {
		auto.enterCity(city);
	}

	@When("User etners State {string}")
	public void enterUserState(String state) {
		auto.enterState(state);
	}

	@When("User selects Zip Code {string}")
	public void enterUserZipCode(String zipCode) {
		auto.enterZipCode(zipCode);
	}

	@When("User selects Card Type {string}")
	public void selectUserCardType(String cardType) {
		auto.enterCardType(cardType);
		/*
		 * List<Map<String, String>> listMap = dataTable.asMaps();
		 * 
		 * for (Map<String, String> map : listMap) {
		 * 
		 * for (Map.Entry<String, String> entry : map.entrySet()) {
		 * 
		 * String key = entry.getKey(); String value = entry.getValue();
		 * 
		 * System.out.println(key + " : " + value);
		 * 
		 * if(value == null) { continue; }
		 * 
		 * String[] cardArr = value.split("-");
		 * 
		 * //System.out.println("Hobby Length: " + hobbyArr.length);
		 * auto.enterCardType(cardArr); } Thread.sleep(3000); } throw new
		 * io.cucumber.java.PendingException();
		 */
	}

	@When("User enters Credit Card Number {string}")
	public void enterUserCreditCardNumber(String creditCardNumber) {
		auto.enterCreditCardNumber(creditCardNumber);
	}

	@When("User selects Credit Card Month {string}")
	public void selectUserCreditCardMonth(String creditCardMonth) {
		auto.enterCreditCardMonth(creditCardMonth);
	}

	@When("User enters Credit Card Year {string}")
	public void enterUserCreditCardYear(String creditCardYear) {
		auto.enterCreditCardYear(creditCardYear);
	}

	@When("User enters Name on Card {string}")
	public void enterUserNameOnCard(String creditCardName) {
		auto.enterName(creditCardName);
	}

	@When("User clicks on Remember Me checkbox")
	public void clickRememberMeCheckbox() {
		auto.clickRememberMe();
	}

	@When("User clicks on Purchase Flight button")
	public void clickPurchaseFlightButton() {
		auto.clickPurchaseFlight();
	}

	@Then("User verifies thank you message {string}")
	public void verifyThankYouMessage(String thankYou) throws InterruptedException {
		System.out.println(thankYou);
		Thread.sleep(3000);
		Constants.driver.quit();
	}

}
 