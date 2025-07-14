Feature: User Registration Flow

  Scenario: David completes account registration and deletion

    Given David is on the Automation Exercise home page

    When David  registers a new account with valid personal information

    Then David should be logged in and able to delete the account successfully
