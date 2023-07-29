Feature: facebook

Background: common function
Given launch the URL


@smoke
Scenario Outline:  creating new FB Account

When creating new account
And entering personal details "<fname>" "<lname>"
And entering "<mobile>" "<password>"
And selecting DOB "<date>" "<month>" "<year>" "<gender>"
Then create Account

Examples:
|fname|lname|mobile|password|date|month|year|gender|
|Abinav|Narayana|9043498719| 012345@67 |10 |2|1999|Female|
|Nethra|Ram |9043397110| 98765432@1|25|12|1995|Male|



