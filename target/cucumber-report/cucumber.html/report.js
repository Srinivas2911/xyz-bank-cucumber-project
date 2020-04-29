$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/bank/resources/featurefile/bankmanager.feature");
formatter.feature({
  "line": 1,
  "name": "Bank Manager Login Functionality",
  "description": "\r\nAs a User I want to add or delete customer on Bank manager Login",
  "id": "bank-manager-login-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 16380713400,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Verify Bank Manager Should Add Customer Successfully",
  "description": "",
  "id": "bank-manager-login-functionality;verify-bank-manager-should-add-customer-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click On Bank Manager Login Tab",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click On Add Customer Tab",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter FirstName \" Ron\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter LastName  \" Weasly\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter PostCode \"HA6 1NW\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click On Add Customer Button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "popUp Displays",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I can verify Customer added successfully message",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I click on OK button on popup.",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 333464300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnBankManagerLoginTab()"
});
formatter.result({
  "duration": 1076227700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnAddCustomerTab()"
});
formatter.result({
  "duration": 464984400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " Ron",
      "offset": 19
    }
  ],
  "location": "MyStepdefs.iEnterFirstName(String)"
});
formatter.result({
  "duration": 605558500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " Weasly",
      "offset": 19
    }
  ],
  "location": "MyStepdefs.iEnterLastName(String)"
});
formatter.result({
  "duration": 509303000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HA6 1NW",
      "offset": 18
    }
  ],
  "location": "MyStepdefs.iEnterPostCode(String)"
});
formatter.result({
  "duration": 320250900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnAddCustomerButton()"
});
formatter.result({
  "duration": 175316600,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.popupDisplays()"
});
formatter.result({
  "duration": 45716200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iCanVerifyCustomerAddedSuccessfullyMessage()"
});
formatter.result({
  "duration": 12740300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnOKButtonOnPopup()"
});
formatter.result({
  "duration": 16682200,
  "status": "passed"
});
formatter.after({
  "duration": 1249299900,
  "status": "passed"
});
formatter.before({
  "duration": 12892972400,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Verify Bank Manager Should Delete Customer Successfully",
  "description": "",
  "id": "bank-manager-login-functionality;verify-bank-manager-should-delete-customer-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "I am on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "I click On Bank Manager Login Tab",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I click on Customers Tab",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I search customer by \" Ron\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I click on Delete button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "verify Customer is Deleted Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 3003400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnBankManagerLoginTab()"
});
formatter.result({
  "duration": 1186207100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnCustomersTab()"
});
formatter.result({
  "duration": 468299600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " Ron",
      "offset": 22
    }
  ],
  "location": "MyStepdefs.iSearchCustomerBy(String)"
});
formatter.result({
  "duration": 938720200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnDeleteButton()"
});
formatter.result({
  "duration": 10255149800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.verifyCustomerIsDeletedSuccessfully()"
});
formatter.result({
  "duration": 133670900,
  "status": "passed"
});
formatter.after({
  "duration": 1517179000,
  "status": "passed"
});
formatter.uri("src/test/java/com/bank/resources/featurefile/customer.feature");
formatter.feature({
  "line": 2,
  "name": "Customer Functionality",
  "description": "\r\nAs a User I want to login and logout and deposit successfully",
  "id": "customer-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 12355183800,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Verify Customer Should Login and logout Successfully",
  "description": "",
  "id": "customer-functionality;verify-customer-should-login-and-logout-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I am on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I click on Customer Login Tab",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I search Customer Created by \"Ron Weasly\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I verify the LogOut Tab is Displayed",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on Logout",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I verify Your Name label is Displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 7644400,
  "status": "passed"
});
formatter.match({
  "location": "MyCustdefs.iClickOnCustomerLoginTab()"
});
formatter.result({
  "duration": 1315260100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ron Weasly",
      "offset": 30
    }
  ],
  "location": "MyCustdefs.iSearchCustomerCreatedBy(String)"
});
formatter.result({
  "duration": 1172502500,
  "status": "passed"
});
formatter.match({
  "location": "MyCustdefs.iClickOnLoginButton()"
});
formatter.result({
  "duration": 506833700,
  "status": "passed"
});
formatter.match({
  "location": "MyCustdefs.iVerifyTheLogOutTabIsDisplayed()"
});
formatter.result({
  "duration": 259854800,
  "status": "passed"
});
formatter.match({
  "location": "MyCustdefs.iClickOnLogout()"
});
formatter.result({
  "duration": 10274265500,
  "status": "passed"
});
formatter.match({
  "location": "MyCustdefs.iVerifyYourNameLabelIsDisplayed()"
});
formatter.result({
  "duration": 88995500,
  "status": "passed"
});
formatter.after({
  "duration": 1497590000,
  "status": "passed"
});
formatter.before({
  "duration": 12450194100,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Verify Customer is Able to Deposit Money Successfully",
  "description": "",
  "id": "customer-functionality;verify-customer-is-able-to-deposit-money-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "I am on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "I click on Customer Login Tab",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I search Customer Created by \"Ron Weasly\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I click on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I click on Deposit Tab",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I enter amount \"100\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click on Deposit Button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I can verify Deposit Successfully Text",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 2353600,
  "status": "passed"
});
formatter.match({
  "location": "MyCustdefs.iClickOnCustomerLoginTab()"
});
formatter.result({
  "duration": 1218736200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ron Weasly",
      "offset": 30
    }
  ],
  "location": "MyCustdefs.iSearchCustomerCreatedBy(String)"
});
formatter.result({
  "duration": 955401700,
  "status": "passed"
});
formatter.match({
  "location": "MyCustdefs.iClickOnLoginButton()"
});
formatter.result({
  "duration": 228057600,
  "status": "passed"
});
formatter.match({
  "location": "MyCustdefs.iClickOnDepositTab()"
});
formatter.result({
  "duration": 484150500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 16
    }
  ],
  "location": "MyCustdefs.iEnterAmount(String)"
});
formatter.result({
  "duration": 664560200,
  "status": "passed"
});
formatter.match({
  "location": "MyCustdefs.iClickOnDepositButton()"
});
formatter.result({
  "duration": 297195000,
  "status": "passed"
});
formatter.match({
  "location": "MyCustdefs.iCanVerifyDepositSuccessfullyText()"
});
formatter.result({
  "duration": 174234300,
  "status": "passed"
});
formatter.after({
  "duration": 1706863300,
  "status": "passed"
});
});