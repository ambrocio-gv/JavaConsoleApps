##Title
Improved ThemePark - Console App

##Introduction
Learn the concept of using arrays in extension with the previous theme park project.

##Description
	A theme park uses two types of tickets that customers may purchase. Single-Access Tickets are valued
at the exact cost of a specific attraction and can only be used once. For example, a single-access ticket
for the roller coaster has exactly PHP 125.25 in credit, whicj is the exact cost of riding the roller 
coaster. All-access Tickets are available at PHP 500.00, containing PHP 500.00 in credit that can
be used for all attractions in the theme park. The cost for each attraction is deducted from the amount
stored on the all-access ticket. The amounf stored on an all-access ticket must be updated after it is 
is scanned and accepted. Single-access tickets should not be updated.
	The theme park is equipped with ticket scanners that verify the type and the value of each
ticket. Customers who have single-access tickets will always go to the correct attraction that they
have paid for. Customers who have all-access tickets will have the corresponding cost of the attraction 
deducted from the value stored on their tickets. If the all-access ticket does not have enought money,
the customer is not allowed to enter the attraction. Some customers provide incorrect information
when they have their single-access tickets scanned. Therefore, it is possible for a single-access ticket
to be rejected aas well. Some customers who have single-access tickets will not always specify the correct
attraction, they will only be allowed if the price of their single-access ticket is greater than or
equal to the cost of the attraction. In this case, the ticket scanner collects an amount equal to the 
specified attraction's cost and not the ticket price.
	Each ticket scanner keeps track of how much the theme park has collected from the attraction
payments from all the tickets that it has scanned. It also keeps track of how many single-access tickets
and how many all access tickets it has accepted. It keeps track of how many single-access tickets and 
how many all-access tickets it has accepted. It keeps track of how many customers have paid for each
attraction. Finally, it keeps track of how many tickets it has rejected because of insufficient credit.
	Since the theme park is fairly new, it currently has three attractions with fixed costs:
Roller Coaster (PHP 125.25), Ferris Wheel (PHP 81.81), and Carousel (PHP 49.49).

##Technologies
Java

##Date Completed
November 27, 2020
