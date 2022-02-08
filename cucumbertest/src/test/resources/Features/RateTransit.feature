@Regression
Feature: To validate rate and transit time is displayed in FedEx website

  @SanityTest
  Scenario Outline: To validate rate and transit time
    Given I have navigated to FedEx
    When I select language and region
    And I click on Accept Cookies
    Then I validate rate and transit time is displayed