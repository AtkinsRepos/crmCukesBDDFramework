@sanity, @company
Feature: Add company details functionalities 
Scenario: Add new User company information 
	Given user launches the web browser 
	And  user is on the login page 
	When  user enters username and password and clicks on the login button 
		|username|password|
		|Agnes22|Terru_562|
	Then user should be able to login and be navigated to the Hope page 
	Then go to Company page  
	And fill the company  form with user details and save it     
		|CompanyName|IndustryName|AnnualRevenue|Status|Category|Priority|PhoneNumber|Email|
		|GulfIsland|Oil & Gas|£3000000|Active|Partner|High|078353673637|Email54@email.com|
		|EgTrud|Aviation|$$0000| Hot|Client|Medium|08798765453|please65@tyr.com|
		|TadiuosConnect|transportation|£24Miilion|New|Prospect|Event|1234447653|traders87@trd.com|
	Then close the web browser 
