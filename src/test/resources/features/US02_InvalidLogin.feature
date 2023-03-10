
Feature: As a user, I should NOT be able to login with
  invalid credentials
@wip
  Scenario Outline: Verify user can NOT login with invalid credentials
    Given user is on the login page
    When user enters invalid "<username>" and "<password>"
    And user clicks on the login button
    Then verify "<message>" message is displayed
    Examples:
      | username | password    | message                    |
      | User9    | Wrong       | Wrong username or password |
      | Wrong    | UserPass123 | Wrong username or password |
      | Wrong    | Wrong       | Wrong username or password |