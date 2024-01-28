# Herramienta "Throw" y la extencion de la clase "Exception" en Java

El manejo de excepciones y errores en la programación es una técnica que se usa para controlar errores durante la ejecución del programa. Cuando un error se presenta, el sistema reacciona ejecutando un fragmento de código que resuelva la situación, ya sea enviando un mensaje o devolviendo un valor.

El método throw en Java se utiliza para lanzar una excepción explícitamente en un bloque de código. Permite al programador indicar que ha ocurrido una situación excepcional que no puede ser manejada dentro del contexto actual y que debe ser tratada por otro código.

**¿Qué funciones cuenta el método throw?**

Se puede para lanzar una instancia de una excepción personalizada o predefinida en Java. Permitiendo al programador indicar que ha ocurrido.
También cuando se lanza una excepción “throw”, la ejecución del bloque de código actual se detiene de inmediato, buscando un bloque “catch” apropiado para manejar la situación, en caso de que no encuentre un bloque “catch” apropiado, esta excepción se propaga hacia la pila de llamadas hasta que encuentre un bloque “catch” que pueda manejar esta excepción.
Este método normalmente se utiliza para controlar el flujo de ejecución en situaciones excepcionales, es decir, situaciones que pasan rara vez.
