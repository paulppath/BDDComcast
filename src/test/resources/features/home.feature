Feature: HomePage Scenario
  @HomeScenario
  Scenario: Test Header
    //Given User navigate to homepage
    Then User should see header as "Comcast Business - Official Site"

  @HomeScenario @US001
  Scenario: Sign in btn
    //Given User navigate to homepage
    Then User should see "Sing In" Btn is displayed