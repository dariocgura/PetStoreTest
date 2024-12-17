@testStore
Feature: POST/GET Store

  @t1
  Scenario Outline: Crear orden

    When creo la orden con id <id>, petId <petId>, quantity <quantity>
    Then el código de respuesta es 200

    Examples:
      | id | petId | quantity |
      | 1  |1      |1         |



  @t2
  Scenario Outline: Consultar orden

    When consulto la orden con id <id>
    Then el codigo de respuesta <code>
    #And verifico el <id> que regresa
    Examples:
      | id | code |
      | 2  | 200  |
      | 1  | 200  |


