package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeTrackPage {

	@FindBy(xpath = "//div[text()='Tasks']")
	private WebElement tasksTab;

	public TimeTrackPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getTasksTab() {
		return tasksTab;
	}

}
