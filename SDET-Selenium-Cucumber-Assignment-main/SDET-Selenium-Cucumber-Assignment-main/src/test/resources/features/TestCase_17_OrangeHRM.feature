Feature: Validate OrangeHRP Page


Scenario: Validating text – Job Title
Given When I am in OrangeHRP Application
Then Login to Application 
When I click on Admin Link 
Then Click on Job 
And validate text – Job Title
And Close the browser

