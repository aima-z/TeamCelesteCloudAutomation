
Feature: As a user, I want to access to Photos module.


  Scenario:  verify user access to the photos module

    Given users login to the app


    When the user clicks the "Photos" module


    Then verify there are following sub-modules

      | Your photos |
      | Favorites |
      | Your albums |
      | Shared albums |
      | Tagged photos |