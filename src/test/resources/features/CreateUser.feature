Feature: Creating a new user Profile on Tek Retail App
  Scenario: Signing up on Tek Retail App for a new User
    Given Open the a Browser and visit tekRetail app
    When Click on the sign in Link
    Then Provide Valid Email and Password
    Then Click on Sign Up Button
    Then Validate that account and logout button are visible
