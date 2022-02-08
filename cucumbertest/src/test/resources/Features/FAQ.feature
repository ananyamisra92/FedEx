@Regression
Feature: To validate need help functionality in FedEx website

  @SanityTest
  Scenario Outline: To validate need help functionality
    Given I have navigated to FedEx
    When I select language and region
    And I click on Accept Cookies
    And I click on need help link
    Then I validate FAQ page is opened in next tab with title "<title>"

    Examples: 
      | title       |
      | f_quickhelp |