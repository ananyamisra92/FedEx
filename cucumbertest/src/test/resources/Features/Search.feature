@Regression
Feature: To validate search in FedEx website

  @SanityTest
  Scenario Outline: To validate search functionality
    Given I have navigated to FedEx
    When I select language and region
    And I click on Accept Cookies
    And I click on Search
    And I enter search text "<searchtext>"
    And I click on search function button
    Then I validate the search results are displayed

    Examples: 
      | searchtext |
      | shipment   |
