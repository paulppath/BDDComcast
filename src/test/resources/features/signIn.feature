@signIn
  Feature: SignIn Scenario
    Background: Navigating to Sing in page
      When User click on "Sign In" button

    @US102
    Scenario: Validate continue button is clickable
      Then validate "continue" Btn is enable