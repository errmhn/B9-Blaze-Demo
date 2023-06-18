Feature: Auto Register Page Functionality
	@blaze
  Scenario Outline: Verify User able to Register
    Given User navigates to BlazeDemo Page "https://blazedemo.com/purchase.php"
    When User enters Full Name "<fullName>"
    And User enters Address "<address>"
    And User enters City "<city>"
    And User etners State "<state>"
    And User selects Zip Code "<zipCode>"
    And User selects Card Type "<card>"
    #| card1 | card2 | card3 |
    #| <c1>  | <c2>  | <c3>  |
    And User enters Credit Card Number "<creditCardNumber>"
    And User selects Credit Card Month "<creditCardMonth>"
    And User enters Credit Card Year "<creditCardYear>"
    And User enters Name on Card "<nameOnCard>"
    And User clicks on Remember Me checkbox
    And User clicks on Purchase Flight button
    Then User verifies thank you message "<message>"

    Examples: 
      | fullName | address | city         | state          | zipCode | card             | creditCardNumber | creditCardMonth | creditCardYear | nameOnCard  | message                            |
      | John     | Cena    | 123 drive st | a@abcgmail.com |   01652 | Visa             |     025362598659 |              03 |           2023 | John Cena   | Thank you for your purchase today! |
      | Hamza    | Cena    | 123 drive st | a@abcgmail.com |   01652 | American Express |     025362598659 |              03 |           2023 | Randy Orton | Thank you for your purchase today! |
      | Garry    | Cena    | 123 drive st | a@abcgmail.com |   01652 | Diner's Club     |     025362598659 |              03 |           2023 | Big Show    | Thank you for your purchase today! |
      | Reham    | Cena    | 123 drive st | a@abcgmail.com |   01652 | American Express |     025362598659 |              03 |           2023 | Undertaker  | Thank you for your purchase today! |
      | Reham    | Cena    | 123 drive st | a@abcgmail.com |   01652 | Diner's Club     |     025362598659 |              03 |           2023 | Hulk Hogan  | Thank you for your purchase today! |
