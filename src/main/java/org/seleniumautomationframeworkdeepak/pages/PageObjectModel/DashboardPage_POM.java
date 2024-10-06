package org.seleniumautomationframeworkdeepak.pages.PageObjectModel;

import org.openqa.selenium.By;
import org.seleniumautomationframeworkdeepak.base.CommonToAllPage;

public class DashboardPage_POM extends CommonToAllPage {

    DashboardPage_POM() {
    }

    By userNameOnDashboard = By.cssSelector("[data-qa=\"lufexuloga\"]");

    // Page Actions
    public String loggedInUserName() {
        presenceOfElement(userNameOnDashboard);
        return getElement(userNameOnDashboard).getText();

    }



}