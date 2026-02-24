# Account_Bank Project Instructions

Create the project **Account_Bank** that will receive data via the terminal containing the bank account characteristics according to the attributes below:
Inside the project, create the class **AccountTerminal.java** to implement all the program code.
Review rules for variable declaration.

**Attribute** **Type** **Example**  
Number Integer 1021  
Agency Text 067-8  
Client Name Text NIVALDO BEIRAO  
Balance Decimal 237.48

Review terminal, `main` args and the `Scanner` class.
Allow the data to be entered via the terminal so that the user receives a message indicating which information is being requested, for example:
Program: "Please, enter the Agency number!"
User: 1021 (then ENTER to go to the next field)

Review concatenation and the `String` class with the `concat` method.
After all information has been entered, the system must display the following message:
"Hello [ClientName], thank you for opening an account with our bank; your agency is [Agency], account [Number], and your balance [Balance] is now available for withdrawal."

The fields in [ ] must be replaced by the information entered by the users.
