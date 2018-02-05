# Descartar la verificación de Null

## Contexto

En el contexto de Java (ocurre en otros leguajes también) existe el dato primitivo ```null``` que es ajeno a la teoría de objetos. Esto no es grave per seaunque fuerza que los programadores verifiquen este valor utilizando la instrucción ```if```. 

En general, la ausencia de valor (```null```) implica que el desarrollador desempeñe algunas de las siguientes tareas:
- Lanzar una exceptcion.
- Devolver un valor por defecto.
- Invocar un bloque de código (Lambda o cualquier otra forma).

Como alternativa a plagar el código verificando si el valor de la variable es ```null``` o no planteamos la clase ```Maybe```.

## Consecuencias negativas

- Caída de cobertura por falta de tests.
- Viola el principio [DRY](https://en.wikipedia.org/wiki/Don%27t_repeat_yourself)

## Alternativa

Aplicación de patrón [Maybe](https://wiki.haskell.org/Maybe) inspirado en la programación funcional. 

Hoy día en Java 8 existe [Optional<T>](https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html) que cumple la función del ```Maybe```.  Para aquellos proyectos que no han migrado aún a Java 8 pueden utilizar este patrón.

