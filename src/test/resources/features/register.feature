@register
Feature: User Registration Flow

  Scenario Outline: David completes account registration and deletion

    Given <actor> is on the Automation Exercise home page



    When <actor>  registers a new account with valid personal information

      | <inputname> | <email> | <password> | <days> | <months> | <year> | <firstname> | <lastname> | <company> | <Address> | <country> | <state> | <city> | <zipcode> | <mobile> |

    Then <actor> should be logged in and able to delete the account successfully



    Examples:

      | actor | inputname | email               | password   | days | months | year | firstname | lastname | company   | Address           | country       | state   | city     | zipcode | mobile    |
      | David | David     | david@micorreo.com  | miclave134 | 15   | 2      | 1995 | Pedro     | Perez    | miempresa | fake adresss 123  | United States | Florida | Miami    | 2223    | 323223232 |
      | Caro  | Vegeta    | Vegeta@micorreo.com | miclave133 | 23   | 10     | 2000 | Juan      | Diaz     | cocacola  | miami north 12367 | Canada        | Quebec  | Montreal | 3213    | 332132123 |
