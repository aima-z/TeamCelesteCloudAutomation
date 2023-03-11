@MainModules
Feature: As a user, I should be accessing all the main modules of the app.

  Scenario: Verify users accessing all the main modules of the app. Given user on the login page
    When the users log in with valid credentials
    Then Verify the user see the following modules:
      | Dashboard |
      | Files     |
      | Photos    |
      | Activity  |
      | Mail      |
      | Talk      |
      | Contacts  |
      | Circles   |
      | Calendar  |
      | Notes     |
      | Deck      |
      | Task      |

