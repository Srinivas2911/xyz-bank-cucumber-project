package com.bank.pages;

import com.bank.utility.Utility;
import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    //Logging the elements and method into the log4j logs and reports
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    //Using selenium @Findby and initElement methods for locators/elements
// using _ help separate them from variable

    @FindBy(xpath = "//button[@class='btn home']")
    WebElement _homeButton;

    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement _customerLoginTab;

    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement _bankManagerLoginTab;

    public void clickOnBankManagerLoginTab (){
        Reporter.addStepLog("Clicking on Manager Login Tab: " + _bankManagerLoginTab.toString() + "<br>");
        clickOnElement(_bankManagerLoginTab);
        log.info("Clicking on Manager Login Tab: " + _bankManagerLoginTab.toString());
    }

    public void clickOnCustomerLoginTab (){
        Reporter.addStepLog("Clicking on Customer Login Tab: " + _customerLoginTab.toString() + "<br>");
        clickOnElement(_customerLoginTab);
        log.info("Clicking on Customer Login Tab: " + _customerLoginTab.toString());
    }

}
