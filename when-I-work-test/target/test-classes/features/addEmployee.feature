@addEmployee
Feature:Add Employee

  Background:
    Given the user is on the login page
    When the user fills in emailbox with a valid email account
    And the user fills in passwordbox with a valid password
    And the user clicks Log In button
    Then the user should be on the Dashboard

  Scenario: Add an Employee to the account on the Employees page
    Given the user wants to add an employee
    When the user clicks on Scheduler tab
    And the user clicks on add an employee button
    And the user enter employee credentials
    And the user clicks on add employee button
    Then the user should see employee is added








