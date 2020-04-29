package com.bank.pages;

import com.bank.utility.Utility;
import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerDetailsPage extends Utility {

    //Logging the elements and method into the log4j logs and reports
    private static final Logger log = LogManager.getLogger(CustomerDetailsPage.class.getName());


    //Using selenium @Findby and initElement methods for locators/elements
// using _ help separate them from variable

    @FindBy(xpath = "//input[@placeholder='Search Customer']")
    WebElement _searchCustomerField;

    @FindBy(xpath = "//button[contains(text(),'Delete')]")
    WebElement _deleteCustomerBtn;

    @FindBy(xpath = "//body[@class='ng-scope']/div[@class='ng-scope']/div[@class='container-fluid ng-scope']/div[@class='ng-scope']/div[@class='border box padT20 ng-scope']/div[@class='ng-scope']/div[@class='marTop ng-scope']/div[1]")
    WebElement _noCustomerRecord;

    public void searchCustomerByName(String firstName) {
        Reporter.addStepLog("Finding Customer by First Name : " + firstName + " On Search Customer Field " + _searchCustomerField.toString() + "<br>");
        clickOnElement(_searchCustomerField);
        sendTextToElement(_searchCustomerField, firstName);
        log.info("Finding Customer by First Name : " + firstName + " On Search Customer Field " + _searchCustomerField.toString());
    }
    public void clickOnDeleteCustomerButton() {
        Reporter.addStepLog(" Clicking on Delete Customer Button : " + _deleteCustomerBtn.toString() + "<br>");
        clickOnElement(_deleteCustomerBtn);
        log.info(" Clicking on Delete Customer Button : " + _deleteCustomerBtn.toString());
    }

    public String verifyCustomerRecord(){
        Reporter.addStepLog("Verifying Customer Name is Not Displayed : " + _noCustomerRecord.toString());
        log.info("Verifying Customer Name is Not Displayed: " + _noCustomerRecord.toString());
        return getTextFromElement(_noCustomerRecord);


    }
}
