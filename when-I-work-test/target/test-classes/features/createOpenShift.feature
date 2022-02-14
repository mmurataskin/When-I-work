
Feature:Create OpenShift

  Background:
    Given the user is on the login page
    And the user fills in emailbox with a valid email account
    And the user fills in passwordbox with a valid password
    And the user clicks Log In button
    And the user should be on the Dashboard

  @scenariofour
  Scenario: Create an OpenShift on the Scheduler.
    Given the user wants to create an OpenShift on the Scheduler
    And the user clicks on Scheduler tab
    And the user clicks on createOpenshift icon
    And the user enters credentials
    When the user clicks on save button
    Then the the scheduled shift will show up
    And the user clicks on shiftactions icon
    And the user clicks on delete button
    When the user clicks on confirm delete button

  @scenariofive
  Scenario: Create an OpenShift on the Scheduler and publish it
    Given the user wants to create an OpenShift on the Scheduler
    And the user clicks on Scheduler tab
    And the user clicks on createOpenshift icon
    And the user enters credentials
    And the user clicks on save button
    And the user clicks on edit icon
    And the user assigns to employee
    When the user clicks on saveandpublish button
    Then the user will see successful entry message
    And the user clicks on shiftactions icon
    And the user clicks on delete button
    When the user clicks on confirm delete button










