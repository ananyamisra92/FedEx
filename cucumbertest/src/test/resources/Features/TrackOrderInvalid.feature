@Regression
Feature: To validate FedEx website

  @SanityTest
  Scenario Outline: To validate error displayed for invalid tracking ID
    Given I have navigated to FedEx
    When I select language and region
    And I click on Accept Cookies
    And I enter tracking ID "<ID>"
    And I click Enter
    Then I validate the error message "<message>"

    Examples: 
      | ID  | message |                                
      | 123 | Unfortunately we are unable to retrieve your tracking results at this time. Please try again later. |