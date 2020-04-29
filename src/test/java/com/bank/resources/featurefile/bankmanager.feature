Feature: Bank Manager Login Functionality

  As a User I want to add or delete customer on Bank manager Login

  Scenario:Verify Bank Manager Should Add Customer Successfully
    Given I am on Home page
    When I click On Bank Manager Login Tab
    And I click On Add Customer Tab
    And I enter FirstName " Ron"
    And I enter LastName  " Weasly"
    And I enter PostCode "HA6 1NW"
    And I click On Add Customer Button
    And popUp Displays
    Then I can verify Customer added successfully message
    And I click on OK button on popup.

  Scenario:Verify Bank Manager Should Delete Customer Successfully
    Given I am on Home page
    When I click On Bank Manager Login Tab
    And I click on Customers Tab
    And I search customer by " Ron"
    And I click on Delete button
    Then verify Customer is Deleted Successfully

