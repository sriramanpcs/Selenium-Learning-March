Feature: Leaftaps Login

Background:
Given Open the Browser
And Max Browser
And set the timeouts
And Load the URL
#And Enter the username as DemoSalesManager
#And Enter the password as crmsfa
And Enter the username as DemoSalesManager
And Enter the password as crmsfa
When click on on the Login Button
Then verify Login successful

#Scenario: click cmrsfa menu
#Given click the link text crms/fa

#Scenario: Clicking CreateLead Menu
#Given click the create lead
#And Max Browser
#And set the timeouts
#And Load the URL
#And Enter the username as DemoSalesManager
#And Enter the password as crmsfa
#And Enter the username as <uName>
#And Enter the password as <pwd>
#When click on on the Login Button
#Then verify Login successful



Scenario Outline: Positive flow for cLead
Given Enter the first name as <fname>
And Enter the last name as <lname>
And Enter the company name as <cname>
When click on on the Create Lead Button
Then verify Lead Created successful

Examples:
|fname||lname||cname|
|Sri||ram||Infosys|
|badri||narayana||CTS|