@regression, @contacts
Feature: Add new Contacts 
Scenario Outline: 
	Given user launches the web browser 
	And  user is on the login page 
	When  user enters username "<username>"and enters password "<password>"and clicks on the login button 
	Then user should be able to login and be navigated to the Hope page 
	Then go to Contacts page 
	And fill the contact form with user details "<FirstName>" and "<LastName>" and "<CompName>" and "<position>" and "<DeptName>" and "<CityName>" and "<CountryName>". 
	And save the form 
	Then close the web browser  
	
	Examples: 
		| username|password|FirstName|LastName|CompName|position|DeptName|CityName|CountryName|
		| Agnes22|Terru_562|Beauty|Royal|TK ent|manager|HR|London|United Kingdom|
        #| fatiagu34|Yu76@plr|Amos|yola|TDD|Dev|QA Tester|Abuja|Nigeria|
        #| ladimore|Yu76435@plo|Gare|Royalmalo|MKL|manager|Marketting|Nairobi|Kenya|
        #| fanibash|Yu76@plo|Dare|yola|marksons|Director|management|Califonia|USA|
        #| lukeada|76435@plo|Gini|Royal|TK ent|manager|HR|London|United Kingdom|
       # | Agnesis24|Gui_u8Tr|humodory|yolamo|Afcon|Accountant|Accounts|Leeds|United Kingdom|
