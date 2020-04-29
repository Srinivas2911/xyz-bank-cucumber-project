package com.bank.pages;

import com.bank.utility.Utility;
import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerPage extends Utility {

    //Logging the elements and method into the log4j logs and reports
    private static final Logger log = LogManager.getLogger(CustomerPage.class.getName());

    //Using selenium @Findby and initElement methods for locators/elements
// using _ help separate them from variable

@FindBy (xpath = "//button[@class='btn logout']")
WebElement _customerLogoutBtn;

@FindBy(xpath = "//button[@class='btn home']")
WebElement _homePageBtn;



    public void clickOnHomepageBtn () {
        Reporter.addStepLog("Clicking on Home Page Button : " + _homePageBtn.toString() + "<br>");
        clickOnElement(_homePageBtn);
        log.info("Clicking on Home Page Button : " + _homePageBtn.toString());
    }

    public String getCustomerLoutOutText (){
        Reporter.addStepLog("Getting Customer Log Out Text: " + _customerLogoutBtn.toString() + "<br>");
        log.info("Getting Customer Log Out Text: " + _customerLogoutBtn.toString());
        return getTextFromElement(_customerLogoutBtn);
    }

    public void verifyCustomerLoutOutTabIsDisplayed (){
        Reporter.addStepLog("Verifying Customer Log Out Tab is Displayed : " + _customerLogoutBtn.toString() + "<br>");
        verifyThatElementIsDisplayed(_customerLogoutBtn);
        log.info("Verifying Customer Log Out Tab is Displayed: " + _customerLogoutBtn.toString());
    }

    public void clickOnCustomerLogOutButton(){
        Reporter.addStepLog("Clicking on Customer Log Out Button : " + _customerLogoutBtn.toString() + "<br>");
        clickOnElement(_customerLogoutBtn);
        log.info("Clicking on Customer Log Out Button : " + _customerLogoutBtn.toString());
    }

}
