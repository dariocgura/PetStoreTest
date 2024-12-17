@testStore
Feature: POST/GET Store

  @t1
  Scenario Outline: Crear orden

    When creo la orden con id <id>, petId <petId>, quantity <quantity>
    Then el código de respuesta es 200
    And el campo "quantity" es <quantity>
    And el campo "status" es "placed"
    And el petId "petId" es <petId>

    Examples:
      | id | petId | quantity |
      | 1  | 1     | 1        |
      | 2  | 2     | 2        |


  @t2
  Scenario Outline: Consultar orden

    When consulto la orden con id <id>
    Then el codigo de respuesta <code>
    And el campo "id" es <id>
    And el campo "status" es "placed"

    Examples:
      | id | code |
      | 2  | 200  |
      | 1  | 200  |


