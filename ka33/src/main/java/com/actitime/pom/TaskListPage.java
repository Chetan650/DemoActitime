package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {

	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement addNewButton;

	@FindBy(xpath = "//div[text()='+ New Customer']")
	private WebElement newCustomerButton;

	@FindBy(xpath = "//input[@placeholder='Enter Customer Name' and @class]")
	private WebElement enterCustomerNameTextField;

	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement description;

	@FindBy(xpath = "//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectCustomerDropdown;

	@FindBy(xpath = "//div[@class='searchItemList']//div[text()='Big Bang Company']")
	private WebElement selectOneCustomer;

	@FindBy(xpath = "//div[text()='Create Customer']")
	private WebElement createCustomerButton;

	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewButton() {
		return addNewButton;
	}

	public WebElement getNewCustomerButton() {
		return newCustomerButton;
	}

	public WebElement getEnterCustomerNameTextField() {
		return enterCustomerNameTextField;
	}

	public WebElement getDescription() {
		return description;
	}

	public WebElement getSelectCustomerDropdown() {
		return selectCustomerDropdown;
	}

	public WebElement getSelectOneCustomer() {
		return selectOneCustomer;
	}

	public WebElement getCreateCustomerButton() {
		return createCustomerButton;
	}
}
