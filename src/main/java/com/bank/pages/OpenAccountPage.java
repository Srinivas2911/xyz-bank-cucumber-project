package com.bank.pages;

import com.bank.utility.Utility;
import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenAccountPage extends Utility {

    //Logging the elements and method into the log4j logs and reports
    private static final Logger log = LogManager.getLogger(OpenAccountPage.class.getName());

    //Using selenium @Findby and initElement methods for locators/elements
// using _ help separate them from variable

@FindBy(xpath = "//select[@name='userSelect']")
WebElement _selectCustName;

@FindBy(xpath = "//select[@name='currency']")
WebElement _selectCurrency;

@FindBy(xpath = "//button[contains(text(),'Process')]")
WebElement _processBtn;

@FindBy(xpath = "//button[@class='btn home']")
WebElement _homePageBtn;

    public void clickOnHomepageBtn () {
        Reporter.addStepLog("Clicking on Home Page Button : " + _homePageBtn.toString() + "<br>");
        clickOnElement(_homePageBtn);
        log.info("Clicking on Home Page Button : " + _homePageBtn.toString());
    }

    public void selectCustomerNameFromDropDown (String customer){
        Reporter.addStepLog("Selecting Customer Name from Drop Down : " + customer + " On Select Customer Field " + _selectCustName.toString() + "<br>");
        selectByVisibleTextFromDropDown(_selectCustName, customer);
        log.info("Selecting Customer Name from Drop Down : " + customer + " On Select Customer Field " + _selectCustName.toString());
    }
    public void selectCurrencyFromDropDown(String currency){
        Reporter.addStepLog("Selecting Currency from Drop Down : " + currency + " On Select Currency Field " + _selectCurrency.toString() + "<br>");
        selectByVisibleTextFromDropDown(_selectCurrency, currency);
        log.info("Selecting Currency from Drop Down : " + currency + " On Select Currency Field " + _selectCurrency.toString());
    }
    public void clickOnProcessButton(){
        Reporter.addStepLog("Clicking on Process Button : " + _processBtn.toString() + "<br>");
        log.info("Clicking on Process Button : "+ _processBtn.toString());
        clickOnElement(_processBtn);
    }
    public void popUpDisplayMessage (){
        Reporter.addStepLog("Displaying PopUp Message. <br>");
        alertPopUp();
        log.info("Displaying PopUp Message.");

    }

}
