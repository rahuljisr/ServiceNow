@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag2
  Scenario Outline: Title of your scenario outline
    Given User should be in fb login page "<website>"
    When User enter the username "<username>"
    And User enter the password"<password>"
    And User click the login button
    Then User verify the profilename

    Examples: 
      | website                   | username   | password |
      | https://www.facebook.com/ | rahul@34mf | success  |
