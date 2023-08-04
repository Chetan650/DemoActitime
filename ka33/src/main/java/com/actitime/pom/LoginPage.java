package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath = "//input[@name='username']")
	private WebElement usernameTextField;

	@FindBy(xpath = "//input[@name='pwd']")
	private WebElement passwordTextField;

	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement loginButton;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setLogin(String un, String pw) {
		usernameTextField.sendKeys(un);
		passwordTextField.sendKeys(pw);
		loginButton.click();
	}
}
