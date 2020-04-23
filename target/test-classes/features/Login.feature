@sprint1
Feature: Login Functionality



  @login @smoke
  Scenario: Verify if a user will be able to login with a valid username and valid password.
    Given User enter valid username
    When User enter valid password
    Then User click on Login button
    And Verify user logged in successfully

  @login 
  Scenario Outline: Verify if a user cannot login with a invalid credentials.
    Given User enter username "<username>"
    When User enter passwords "<password>"
    And User click on Login button
    Then I verify error message  "<error message>"

    Examples: 
      | username      | password     | error message                                                             |
      | standart_us   | secret_sauce | Epic sadface: Username and password do not match any user in this service |
      | standard_user | secret_sa    | Epic sadface: Username and password do not match any user in this service |
      |               |              | Epic sadface: Username is required                                        |
