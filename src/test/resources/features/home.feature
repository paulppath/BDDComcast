@HomeScenario
Feature: HomePage Scenario

  Scenario: Test Header
    #Given User navigate to homepage
    Then User should see header as "Comcast Business - Official Site"

   @US001
  Scenario: Sign in btn
    #Given User navigate to homepage
    Then User should see "Sing In" Btn is displayed

  @US003
  Scenario: Verify navigation button
    Then User should see "Shop" Btn is displayed
    And User should see "Enterprise Solutions" Btn is displayed
    And User should see "Support" Btn is displayed