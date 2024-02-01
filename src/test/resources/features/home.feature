@HomeScenario
Feature: HomePage Scenario

  Background:
    When User click on "Top Screen Banner Close" button

  Scenario: Test Header
    #Given User navigate to homepage
    Then User should see header as "Comcast Business - Official Site"

  @US001
  Scenario: Sign in btn
    #Given User navigate to homepage
    Then User should see "Sing In" Btn is displayed

  @US003 @smoke
  Scenario: Verify navigation button
    Then User should see "Shop" Btn is displayed
    And User should see "Enterprise Solutions" Btn is displayed
    And User should see "Support" Btn is displayed

  @US003a
  Scenario: Verify navigation button (improve version)
    Then User should see following button is displayed
      | Shop                 |
      | Enterprise Solutions |
      | Support              |

  @US003b
    Scenario Outline: Verify navigation button (Scenario Outline version)
      Then User should see "<Nav Btn>" Btn is displayed
    Examples:
      | Nav Btn              |
      | Shop                 |
      | Enterprise Solutions |
      | Support              |

  @US0021
  Scenario: Get quot
    Given User scroll down to "Get a free quote in 2 easy steps" text
    When User enter "John" in "First name" box
    And User enter "Doh" in "Last name" box
    And User enter "hello@gmail.com" in "Email" box
    And User enter "20111" in "Zip code" box
    When User click on "Get Started" button
    Then User should see "Get My Free Quote" Btn is displayed

  @US0022
  Scenario: Get quot (improve version)
    Given User scroll down to "Get a free quote in 2 easy steps" text
    When User enter information in the following input fields
      | First Name | John            |
      | Last Name  | Doh             |
      | Email      | hollo@gmail.com |
      | Zip Code   | 20111           |
    When User click on "Get Started" button
    Then User should see "Get My Free Quote" Btn is displayed