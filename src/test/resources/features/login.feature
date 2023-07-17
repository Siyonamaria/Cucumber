Feature: login functionality

  Scenario: To check login functionality
    Given Launch the browser
    And user open the url "https://www.instagram.com/"
    When user enters username and password
    Then click on login button
