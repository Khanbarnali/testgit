Feature: Facebook sign up

In order to verify search
as a uger
i want to Facebook sign up

Scenario Outline:
Given user visiting facebook url
When user enter "<First name>" "<Last name>" and valid "<email address>" and "<new password>" and click"<female>"
Then user select dropdown Month and dropdown Day and dropdown Year 

Examples:
|First name| Last name| email address |new password|
| Aritri| Khan |aritri_tazeen@yahoo.com |abc123 |