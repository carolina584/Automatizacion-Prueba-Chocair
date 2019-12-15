#Author: Carolina Muñoz
# encoding: utf-8
Feature: Servicios Chocair
  yo como usuario de chocair
  quiero ver la lista de servicios de chocair
  para consultar la informacion de los servicios

  Scenario: verificar navegacion hacia la pagina de servicios
    Given usuario ingresa a la aplicacion web de chocair
    When usuario selecciona la opcion Servicios
    Then usuario visualiza la pagina de Servicios
  
  Scenario Outline: validar subsección Portafolio de Soluciones
    Given usuario se encuentra en la pagina de servicios
    When usuario selecciona la opcion <opcion> en Portafolio de Soluciones
    Then usuario deberia visualizar la informacion <texto>
    
    
    Examples:
    |opcion           			 | texto 										 |
    |Pruebas de Usabilidad   | Pruebas de Usabilidad     |
    
  
  Scenario: verificar navegación hacia página de información sobre cursos y certificaciones
    Given usuario se encuentra en la pagina de servicios
    When usuario consulta la informacion de cursos y certificaciones
    Then usuario navega hacia la pagina de ver mas detalles
    
    
	
  
    
    
