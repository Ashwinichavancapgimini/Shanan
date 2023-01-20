Feature: Login functionality
Scenario: To verify login functionality with valid credentials
Given  Browser is open and User is on login page
When  User enter un and pswd
And   User click on login btn
Then  User should neavigate on homepage
