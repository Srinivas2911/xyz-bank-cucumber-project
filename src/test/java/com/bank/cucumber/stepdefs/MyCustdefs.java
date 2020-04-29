package com.bank.cucumber.stepdefs;

/*
Created by SP
*/

import com.bank.pages.AccountPage;
import com.bank.pages.CustomerLoginPage;
import com.bank.pages.CustomerPage;
import com.bank.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyCustdefs {

    @When("^I click on Customer Login Tab$")
    public void iClickOnCustomerLoginTab() {
        new HomePage().clickOnCustomerLoginTab();
    }

    @And("^I search Customer Created by \"([^\"]*)\"$")
    public void iSearchCustomerCreatedBy(String customer)  {
 //       new CustomerLoginPage().clickOnYourName();
        new CustomerLoginPage().selectYourNameOnCustomerPage(customer);
    }

    @And("^I click on Login Button$")
    public void iClickOnLoginButton() {
        new CustomerLoginPage().clickOnCustomerLoginButton();
    }

    @And("^I verify the LogOut Tab is Displayed$")
    public void iVerifyTheLogOutTabIsDisplayed() {
        Assert.assertEquals(new CustomerPage().getCustomerLoutOutText(), "Logout");
    }

    @And("^I click on Logout$")
    public void iClickOnLogout() {
        new CustomerPage().clickOnCustomerLogOutButton();
    }

    @Then("^I verify Your Name label is Displayed$")
    public void iVerifyYourNameLabelIsDisplayed() {
        Assert.assertEquals(new CustomerLoginPage().getYourNameTextMessage(), "Your Name :");
    }


    @And("^I click on Deposit Tab$")
    public void iClickOnDepositTab() {
        new AccountPage().clickOnDepositTab();
    }

    @And("^I enter amount \"([^\"]*)\"$")
    public void iEnterAmount(String amount)  {
        new AccountPage().enterDepositAmount(amount);
                    }

    @And("^I click on Deposit Button$")
    public void iClickOnDepositButton() {
        new AccountPage().clickOnDepositButton();
    }

    @Then("^I can verify Deposit Successfully Text$")
    public void iCanVerifyDepositSuccessfullyText() {
        new AccountPage().verifyThatDepositSuccessfulTextisDisplayed();

    }
}
