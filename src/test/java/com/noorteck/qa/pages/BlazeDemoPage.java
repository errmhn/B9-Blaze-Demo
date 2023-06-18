package com.noorteck.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.noorteck.qa.utils.Constants;

public class BlazeDemoPage {

	@FindBy(xpath = "//input[@id='inputName']")
	WebElement fullNameField;

	@FindBy(xpath = "//input[@id='address']")
	WebElement addressField;

	@FindBy(xpath = "//input[@id='city']")
	WebElement cityField;

	@FindBy(xpath = "//input[@id='state']")
	WebElement stateField;

	@FindBy(xpath = "//input[@id='zipCode']")
	WebElement zipCodeField;

	/*
	 * @FindBy(xpath = "//select[@id='cardType']") List<WebElement>
	 * cardTypeOptionList;
	 */

	@FindBy(xpath = "//select[@id='cardType']")
	WebElement cardTypeDropdown;

	@FindBy(xpath = "//input[@id='creditCardNumber']")
	WebElement creditCardNumberField;

	@FindBy(xpath = "//input[@id='creditCardMonth']")
	WebElement creditCardMonthField;

	@FindBy(xpath = "//input[@id='creditCardYear']")
	WebElement creditCardYearField;

	@FindBy(xpath = "//input[@id='nameOnCard']")
	WebElement nameOnCardField;

	@FindBy(xpath = "//input[@wfd-id='id10']")
	WebElement rememberMeCheckbox;

	@FindBy(xpath = "//input[@wfd-id='id11']")
	WebElement purchaseFlightButton;
	// xpath("//button[text()='Purchase Flight']"))
	// @FindBy(id = "//a[text()='WebTable']")
	// WebElement webTableLink;
	//// input[@wfd-id='id11']

	@FindBy(xpath = "//h1[text()='Thank you for your purchase today!']")
	WebElement thankYouMessageBanner;
	
	// Class Constructor
	public BlazeDemoPage() {
		PageFactory.initElements(Constants.driver, this);
	}

	// methods
	public void enterName(String inputName) {
		fullNameField.sendKeys(inputName);
	}

	public void enterAddress(String address) {
		addressField.sendKeys(address);
	}

	public void enterCity(String city) {
		cityField.sendKeys(city);
	}

	public void enterState(String state) {
		stateField.sendKeys(state);
	}

	public void enterZipCode(String zipCode) {
		zipCodeField.sendKeys(zipCode);
	}

	/*public void enterCardType(String cardType) {
			Select select = new Select(cardTypeDropdown);
			List<WebElement> optionList = select.getOptions();

			for (WebElement el : optionList) {
				String elText = el.getText();
				if (elText.equals(cardType)) {
					el.click();
					break;
				}
			}		
	}*/
	public void enterCardType(String cardType) {

		Select select = new Select(cardTypeDropdown);
		select.selectByVisibleText(cardType);
	}
	
	public void enterCreditCardNumber(String creditCardNumber) {
		creditCardNumberField.sendKeys(creditCardNumber);
	}

	public void enterCreditCardMonth(String creditCardMonth) {
		creditCardMonthField.sendKeys(creditCardMonth);
	}

	public void enterCreditCardYear(String creditCardYear) {
		creditCardYearField.sendKeys(creditCardYear);
	}

	public void enterNameOnCard(String creditCardName) {
		nameOnCardField.sendKeys(creditCardName);
	}

	public void clickRememberMe() {
		rememberMeCheckbox.click();
	}

	public void clickPurchaseFlight() {
		purchaseFlightButton.click();
	}
	
	//h1[text()='Thank you for your purchase today!']
	// /html/body/div[2]/div/h1 
	// COME BACK for lowercase...

	/*public void thankYouMessage(String thankYou) {
		thankYouMessageBanner.sendKeys(thankYou);
	}*/
/*	public void selectHobby(String[] hobbyArr) {

		for (String hobby : hobbyArr) {
			for (WebElement hobbyElement : hobbyCheckOptionList) {
				String attrValue = hobbyElement.getAttribute("value");
				if (attrValue.equals(hobby)) {
					hobbyElement.click();
				}
			}
		}
	}
*/
	


	}
 