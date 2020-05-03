Feature: Login feature

  Scenario Outline: Login functionality for a social networking site.
    Given user navigates to Login Page
    When I enter the Username as "<username>" and Password as "<password>"
    Then  login should be successful

   Examples:
      | username | password |
      | samir    | azert123 |
      | amine    | cddcd    |
