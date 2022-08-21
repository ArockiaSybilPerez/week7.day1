Feature: Login to the LeafTaps application

Background: Positive Login
Given Enter the username as 'DemoSalesManager'
And Enter the Password as 'crmsfa'
When Click the Login Button
Then Verify the Home is displayed

Scenario Outline: Create Lead with different data
Given Click CRMSFA Link
And Click Leads Tab
And Click Create Leads Link
When Type the company name as <companyName>
And Type the first name as <firstName>
And Type the last name as <lastName>
And Click Create Leads Button
Then Verify the View Leads Page

Examples:
|CompanyName|firstName|lastName|
|TestLeaf|Arockia|Sybil|
|Sysarc|Anand|Kumar|