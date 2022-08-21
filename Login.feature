Feature: Login to the LeafTaps application

Background:
Given Launch the chrome browser
And Load the Url and Maximize the window

Scenario: Positive Login
Given Enter the username as 'DemoSalesManager'
And Enter the Password as 'crmsfa'
When Click the Login Button
Then Verify the Home is displayed

Scenario: Negative Login
Given Enter the username as 'DemoUser'
And Enter the Password as 'password1'
When Click the Login Button
But Error message is displayed