Feature: Login feature with valid and invalid users

  @domain3
  Scenario: Login with valid user
    Given User is on login page
    When User enters username as "ram"
    And User enters password as "ram123"
    And User clicks login button
    Then User should navigate to Home page
    And User shuld see his details

  @domain3
  Scenario: Login with invalid user
    Given User is on login page
    When User enters username as "vinod"
    And User enters password as "vinod123"
    And User clicks login button
    Then User should navigate to Home page
    And User shuld not see his details

  @domain3
  Scenario: User sign up
    Given User is on login page
    When User clicks sign up button
    And user enters following details
      | Ram | Phalke | ram@gmail.com | 1234567890 | Pune | Altimetrik |
    And User clicks submit button
    Then sign up is successfully done.

  @domain4
  Scenario Outline: Login with valid user
    Given User is on login page
    When User enters username <Username> and <Password>
    And User clicks login button
    Then User should navigate to Home page
    And User shuld see his details

    Examples: 
      | Username | Password |
      | user1    | pass1    |
      | user2    | pass2    |
      | user3    | pass3    |
      | user4    | pass4    |
