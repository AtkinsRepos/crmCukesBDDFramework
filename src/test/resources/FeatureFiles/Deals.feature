@regression, @deals
Feature: Create and Add deals functionalities 

Scenario: Create and Add deals using the application
	Given user launches the web browser 
	And  user is on the login page 
	When  user enters username and password and clicks on the login button 
		|username|password|
		|Agnes22|Terru_562|
	Then user should be able to login and be navigated to the Hope page 
	Then go to Deals page  
	And fill the Deals form with deals details and save it     
		|Title|Company|PrimaryContact|Amount|Probability|Commission	|Identifier|Quantity|
		|Dr.|OilMooson|Allen|£12.400|12|20|TK167|12|
		|Reverend|Aviatorium|Aaron|£20000 |24|14|TK179|34|
		|Mr.|transVilla|Arthur|£17600 |50 |23 |TK186 |54|
	
	Then close the web browser 
