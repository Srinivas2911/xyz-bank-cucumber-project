package com.bank.cucumber.stepdefs;

/*
Created by SP
*/

import com.bank.basepage.BasePage;
import com.bank.pages.AddCustomerPage;
import com.bank.pages.BankManagerLoginPage;
import com.bank.pages.CustomerDetailsPage;
import com.bank.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;

public class MyStepdefs extends BasePage {
 //   private WebDriver driver;

    @Given("^I am on Home page$")
    public void iAmOnHomePage() {
    }

    @When("^I click On Bank Manager Login Tab$")
    public void iClickOnBankManagerLoginTab() {
        new HomePage().clickOnBankManagerLoginTab();
    }

    @And("^I click On Add Customer Tab$")
    public void iClickOnAddCustomerTab() {
        new BankManagerLoginPage().clickOnAddCustomerTab();
    }

    @And("^I enter FirstName \"([^\"]*)\"$")
    public void iEnterFirstName(String firstName)  {
        new AddCustomerPage().enterNewUserFirstName(firstName);
    }

    @And("^I enter LastName  \"([^\"]*)\"$")
    public void iEnterLastName(String lastName)  {
        new AddCustomerPage().enterNewUserLastName(lastName);
    }

    @And("^I enter PostCode \"([^\"]*)\"$")
    public void iEnterPostCode(String postCode)  {
        new AddCustomerPage().enterNewUserPostcode(postCode);
    }

    @And("^I click On Add Customer Button$")
    public void iClickOnAddCustomerButton() {
        new AddCustomerPage().clickOnAddCustomerBtn();
    }

    @And("^popUp Displays$")
    public void popupDisplays() {
        new AddCustomerPage().popUpDisplayMessage();
    }

    @Then("^I can verify Customer added successfully message$")
    public void iCanVerifyCustomerAddedSuccessfullyMessage() {
        Alert alert = driver.switchTo().alert();
        Assert.assertTrue(alert.getText().contains("Customer added successfully"));


    }


    @And("^I click on OK button on popup\\.$")
    public void iClickOnOKButtonOnPopup() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    @And("^I click on Customers Tab$")
    public void iClickOnCustomersTab() {
        new BankManagerLoginPage().clickOnCustomersTab();
    }

    @And("^I search customer by \"([^\"]*)\"$")
    public void iSearchCustomerBy(String firstName) {
        new CustomerDetailsPage().searchCustomerByName(firstName);

          }

    @And("^I click on Delete button$")
    public void iClickOnDeleteButton() {
        new CustomerDetailsPage().clickOnDeleteCustomerButton();
    }

    @Then("^verify Customer is Deleted Successfully$")
    public void verifyCustomerIsDeletedSuccessfully() {
        Assert.assertFalse(new CustomerDetailsPage().verifyCustomerRecord().contains("Harry"));
    }


}
