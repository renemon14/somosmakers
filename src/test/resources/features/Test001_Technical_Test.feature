Feature: Prueba tecnica - Automatizacion

  Background:
    Given following parameters:
      | fecha | portafolio | nominal | precio | total |
      | 15/05/2020 | OBL-MODER | 123000 | 23.65 | 2908950 |
      | 15/05/2020 | OBL-MODER | 10000 | 25.00 | 250000 |
      | 15/05/2020 | OBL-RIESGO | 1276987 | -10.20 | -13023267 |
      | 15/05/2020 | OBL-RIESGO | 123000 | 1.29 | 160670 |

  Scenario: Primer escenario - Calculos y cruce informacion
    When Calculate totals


  Scenario: Segundo escenario - Manejo de selenium
    Given I want to navigate in the site: "Somos Makers"
    When I select to the Menu Contacto.
    Then I get cellphone number.
    And I fill the form.
    And Send form.
