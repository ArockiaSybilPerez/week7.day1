Feature: Edit lead

Background: Login to leaftabs

Given Enter the username as 'DemoSalesManager'
And Enter the Password as 'crmsfa'
When Click the Login Button
Then Verify the Home is displayed
And Click CRMSFA Link
And Click Leads Tab

Scenario Outline: Edit lead

And Click on find lead link
And Enter first name as <firstname>
And Click find leads button
And Click on the first resulting lead
And Click on edit button
And Change the company name as <companyname>
And Click on update button
Then Verify whether the lead is modified


Examples:
|firstname|companyname|
|Arockia|Sysarc|


