@smoke
Feature: Login Functionality 
#Background:
#Given user launches the web browser 
#And  user is on the login page 
Scenario Outline: valid login. 
	Given user launches the web browser 
     And  user is on the login page
	When  user enters username "<username>"and enters password "<password>"and clicks on the login button
	Then user should be able to login and be navigated to the Hope page
	And  user should close the browser 
	
	
	Examples: 
	
		|username|password|
		|Agnes22 |Terru_562|
		#|fatiagu34| Yu76@plr |
		#|Abunateky|Yu76_yute|
		#|ladimore|Yu76435@plo |
    
