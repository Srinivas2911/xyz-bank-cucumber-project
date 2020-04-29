
Feature: Customer Functionality

  As a User I want to login and logout and deposit successfully

  Scenario: Verify Customer Should Login and logout Successfully

  Given I am on Home page
    When I click on Customer Login Tab
    And I search Customer Created by "Ron Weasly"
    And I click on Login Button
    And I verify the LogOut Tab is Displayed
    And I click on Logout
    Then I verify Your Name label is Displayed

Scenario: Verify Customer is Able to Deposit Money Successfully

  Given I am on Home page
  When I click on Customer Login Tab
  And I search Customer Created by "Ron Weasly"
  And I click on Login Button
  And I click on Deposit Tab
  And I enter amount "100"
  And I click on Deposit Button
  Then I can verify Deposit Successfully Text

