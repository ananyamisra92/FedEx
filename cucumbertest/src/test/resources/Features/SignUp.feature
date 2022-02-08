@Regression
Feature: To validate SignUp in FedEx

  @SanityTest
  Scenario Outline: To validate signup in FedEx
    Given I have navigated to FedEx
    When I select language and region
    And I click on Accept Cookies
    And I click on Sign In
    And I click on Open An Account
    And I click on Personal Account
    And I set First Name "<First Name>"
    And I set Last Name "<Last Name>"
    And I enter address "<address>"
    And I enter phone number <Phone Number>
    And I enter email "<Email ID>"
    And I click on LoginDetails
    And I enter password "<password>"
    And I confirm password "<password>"
    And I click on Terms and Conditions
    And I click on Create my User ID
    And I click on Open An Account
    Then I validate the completion message

    Examples: 
      | First Name | Last Name | address                                             | Phone Number | Email ID                 | password  | 
      | Test       | BCD       | Loevesteinse Randweg 111, Badhoevedorp, Netherlands |    465941001 | ananya.misra93@gmail.com | Fed@12345 |
