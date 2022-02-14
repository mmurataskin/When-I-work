Feature:Login

  @validLogin
  Scenario: Login with valid credentials
    Given the user is on the login page
    When the user fills in emailbox with a valid email account
    And the user fills in passwordbox with a valid password
    And the user clicks Log In button
    Then the user should be on the Dashboard

  @invalidLogin
  Scenario: Login with invalid credentials
    Given the user is on the login page
    When the user fills in emailbox with an invalid email account
    And the user fills in passwordbox  with a invalid password
    And the user clicks Log In button
    Then the user should see invalid login message






