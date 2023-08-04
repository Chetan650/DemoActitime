package com.actitime.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.LoginPage;
import com.actitime.pom.TaskListPage;
import com.actitime.pom.TimeTrackPage;

public class CustomerModule extends BaseClass {

	@Test
	public void testCreateCustomer() {
		Reporter.log("Create Customer", true);
		LoginPage lp = new LoginPage(driver);
		lp.setLogin("admin", "manager");

		TimeTrackPage tt = new TimeTrackPage(driver);
		tt.getTasksTab().click();

		TaskListPage tl = new TaskListPage(driver);
		tl.getAddNewButton().click();
		tl.getNewCustomerButton().click();
		tl.getEnterCustomerNameTextField().sendKeys("CBA");
		tl.getDescription().sendKeys("Banking Project");
		tl.getSelectCustomerDropdown().click();
		tl.getCreateCustomerButton().click();
	}
}
