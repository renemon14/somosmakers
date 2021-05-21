Feature: Prueba tecnica - Automatizacion

  Scenario: Segundo escenario - Manejo de selenium
    Given I want to navigate in the site: "Somos Makers"
    When I select to the Menu Contacto.
    Then I get cellphone number.
    And I fill the form.
    And Send form.