# Mitigar estructuras de control de flujo (Ifs, switches)Contexto

## Avolir FlowType Enum (tearFlowTypeDown)

En las APPs se estan sumando distintos flujos, de manera progresiva, los cuales nos fuerzan a estar preguntando continuamente en qué flujo estamos y esto se traduce en la siguiente estructora (paradigma estructurado). 

[Proyecto][tearFlowTypeDown] donde se evalua una alternativa a la utilización de ```switch```.


## Manejando null apropiadamente (dealingWithNull gracefully)

En el contexto de Java (ocurre en otros leguajes también) existe el dato primitivo ```null``` que es ajeno a la teoría de objetos. Esto no es grave per se aunque fuerza que los programadores verifiquen este valor utilizando la instrucción ```if```. 

Creamos un [proyecto][dealingWithNull] donde se evalua una alternativa a la utilización del ```null``` y las estructuras de control que permiten el senso del valor (```if```).



## Manejando de exisitencia/ausencia de elementos en colecciones (findingElements)

En el contexto de la programación orientada a objetos existe el concepto de colecciones. Recurentemente los programadores tienen que saber si una colección contiene tal o cual elemento y tomar partida sobre el resultado de la operación de búsqueda. 

Creamos un [proyecto][findingElements] donde se evalua una alternativa a la utilización del ```null``` y las estructuras de control que permiten el senso del valor (```if```) aplicandolo a la búsqueda de elementos en colecciones..


---

## Contact

Mail: diego.sanchez@mercadolibre.com
Twitter: https://twitter.com/dsminotauro


[tearFlowTypeDown]: ./tearFlowTypeDown
[dealingWithNull]: ./dealingWithNull
[findingElements]: ./findingElements
