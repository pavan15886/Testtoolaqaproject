Feature: Countdown Timer Feature

#Without examples keyword
Scenario: Test Countdown Timer Scenario

Given user is already on Countdown Timer Page
When title of login page is E.gg Timer
Then user enters "25 seconds"
Then user clicks on Go button