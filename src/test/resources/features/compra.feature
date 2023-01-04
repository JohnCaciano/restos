#lenguage: en
Feature: Login Exitoso y Seleccion de productos por categoria en tu hogar online
  Scenario: Buscar en tu hogar online
    Given ingreso a tu hogar online e inicio sesion
    When  me encuentro en tu hogar online
    Then  busco producto y lo agrego al carrito