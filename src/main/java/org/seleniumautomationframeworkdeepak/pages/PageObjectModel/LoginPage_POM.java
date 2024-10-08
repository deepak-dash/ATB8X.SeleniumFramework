package org.seleniumautomationframeworkdeepak.pages.PageObjectModel;


import org.openqa.selenium.By;
import org.seleniumautomationframeworkdeepak.base.CommonToAllPage;
import org.seleniumautomationframeworkdeepak.driver.DriverManagerTL;
import org.seleniumautomationframeworkdeepak.utils.PropertyReader;

public class LoginPage_POM extends CommonToAllPage {

    public LoginPage_POM(){
        super();
    }

    // Page Locators
    By username = By.id("login-username");
    By password = By.id("login-password");
    By signButton = By.id("js-login-btn");
    By error_message = By.id("js-notification-box-msg");

    // Page Actions

    public LoginPage_POM loginToVWOPositive() throws Exception {
        enterInput(username, PropertyReader.readKey("username"));
        enterInput(password,PropertyReader.readKey("password"));
        clickElement(signButton);
        //DriverManager.getDriver().findElement(password).click();
        // Pass the control the DashboardPage
        return this;
    }

    public void openURL(String url){
        DriverManagerTL.getDriver().get(url);
    }

    public String loginToVWONegative() throws Exception {
        enterInput(username, "admin");
        enterInput(password, PropertyReader.readKey("password"));
        clickElement(signButton);
        // error String
        visibilityOfElement(error_message);
        return getElement(error_message).getText();

    }

    public DashboardPage_POM afterLogin(){
        return  new DashboardPage_POM();
    }










}