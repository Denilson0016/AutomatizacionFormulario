Feature: Test form functionality
various personal details are entered into the form and then submitted

    Scenario: Go to webSite
    Given entry to the page
    When ignore security restriction
    Then can i go to the form page

Scenario: As a user, I want the titles of the fields corresponding to Neighborhood and Message to be well written.
    Given look for the neighborhood label
    And look for the message label
    Then the labels are well written

 Scenario Outline: As a user, I enter all the data correctly and submit the form
    Given I write correctly the data in the field of nombre<name>
    And I write correctly the data in the field of correo<email>
    And I write correctly the data in the field of barrio<neighborhood>
    And I write correctly the data in the field of asunto<affair>
    And I write correctly the data in the field of mensaje<message>
    When I send the information
    But I should not see an error message
    Examples: 
                |name      |email              |neighborhood |affair       |message           |
                |Denilson  |dagudelo@gmail.com |Calarca      |consulta     |consultar puntaje |   


    Scenario: As a user, I leave all the fields blank and submit the form
    Given I send the form, without filling the text fields
    Then I should see an error message

    Scenario Outline: I, as a user, enter incorrect data in the text fields
    Given I write incorrectly the data in the field of nombre<name>
    And I write incorrectly the data in the field of correo<email>
    And I write incorrectly the data in the field of barrio<neighborhood>
    And I write incorrectly the data in the field of asunto<affair>
    And I write incorrectly the data in the field of mensaje<message>
    When I send the incorrect information
    Then I should see an error alert on
    Examples: 
                |name      |email   |neighborhood |affair  |message       |
                |D         |d-m     |Ca           |co      |p       |   

    Scenario: I, as a user, want to reload the page, entering option Caso 1, in the header
    Given I enter in the option Caso1, in the header
    But I should not see a page not found error