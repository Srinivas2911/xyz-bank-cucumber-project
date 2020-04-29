package com.bank.pages;

import com.bank.utility.Utility;
import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerLoginPage  extends Utility {

    //Logging the elements and method into the log4j logs and reports
    private static final Logger log = LogManager.getLogger(CustomerLoginPage.class.getName());


    //Using selenium @Findby and initElement methods for locators/elements
// using _ help separate them from variable

@FindBy(id = "userSelect")
WebElement _selectUser;

@FindBy(xpath = "//button[@class='btn btn-default']")
WebElement _loginCustomerBtn;

@FindBy(xpath = "//label[contains(text(),'Your Name :')]")
WebElement _yourNameText;

@FindBy(xpath = "//button[@class='btn home']")
WebElement _homePageBtn;

    public void clickOnHomepageBtn () {
        Reporter.addStepLog("Clicking on Home Page Button : " + _homePageBtn.toString() + "<br>");
        clickOnElement(_homePageBtn);
        log.info("Clicking on Home Page Button : " + _homePageBtn.toString());
    }
        public void clickOnYourName(){
            Reporter.addStepLog("Clicking on Your Name Field : " + _selectUser.toString() + "<br>");
            clickOnElement(_selectUser);
            log.info("Clicking on Your Name Field : " + _selectUser.toString());
    }
    public void selectYourNameOnCustomerPage(String customer){
        Reporter.addStepLog("Selecting Name of Customer from DropDown  : " +customer+ " Your Name Field "+ _selectUser.toString() + "<br>");
        clickOnElement(_selectUser);
        selectByVisibleTextFromDropDown(_selectUser, customer);
        log.info("Selecting Name of Customer from DropDown  : " +customer+ " Your Name Field "+ _selectUser.toString());
    }
    public void verifyThatYourNameTextIsDisplayed (){
        Reporter.addStepLog(" Verify Your Name Text is Displayed  : " + _yourNameText.toString() + "<br>");
        verifyThatTextIsDisplayed(_yourNameText, "Your Name :");
        log.info(" Verify Your Name Text is Displayed  : " + _yourNameText.toString());
    }
    public String getYourNameTextMessage (){
        Reporter.addStepLog(" Getting Your Name Text : " + _yourNameText.toString() + "<br>");
        log.info(" Getting Your Name Text : " + _yourNameText.toString());
        return getTextFromElement(_yourNameText);
    }
    public void clickOnCustomerLoginButton(){
        Reporter.addStepLog("Clicking on Customer Login Button : " + _selectUser.toString() + "<br>");
//        waitUntilElementToBeClickable((By) _loginCustomerBtn, 20);
        clickOnElement(_loginCustomerBtn);
        log.info("Clicking on Customer Login Button : " + _selectUser.toString());
    }
}
