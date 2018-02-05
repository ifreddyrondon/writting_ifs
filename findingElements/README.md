# Sensar listar para encontrar elementos

## Contexto

En el contexto de la programación orientada a objetos existe el concepto de colecciones, recurentemente los programadores tienen que saber si una colección contiene tal o cual elemento y tomar partida sobre el resultado de la operación de búsqueda. Este es un problema recurrente que deriva en la escritura de código tal como se muestra a continuación (pseudo-código):

```
    // Valor por defecto
    Tipo elemento = coleccion.encontrar( candidato );

    si ( elemento == null) {
        devolver valorPorDefecto;
    }

    devolver elemento;
```
        
```
    // Arrojar Error
    Tipo elemento = coleccion.encontrar( candidato );

    si ( elemento == null) {
        arrojar error
    }

    devolver elemento;
```
        
```
    // Hacer algo ante la ausencia del elemento
    Tipo elemento = coleccion.encontrar( candidato );

    si ( elemento == null) {
        hacer algo
    }

    devolver elemento;
```

Apalancandonos en el projecto [Dealing With Null Gracefully][dealingWithNull] podemos implementar un comportamiento similiar a este pero para colecciones.



[dealingWithNull]: ../dealingWithNull
